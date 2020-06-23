class PayPal extends Payment{

    String email;

    public PayPal(Integer paymentID, String email){
      super(paymentID);
      this.email = email;
    }
    
}