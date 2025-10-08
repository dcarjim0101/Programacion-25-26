Algoritmo calificacion
	definir nota como entero
	escribir "introduce una nota"
	leer nota
	
	si nota >= 0 y nota <=4 Entonces
		escribir "insuficiente"
		Si nota = 5 Entonces
			escribir "suficiente"
			si nota = 6 entonces
				escribir "bien"
				si nota >=7 y  nota <=8 Entonces
					escribir "notable"
					Si (nota >= 9 y nota <= 10) Entonces
						escribir "sobresaliente"
					SiNo
						escribir "su nota es incorrecta"
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
