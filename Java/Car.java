

class Car {
private Integer id;
private String license;
private Account driver;
private Integer passenger;


public Car(final String license, final Account driver) {

    this.license = license;
    this.driver = driver;

}




public Integer getPassenger() {

    return passenger;
}

public void setPassenger(final Integer passenger) {

    if (passenger == 4) {

        this.passenger = 4;
    } else {

        System.out.println("Número de pasajeros incorrecto, favor asignar 4 pasajeros");
    }
}

public Integer getId() {
    return id;
}

public void setId(final Integer id) {
    this.id = id;
}

public String getLicense() {
    return license;
}

public void setLicense(final String license) {
    this.license = license;
}

public Account getDriver() {
    return driver;
}

public void setDriver(final Account driver) {
    this.driver = driver;
}

void printDataCar(){

    if(passenger != null){
System.out.println("License: " + license + " Driver Name: " + driver.name + " Passengers: " + passenger);

    }
}

}