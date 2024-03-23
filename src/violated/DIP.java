package violated;

public class DIP {
    class Driver {
        private Car car;

        public Driver() {
            this.car = new Car();
        }
        public voide drive(){
            car.start();
            car.stop();
        }
    }

    class Car{
        public void start() {
            
        }
    }
}
