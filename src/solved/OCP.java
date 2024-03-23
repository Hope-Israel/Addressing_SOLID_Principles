package solved;

//Adding a new job position interface will not require modification to the code
//You can just use the position interface to add a new class
//Employee doesn't need to be modified but can now be extended

    interface Position{
        void work();
    }

    class Cashier implements Position{
        @Override
        public void work(){
            System.out.println("Cashier is working");
        }
    }

    class Bartender implements Position{
        @Override
        public void work(){
            System.out.println("Bartender is working");
        }
}

    class Manager implements Position {
        @Override
        public void work() {
            System.out.println("Manager is working");
        }

    }

public class OCP {
        public class Employee {
            private Position position;

            public Employee(Position position){
                this.position = position;
            }

            public void position(){
                position.work();
            }
        }
}


