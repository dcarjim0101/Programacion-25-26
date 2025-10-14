def cuantas_vocales (texto):
    cuenta = texto.count("a") + texto.count("e") + texto.count("i") + texto.count("o") + texto.count("u")
    return cuenta

def cambiar_v (v):
    return v.replace("a", "x").replace("e", "x").replace("i", "x").replace("o", "x").replace("u", "x")

palabra = str(input("escribe una palabra: "))
print(cuantas_vocales(palabra))
print(cambiar_v(palabra))