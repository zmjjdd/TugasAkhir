
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Example Usage
        Restaurant bandungRestaurant = new Restaurant("Bandung");
        Employee john = new Employee("1", "John", "Bandung");

        bandungRestaurant.addMenuItem("1", "Special Dish", 50);
        bandungRestaurant.addMenuItem("2", "Special Dessert", 30);
        bandungRestaurant.addMenuItem("3", "Local Dish", 25);

        bandungRestaurant.placeReservation(john, "Bob", TableType.GENERAL, 3);
        bandungRestaurant.orderItems(1, List.of("1", "3"));
        bandungRestaurant.checkout(1);

    }
    "jdbc:mysql://localhost:3306/reservasi_restoran";
    String user = "root";
    String password = "";
    Connection connection = DriverManager.getConnection(url, user, password);
}
