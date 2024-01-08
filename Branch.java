import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

enum TableType {
    ROMANTIC, GENERAL, FAMILY
}

public class Branch {
    private String name;
    private Map<TableType, Integer> maxCapacity;
    private Map<String, MenuItem> menu;
    private List<Reservation> reservations;
    
    class Branch {
        private String restaurantid;
        private String restaurantname;
        

        public Branch( String restaurantname, String restaurantid){
            this.restaurantid = id;
            this.restaurantname = restaurantname;
        }

        public String getrestaurantid() {
            return restaurantidd;
        }

        public String getrestaurantname() {
            return restaurantname;
        }
    }

    public Branch(String name) {
        this.name = name;
        this.maxCapacity = initializeMaxCapacity();
        this.menu = new HashMap<>();
        this.reservations = new ArrayList<>();
    }

    private Map<TableType, Integer> initializeMaxCapacity() {
        Map<TableType, Integer> capacity = new HashMap<>();
        capacity.put(TableType.ROMANTIC, 2);
        capacity.put(TableType.GENERAL, 4);
        capacity.put(TableType.FAMILY, 10);
        return capacity;
    }
