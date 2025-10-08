Algoritmo Ejercicio_6
	Definir año_nac, año_actual, edad Como Entero
	
	Escribir 'introduce tu año de nacimiento'
	Leer año_nac //date
	
	escribir "introduce el año en el que te encuentras"
	leer año_actual
	
	edad = año_actual - año_nac
	
	Si edad >= 18 Entonces
		Escribir 'alcanzas los 18 años, eres mayor de edad'
	SiNo
		Escribir 'no alcanzas los 18 años, eres menor de edad'
	FinSi
FinAlgoritmo
