import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {

    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    protected Integer passenger;


    public UberVan(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial ){
     super(license, driver);
     this.typeCarAccepted = typeCarAccepted;
     this.seatsMaterial = seatsMaterial;

    } 

    public UberVan( String license, Account driver){
        super(license, driver);
   
       }
    

    @Override
    public void setPassenger(Integer passenger) {
        if(passenger == 6){

            this.passenger = 6;
          
        }else{
    
            System.out.println("Número de pasajeros incorrecto, favor asignar 6 pasajeros");
        }
        
    } 

    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Licence: " + super.getLicense() + " Driver name: " + super.getDriver().name + " Passengers: " + passenger);
        System.out.println("Driver Email: " + super.getDriver().email + " Driver document: " + super.getDriver().document);


    }
    
}