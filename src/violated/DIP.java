package violated;

//This is a violation of DIP because the Person class depends on the
//Car class to function. The Person high level module depends on the low-level car modules
public class DIP {

    //person class
    class Person {
        private Car car;

        public Person() {
            this.car = new Car();
        }

        // drive method
        public void drive(){
            car.start();
            car.stop();
        }
    }

    //car class with start and stop methods
    class Car{
        public void start() {

        }

        public void stop(){

        }

    }
}
