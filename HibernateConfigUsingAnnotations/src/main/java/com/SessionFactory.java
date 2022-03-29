package com;

import javax.websocket.Session;

public class SessionFactory {

	private static final SessionFactory sessionFactory = new SessionFactory();

    static {
            try {
                    //StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                                   // .configure("hibernate.cfg.xml").build();
                    //Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
                    //sessionFactory = metaData.getSessionFactoryBuilder().build();
            } catch (Throwable th) {
                    throw new ExceptionInInitializerError(th);
            }
    }

    public static SessionFactory getSessionFactory() {
            return sessionFactory;
    }

	public static Session openSession() {
		// TODO Auto-generated method stub
		return null;
	}
}
