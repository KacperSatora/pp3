import java.util.ArrayList;

public class ShoppingList {
    ArrayList<Product> shoppingList = new ArrayList<>();

    public void add(Product product) {
        shoppingList.add(product);
    }

    public int total() {
        return shoppingList.size();
    }

    @Override
    public String toString() {
        ArrayList<String> names = new ArrayList<>();
        for (Product product : shoppingList) {
            names.add(product.getName());
        }
        return String.join(",", names);
    }

    public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList();
        Product milk = new Product("milk", 2);
        Product apple = new Product("apple", 4);
        shoppingList.add(milk);
        shoppingList.add(apple);
        System.out.println(shoppingList);
        System.out.println(shoppingList.total());
    }
}
