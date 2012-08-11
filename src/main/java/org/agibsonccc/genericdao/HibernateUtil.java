
package org.agibsonccc.genericdao;
import org.hibernate.SessionFactory;

public class HibernateUtil {
	private static  SessionFactory sessionFactory;
	
	public static void setSessionFactory(SessionFactory sessionFactory) {
		HibernateUtil.sessionFactory=sessionFactory;
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
