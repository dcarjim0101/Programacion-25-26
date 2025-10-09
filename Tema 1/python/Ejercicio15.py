year = int(input("introduce un año: "))

if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
    print(f"el año {year} es un año bisiesto")
else:
    print(f"el año {year} no es un año bisiesto")
