Algoritmo Ejercicio37
	definir a, b Como Entero
	escribir "introduce dos numeros mayores que 0"
	leer a
	leer b
	
mientras b <> 0 Hacer

	si a > b Entonces
		a <- a - b
	SiNo
		b <- a - b
	FinSi
FinMientras

	
FinAlgoritmo