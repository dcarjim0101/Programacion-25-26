original = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
resultado = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
for i in range (0,len(original),2):
    resultado.remove(original[i+1])
    print(i)

print(resultado)