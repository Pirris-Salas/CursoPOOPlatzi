from payment import payment
class Cash(Payment):

    def __init__(self, paymentID):
        super.__init__(paymentID)