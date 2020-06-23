from payment import Payment

class Card(Payment):
    cardNUmber = int
    cvv        = int
    date       = str

    def __init__(self, paymentID, cardNUmber, cvv, date):
        super.__init__(paymentID)
        self.cardNUmber = cardNUmber
        self.cvv        = cvv
        self.date       = date