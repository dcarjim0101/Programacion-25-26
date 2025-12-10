import re

buscar = r'\w{8}\^.{2}-\.{2}\d\d\d'
print(re.findall(buscar,texto))