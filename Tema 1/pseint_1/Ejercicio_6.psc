Algoritmo Ejercicio_6
	Definir a�o_nac, a�o_actual, edad Como Entero
	
	Escribir 'introduce tu a�o de nacimiento'
	Leer a�o_nac //date
	
	escribir "introduce el a�o en el que te encuentras"
	leer a�o_actual
	
	edad = a�o_actual - a�o_nac
	
	Si edad >= 18 Entonces
		Escribir 'alcanzas los 18 a�os, eres mayor de edad'
	SiNo
		Escribir 'no alcanzas los 18 a�os, eres menor de edad'
	FinSi
FinAlgoritmo
