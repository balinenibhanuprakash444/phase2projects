package com.ecommerce;

import org.apache.catalina.core.StandardService;

import com.mysql.cj.xdevapi.SessionFactory;

public class HibernateUtil {


   // private static final SessionFactory sessionFactory;

    static {
            try {
            //	StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                       // .configure("hibernate.cfg.xml").build();
       // Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
        //sessionFactory = metaData.getSessionFactoryBuilder().build();
            } catch (Throwable th) {
                    throw new ExceptionInInitializerError(th);
            }
    }

    public static SessionFactory getSessionFactory() {
		return null;
           // return sessionFactory;
    }

	private static Object configure(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
