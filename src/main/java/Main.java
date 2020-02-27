import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Customer.class)
                    .addAnnotatedClass(Product.class)
                    .buildSessionFactory();



    }
    public static void insProduct(SessionFactory factory, String title, double cost){
        Session session = null;
        try {
            session = factory.getCurrentSession();
            Product tmpProd = new Product();
            tmpProd.setTitle(title);
            tmpProd.setCost(cost);
            session.beginTransaction();
            session.save(tmpProd);
            session.getTransaction().commit();
        } finally {
            factory.close();
            session.close();
        }
    }
    public static void insCustomer(SessionFactory factory, String name){
        Session session = null;
        try {
            session = factory.getCurrentSession();
            Customer tmpCust = new Customer();
            tmpCust.setName(name);
            session.beginTransaction();
            session.save(tmpCust);
            session.getTransaction().commit();
        } finally {
            factory.close();
            session.close();
        }
    }
    public static void delCustomerById(SessionFactory factory, int id){
        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Customer customer = session.get(Customer.class,id);
            session.delete(customer);
            session.getTransaction().commit();
        } finally {
            factory.close();
            session.close();
        }
    }
    public static void delProductById(SessionFactory factory, int id){
        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Product product = session.get(Product.class,id);
            session.delete(product);
            session.getTransaction().commit();
        } finally {
            factory.close();
            session.close();
        }
    }
    public static void findAllCustomersByProdID (SessionFactory factory, int id){
        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Product product = session.get(Product.class,id);
            System.out.println(product);
            session.getTransaction().commit();
        } finally {
            factory.close();
            session.close();
        }
    }
    public static void findAllProductsByCustID (SessionFactory factory, int id){    Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Customer customer = session.get(Customer.class,id);
            System.out.println(customer);
            session.getTransaction().commit();
        } finally {
            factory.close();
            session.close();
        }}
}
