original = [1,2,3,4,5]

copia1 = original.copy()
copia2 = original[:]
copia3 = []
for e in original:
    copia3.append(e)
copia4 = original
copia4.remove(5)
copia3.remove(1)

print("el array original es: ", original)
print("la copia con copy: ", copia1)
print("la copia con slicing: ", copia2)
print("la copia manual: ", copia3)
print(copia4, original)
print(copia3, original)