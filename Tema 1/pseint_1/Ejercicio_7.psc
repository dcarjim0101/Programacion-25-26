Algoritmo Ejercicio_7
	Definir nota1, nota2, nota3 Como Entero
	Definir media Como Real
	Escribir 'introduce la primera nota'
	Leer nota1 // int
	Escribir 'introduce la segunda nota' 
	Leer nota2 // int
	Escribir 'introduce la tercera nota' 
	Leer nota3 // int
	media <- (nota1+nota2+nota3)/3 // float
	Si media>=5 Entonces 
		Escribir 'la nota media es', ' ', media, ',', ' ', 'el alumno esta aprobado'
	SiNo
		Escribir 'la nota media es', ' ', media, ',', ' ', 'el alumno no esta aprobado'
	FinSi
FinAlgoritmo
