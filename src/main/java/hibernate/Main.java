package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        //Configuramos el Hibernate
        Configuration config = new Configuration();
        config.configure("configuracionHibernate.xml");
        config.addAnnotatedClass(Cancion.class);

        //Creamos una Session Factory
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();

        Cancion c1 = new Cancion(1L , "Viva la vida", "Coldplay", 2015);

        session.beginTransaction(); //Creo una transaccion para hacer el insert
        session.save(c1); //Hago el insert
        session.getTransaction().commit(); //Comiteo los cambios de la transaccion

        session.close();
    }
}
