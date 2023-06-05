package selfTraining.Constructor;
    public class Car {
            String color;
            String engine;
        Car(String цвет, String мотор) {  //constructor with parameters (never has RETURN type)
            color = цвет;
            engine = мотор;
        System.out.println("Цвет машины " + color + "мотор " + engine);
    }
}
    class CarInfo {
        public static void main(String[] args) {
            Car car1 = new Car("черныи, ", "V8");  //new object
            Car car2 = new Car("белыи, ", "V4");   //new object
            Car car3 = new Car("желтыи, ", "V6");  //new object
    }
}