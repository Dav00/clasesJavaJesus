package hibernate.ejemploEjercicio;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static Session session;
    public static Session getSession(){
        if (session == null){
            Configuration config = new Configuration();
            config.configure("configuracionHibernate.xml");
            config.addAnnotatedClass(hibernate.Cancion.class);
            SessionFactory sessionFactory = config.buildSessionFactory();
            return sessionFactory.openSession();
        }
        return session;
    }
}

