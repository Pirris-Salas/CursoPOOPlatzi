class Main {

public static void main(String[] args) {
    
//System.out.print("Hola Mundo ");
Car car = new Car("AMQ123", new Account("Andres Herrera", "And123"));
//car.license = "AMQ123";
//car.driver = "Andres Herrera";
car.passenger = 4;
//System.out.println("Car License: " + car.license);
car.printDataCar();

Car car2 = new Car("QWE567", new Account("Andrea Herrera", "Andrea1234"));
//car2.license = "QWE567";
//car2.driver = "Andrea Herrera";
car2.passenger = 3;

//System.out.println("Car License: " + car2.license);
car2.printDataCar();
}


}