nombre = str(input("introduce el usuario: "))
clave = str(input("introduce la clave: "))

while (len(clave) < 8):
    clave = str(input("introduce la clave: "))
print ("bienvenido ", nombre)