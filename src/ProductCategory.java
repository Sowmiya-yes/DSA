import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductCategory{

    static List<Product> products= new ArrayList<>();
    static final int LIGHT_WEIGHT = 10;
    static final int HEAVY_WEIGHT = 15;
    static final String GAMES = "games";
    static final String TOYS = "toys";

    public static void getProducts() {
        products.add(new Product("Video Game", 12.22, "games"));
        products.add(new Product("Console Game", 15.33, "games"));
        products.add(new Product("play station", 17.44, "games"));
        products.add(new Product("Teddy bear", 22.22, "toys"));
        products.add(new Product("Kitchedn Set", 5.33, "toys"));
        products.add(new Product("Gummy Bear", 10.44, "eatable"));
    }

    public static List<Product> getFilteredProducts(CheckProduct<Product> predicate, List<Product> products) {
        List<Product> filteredProducts = new ArrayList<>();
        for(Product product: products) {
            if(predicate.check(product))
                filteredProducts.add(product);
        }
        return filteredProducts;
    }

    public static void main(String[] args) {
        getProducts();
        CheckProduct<Product> lightWeightProducts = (product) -> product.weight < LIGHT_WEIGHT;
        CheckProduct<Product> heavyWeightProducts = (product) -> product.weight > HEAVY_WEIGHT;
        CheckProduct<Product> toyProducts = (product) -> product.category.equals(TOYS);
        CheckProduct<Product> gameProducts = (product) -> product.category.equals(GAMES);
        System.out.println("Light Weight " +  getFilteredProducts(lightWeightProducts, products));
        System.out.println("Heavy Weight " +  getFilteredProducts(heavyWeightProducts, products));
        System.out.println("Toys " +  getFilteredProducts(toyProducts, products));
        System.out.println("Games " +  getFilteredProducts(gameProducts, products));
    }
}
