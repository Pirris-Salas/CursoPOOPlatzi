class Card extends Payment{
    Integer cardNumber;
    Integer cvv;
    String date;

    public Card(Integer paymentID, Integer cardNumber, Integer cvv, String date){
        super(paymentID);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.date = date;

    }
}