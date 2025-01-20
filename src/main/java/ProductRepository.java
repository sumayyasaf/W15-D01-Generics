import java.util.ArrayList;
import java.util.List;

public class ProductRepository<T> {
    private List<T> items = new ArrayList<>();

    public void addProduct(T product){
        items.add(product);
    }
    public void removeProduct(T product){
        items.remove(product);
    }
    public List<T> getAllProducts(){
        return items;
    }

    public static void main(String[] args) {
        ProductRepository<Product> repository = new ProductRepository<>();
        repository.addProduct(new Product(1, "Laptop"));
        repository.addProduct(new Product(2, "Phone"));

        System.out.println(repository.getAllProducts());
    }
}
