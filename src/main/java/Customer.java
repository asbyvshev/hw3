import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id")
    private int id;
    @Column(name = "cust_name")
    private String name;
    @ManyToMany
    @JoinTable(
            name = "shop_cart",
            joinColumns = @JoinColumn(name = "cust_id"),
            inverseJoinColumns = @JoinColumn(name = "prod_id")
    )
    private List <Product> products;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

//    @Override
//    public String toString() {
//        return "Customer [" + id + " " + name + "]";
//    }

    @Override
    public String toString() {
        String allProducts = "";
        for (Product o : products) {
            allProducts += o.getTitle() + " ";
        }
        return "Product [" + id + " " + name + " " + allProducts + "]";
    }
}
