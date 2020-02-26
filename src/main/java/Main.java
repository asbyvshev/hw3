import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

            SessionFactory factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Customer.class)
                    .addAnnotatedClass(Product.class)
//                    .addAnnotatedClass(ShopCart.class)
                    .buildSessionFactory();
            // CRUD
            Session session = null;

        // READ
//
//        try {
////           // CREATE
//            session = factory.getCurrentSession();
//            Customer tmpCust = new Customer();
//            tmpCust.setName("Pupkin");
//            session.beginTransaction();
//            session.save(tmpCust);
//            session.getTransaction().commit();
//        } finally {
//            factory.close();
//            session.close();
//        }
//        try {
////           // CREATE
//            session = factory.getCurrentSession();
//            Product tmpProd = new Product();
//            tmpProd.setTitle("Audio sistem");
//            tmpProd.setCost(1.22);
//            session.beginTransaction();
//            session.save(tmpProd);
//            session.getTransaction().commit();
//        } finally {
//            factory.close();
//            session.close();
//        }

//        try {
////           // READ
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Product product = session.get(Product.class,2);
//            System.out.println(product);
//            session.getTransaction().commit();
//        } finally {
//            factory.close();
//            session.close();
//        }

//        try {
//////           // DELETE
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Product product = session.get(Product.class,4);
//            session.delete(product);
//            session.getTransaction().commit();
//        } finally {
//            factory.close();
//            session.close();
//        }
    }
}
