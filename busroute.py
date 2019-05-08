def calculate(distance,no_of_passengers):
    Price_per_litre= 70
    Mileage_of_the_bus_in_km= 10
    Price_per_ticket = 80
    a=no_of_passengers*Price_per_ticket 
    b=(distance/Mileage_of_the_bus_in_km)*Price_per_litre
    if(a>=b):
        profit= a-b
        return profit
    else:
        return -1
    #Remove pass and write your logic here



#Provide different values for distance, no_of_passenger and test your program
distance=20
no_of_passengers=50
print(calculate(distance,no_of_passengers))
