from payment import Payment
class Paypal(Payment):
    email = str

    def __init__(self, paymentID, email):
        super.__init__(paymentID)
        self.email = email