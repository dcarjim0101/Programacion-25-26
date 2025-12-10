p = [[5.0,10.5],[8.2,15.0],[1.5,3.0]]

#for fila in p:
    #for elemento in fila:
        #elemento = elemento + elemento
    #print(elemento)
    
suma=0
for i in range(len(p)):
        suma += p[i][1]
print(f"la suma es: {suma}")

i=0
while i < len(p):
    suma = suma + p[i][1]
    