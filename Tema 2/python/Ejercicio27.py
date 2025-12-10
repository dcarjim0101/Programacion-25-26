import re
data = """
usuario = perez.juan
email = juan.perez@dominio.com
fecha = 15-09-2023
codigo = ABC123456
telefono = 601 234 567
archivos = a_1.txt, b_22.py, c_333.pdf, d_4444.jpg
"""
patron_email = r'\w+\.?\w+@\w+\.\w+'
print(re.findall(patron_email, data))

patron_fechas = r'\d{2}-\d{2}-\d{4}'
print(re.findall(patron_fechas, data))

patron_codigo = r'\w{3}\d{6}'
print(re.findall(patron_codigo, data))

patron_archivos = r'\w\_\d+\.py'
print(re.findall(patron_archivos, data))

# match
# search
# findall