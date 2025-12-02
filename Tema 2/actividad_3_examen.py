import re

texto = "El Python es un lenguaje de programación muy popular. Python se usa en ciencia de datos y desarrollo web."

# 1
texto_minusculas = texto.lower()

palabras = texto_minusculas.split()

conteo = palabras.count("python")

print("la palabra python aparece: ", conteo, "veces")


# 2
texto_mayusculas = texto.upper()

palabras_cortadas2 = texto_mayusculas.split()

palabras_invertidas = palabras_cortadas2[::-1]

resultado = " ".join(palabras_invertidas)

print(resultado)