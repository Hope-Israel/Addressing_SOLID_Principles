package violated;

//This code violates OCP because it requires modifying the
//position method in order to add a new employee posiiton
//such as manager
public class OCP {
    public class Employee {
        private String type;

        public Employee(String type) {
            this.type = type;
        }

        public void position() {
            if (type.equals("Cashier")){
                System.out.println("Cashier is working");
            } else if (type.equals("Bartender")){
                System.out.println("Bartender is working");
            }
        }
    }
}
