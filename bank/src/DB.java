
import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class DB {
	private static final SessionFactory concreteSessionFactory;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Properties prop= new Properties();
			prop.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/bank");
			prop.setProperty("hibernate.connection.username", "root");
			prop.setProperty("hibernate.connection.password", "root");
			prop.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
			prop.setProperty("hibernate.hbm2ddl.auto","update");
			
			concreteSessionFactory = new AnnotationConfiguration()
		   .addPackage("com.concretepage.persistence")
				   .addProperties(prop)
				   .addAnnotatedClass(User.class)
				   .addAnnotatedClass(Posts.class)
				   .buildSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static Session getSession()
			throws HibernateException {
		return concreteSessionFactory.openSession();
	}
	
//	public static Session getOpenSession(){
//		Session session=getSession();
//		Transaction t= session.beginTransaction();
//		//User user=(User)session.get(User.class, new Integer(1));
//		//System.out.println(user.getUsername());
//		//session.close();
//		t.ge
//		t.commit();
//		return session;
//	}
	}

