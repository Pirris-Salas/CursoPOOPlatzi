from account import Account

class Car:
    id = int
    license = str
    driver = Account("","")
    passenger = int

    def _ini_(self, license, driver):
        self.license = license
        self.driver = driver