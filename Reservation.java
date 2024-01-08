import java.util.List;

public class Reservation {
    private int reservationId;
    private String customerName;
    private Employee employee;
    private TableType tableType;
    private int numPeople;
    private String status;
    private List<String> orderedItems;

    public Reservation(int reservationId, String customerName, Employee employee,
                       TableType tableType, int numPeople, String status) {
        this.reservationId = reservationId;
        this.customerName = customerName;
        this.employee = employee;
        this.tableType = tableType;
        this.numPeople = numPeople;
        this.status = status;
        this.orderedItems = new ArrayList<>();
        
        class Order {
            private String orderername;
            private string reservationid;
            private String employeeid;
            private int Totalperson;
            private String tabletype;

            public Order(String orderername, string reservationid, String employeeid, int totalperson, tabletype) {
                this.orderername = orderername;
                this.reservationid = reservationid;
                this.employeeid = employeeid;
                this.totalperson = totalperson;
                this.tabletype = tabletype;
            }

            public void displayOrderDetails() {
                System.out.println("Customer: " + orderername);
                System.out.println("Reservationid: " + reservationid);
                System.out.println("Table Type: " + tabletype);
                System.out.println("Total Person: " + totalperson);
                System.out.println("EmployeeId: " + employeeid);
            }
        }
        
        public class Reservation {
            public static void main(String[] args) {
                
                Map<String, Employee> employees = new HashMap<>();
                employees.put("E001", new Employee("E001", "John", "Jakarta"));
                employees.put("E002", new Employee("E002", "Alice", "Bandung"));

                Map<String, Order> orders = new HashMap<>();

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter employee ID: ");
                String employeeId = scanner.nextLine();

                if (employees.containsKey(employeeId)) {
                    Employee employee = employees.get(employeeId);

                    System.out.println("Welcome, " + employee.getName() + "!");

                    System.out.print("Enter orderer’s name: ");
                    String orderername = scanner.nextLine();

                    System.out.print("Enter total person: ");
                    int totalperson = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Enter table type: ");
                    String tableType = scanner.nextLine();

                    System.out.print("Enter restaurant id: ");
                    int restaurantid = scanner.nextInt();

                    
                    System.out.print("Is it a reservation (Y/N)? ");
                    String reservationInput = scanner.next();
                    scanner.nextLine(); 

                    if (reservationInput.equalsIgnoreCase("Y")) {
                        Order reservation = new Order(orderername, totalperson, tabletype, restaurantid, "Reserved");
                        orders.put(customerName, reservation);
                        System.out.println("Reservation successful!");
                    } else {
                        if (orders.containsKey(customerName)) {
                            
                            Order reservation = orders.get(customerName);
                            reservation.displayOrderDetails();
                            reservation.setStatus("Ordered");
                            System.out.println("Order placed successfully!");
                        } else {
                            System.out.println("No reservation found for the customer.");
                        }
                    }
                } else {
                    System.out.println("Invalid employee ID.");
                }
            }
        }
    }