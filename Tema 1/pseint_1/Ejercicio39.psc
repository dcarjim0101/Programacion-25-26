Algoritmo Ejercicio39
	definir n como entero
	escribir "introduce un numero: "
	leer n
	
	si n < 1 Entonces
		escribir n "no es primo"
	SiNo
		para i=2 hasta n-1
			si a mod i=0
				escribir "no es primo"
				break
			FinSi
		FinPara
	FinSi
FinAlgoritmo
