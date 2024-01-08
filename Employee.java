public class Employee {
    private String employeeId;
    private String name;
    private String branch;

    public Employee(String employeeId, String name, String branch) {
        this.employeeId = employeeId;
        this.name = name;
        this.branch = branch;
    }

    class Employee {
        private String id;
        private String name;
        private String restaurantid;

        public Employee(String id, String name, String restaurantid) {
            this.id = id;
            this.name = name;
            this.restaurantid = restaurantid;
        }

        public String getId() {
            return id;
        }

        public String getrestaurantid() {
            return restaurantid;
        }
    }
}
