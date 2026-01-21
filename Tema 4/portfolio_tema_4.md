# Portfolio - Tema 4: Programación Orientada a Objetos (POO) en Java

## 📚 Introducción

En el Tema 4 hemos profundizado en los conceptos fundamentales de la **Programación Orientada a Objetos (POO)** usando **Java**. Este tema abarca la creación de clases, objetos, constructores, métodos, atributos y enumeraciones.

---

## 🎯 Objetivos del Tema

- ✅ Entender los principios básicos de la POO
- ✅ Crear y utilizar clases en Java
- ✅ Implementar constructores con diferentes parámetros
- ✅ Definir atributos y métodos en las clases
- ✅ Usar enumeraciones (enums) para tipos definidos
- ✅ Instanciar objetos y trabajar con ellos
- ✅ Comprender la encapsulación y organización del código

---

## 📋 Contenidos Desarrollados

### 1. **Clase Persona** 👤
**Ubicación:** `prog/ud4/ejercicios/Persona.java`

Una clase que modela a una persona con:

#### Atributos:
- `nombre`: Nombre de la persona
- `apellido`: Apellido de la persona
- `edad`: Edad en años
- `estatura`: Altura en metros
- `dia`: Día de la semana asociado
- `sexo`: Género (MASCULINO, FEMENINO, NO_BINARIO)

#### Constructores:
- **Constructor vacío (default):** Inicializa con valores por defecto (Francisco, 54 años)
- **Constructor con parámetros:** Inicializa nombre, apellido, edad, estatura y sexo
- **Constructor completo:** Inicializa todos los atributos incluido el día

#### Métodos:
- `saludar()`: Imprime "Hola"
- `cumplirAños()`: Incrementa la edad en 1
- `crecer(float incremento)`: Aumenta la estatura

#### Enumeración Sexo:
```java
public enum Sexo {
    MASCULINO, FEMENINO, NO_BINARIO
}
```

---

### 2. **Clase Vaca** 🐄
**Ubicación:** `prog/ud4/ejercicios/Vaca.java`

Modelo simple de una vaca con:

#### Atributos:
- `nombre`: Nombre de la vaca
- `color`: Color de la vaca
- `hambre`: Estado booleano (verdadero si tiene hambre)

#### Métodos:
- `comer()`: Elimina el hambre (hambre = false)
- `mugir()`: Imprime "Muuu!"

**Concepto:** Introducción a los atributos booleanos y métodos que modifican el estado del objeto.

---

### 3. **Enumeración DiaDeLaSemana** 📅
**Ubicación:** `prog/ud4/ejercicios/DiaDeLaSemana.java`

Definición de una enumeración con los días de la semana:
```java
public enum DiaDeLaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES
}
```

**Concepto:** Las enumeraciones son tipos de datos especiales que representan un conjunto fijo de constantes.

---

### 4. **Clase Ciudad** (Main) 🏙️
**Ubicación:** `prog/ud4/ejercicios/Ciudad.java`

Clase principal que demuestra el uso de las clases anteriores:

#### Ejemplos de Código:
- Creación de objeto `Persona` con constructor parametrizado
- Acceso a atributos públicos de objetos
- Creación de múltiples instancias de `Persona`
- Concatenación de strings para mostrar información
- Uso de enumeraciones

```java
DiaDeLaSemana miercoles = DiaDeLaSemana.MIERCOLES;
Persona juan = new Persona("Juan", "Pérez", 20, 1.8f, Sexo.MASCULINO);
System.out.println("hola soy " + francisco.nombre + " y tengo " + francisco.edad + " años");
```

---

### 5. **Clase Vehiculo** 🚗
**Ubicación:** `prog/ud4/ejercicios3/Vehiculo.java`

Modelo más complejo que demuestra atributos diversos y lógica de negocio:

#### Atributos:
- `matricula`: Número de registro del vehículo
- `marca`: Fabricante
- `aniofabricacion`: Año de producción
- `precio`: Valor del vehículo
- `tipo`: Tipo de vehículo (usando enumeración TipoVehiculo)

#### Constructor:
- Inicializa todos los atributos del vehículo

#### Métodos:
- `mostrarInformacion()`: Muestra los datos del vehículo
- `esAntiguo()`: Retorna `true` si fue fabricado antes de 2016
- `aplicarDescuento(double porcentaje)`: Aplicará descuento al precio

---

### 6. **Enumeración TipoVehiculo** 🚙
**Ubicación:** `prog/ud4/ejercicios3/TipoVehiculo.java`

Enumeración que define los tipos posibles de vehículos.

---

## 🔑 Conceptos Clave Aprendidos

### Clases y Objetos
- **Clase:** Plantilla o blueprint para crear objetos
- **Objeto:** Instancia de una clase con valores específicos

### Atributos (Variables de Instancia)
- Características que definen el estado del objeto
- Pueden ser de tipo primitivo u objetos

### Constructores
- Métodos especiales que inicializan objetos
- Pueden tener parámetros o ser vacíos
- Permiten múltiples formas de crear un objeto

### Métodos
- Comportamientos que pueden ejecutar los objetos
- Pueden modificar el estado del objeto o retornar información

### Enumeraciones
- Tipos de datos que representan un conjunto constante de valores
- Mejoran la legibilidad y seguridad de tipos
- Ejemplo: Sexo, DiaDeLaSemana, TipoVehiculo

### Modificadores de Acceso
- **public:** Accesible desde cualquier lugar
- **private:** (no usado explícitamente, pero acceso por defecto es package-private)

---

## 📊 Estructura del Proyecto

```
Tema 4/
└── Ejercicios/
    └── eclipse/
        ├── src/
        │   └── prog/ud4/
        │       ├── ejercicios/
        │       │   ├── Persona.java
        │       │   ├── Vaca.java
        │       │   ├── DiaDeLaSemana.java
        │       │   └── Ciudad.java (Main)
        │       └── ejercicios3/
        │           ├── Vehiculo.java
        │           └── TipoVehiculo.java
        └── bin/
            └── (Archivos compilados .class)
```

---

## 💡 Habilidades Desarrolladas

1. ✅ **Creación de clases** desde cero
2. ✅ **Definición de atributos** de diferentes tipos
3. ✅ **Implementación de constructores** múltiples
4. ✅ **Creación de métodos** que interactúan con atributos
5. ✅ **Uso de enumeraciones** para tipos especiales
6. ✅ **Instanciación de objetos**
7. ✅ **Acceso a miembros** de un objeto
8. ✅ **Compilación y ejecución** de programas Java

---

## 🚀 Aplicaciones Prácticas

Los conceptos aprendidos en Tema 4 son fundamentales para:
- Desarrollar aplicaciones más complejas y organizadas
- Modelar entidades del mundo real en código
- Crear código reutilizable y mantenible
- Sentar las bases para conceptos avanzados (herencia, polimorfismo, interfaces)

---

## 📝 Conclusión

El Tema 4 ha proporcionado una sólida introducción a la **Programación Orientada a Objetos en Java**. Se han implementado clases que modelan entidades reales (Persona, Vaca, Vehiculo) y se ha comprendido cómo los objetos interactúan entre sí. Estos conocimientos son esenciales para cualquier desarrollador Java y sirven como base para conceptos más avanzados en POO.

---

**Autor:** David Carrero Jiménez  
**Fecha:** Enero 2026  
**Módulo:** Programación  
**Nivel:** UD4 - Introducción a la POO
