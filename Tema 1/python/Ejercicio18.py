
def es_triangulo(a, b, c):
    return (a + b > c) and (a + c > b) and (b + c > a)

def tipo_triangulo(a, b, c):
    if a == b == c:
        return "Equilatero"
    elif a == b or b == c or a == c:
        return "Isosceles"
    else:
        return "Escaleno"

a = float(input("introduce el primer lado: "))
b = float(input("introduce el segundo lado: "))
c = float(input("introduce el tercer lado: "))

if es_triangulo(a, b, c):
    print(f"los lados forman un triangulo {tipo_triangulo(a, b, c)}.")
else:
    print("los lados no pueden formar un triangulo.")
