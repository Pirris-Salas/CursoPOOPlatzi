from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    
    car = Car("BJF0130", Account("Luis Salas","DOC123"))
    print(vars(car))
    print(vars(car.driver))