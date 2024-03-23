package solved;

//This aligns with DIP because the person class now depends on the car interface
//instead of the car class.

public class DIP {

    //car interface
    interface Car {
        void start();
        void stop();
    }

    //Person class
    class Person {
        private Car car;

        public Person(Car car){
            this.car = car;
        }

        //Method to drive car
        public void drive() {
            car.start();
            car.stop();
        }


        //implementing car interface with Vehicle class
        class Vehicle implements Car {
            public void start() {

            }

            public void stop(){

            }
        }
    }
}
