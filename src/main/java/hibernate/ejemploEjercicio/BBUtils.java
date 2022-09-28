package hibernate.ejemploEjercicio;

import hibernate.Cancion;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.persistence.Query;
import java.util.List;

public class BBUtils {
    Session session;
    public static void guardarCancion(Cancion c1){
        Session session = HibernateUtils.getSession();
        Transaction t = session.beginTransaction();
        session.save(c1);
        t.commit();
    }
    public static List verCanciones() {
        Query query = HibernateUtils.getSession().createQuery("FROM Cancion");
        return query.getResultList();
    }
}
