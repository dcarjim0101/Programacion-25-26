palabra = input("introduce una palabra: ")
print(palabra)
invertida = palabra[::-1]
print(invertida)

cadena = " juan.perez@dominio.com "
print(cadena.strip())
print(cadena.upper())
print(cadena.split("@"))

clase = "titulo"
contenido = "mi encabezado"
print(f"<p class=\"{clase}\">{contenido}</p>")