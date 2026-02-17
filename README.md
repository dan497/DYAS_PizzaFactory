# Hecho por Daniel Riveros y Manuel Castillo
# DYAS – PizzaFactory (Abstract Factory)

Refactoring de la Parte I del taller de Diseño y Arquitectura de Software (Universidad de La Sabana).  
Se aplicó el patrón Abstract Factory para desacoplar la lógica principal de preparación de pizza de las implementaciones concretas de:
- Amasado
- Moldeado
- Horneado

La secuencia del proceso (amasar → moldear según tamaño → aplicar ingredientes → hornear) no cambia, pero el comportamiento sí cambia al modificar solo un archivo de configuración.

---

## Qué se implementó

### 1) Productos abstractos (interfaces)
En `src/main/java/edu/unisabana/pizzafactory/model/`:
- `Amasador`
- `Moldeador`
- `Horneador`

### 2) Fábrica abstracta y loader por configuración
En `src/main/java/edu/unisabana/pizzafactory/factory/`:
- `PizzaFactory` (Abstract Factory)
- `PizzaFactoryLoader` (carga la fábrica desde `pizza.properties` usando reflexión)

### 3) Fábricas concretas
En `src/main/java/edu/unisabana/pizzafactory/factory/`:
- `PizzaDelgadaFactory`
- `PizzaGruesaFactory`
- `PizzaIntegralFactory`

### 4) Productos concretos por variante
En `src/main/java/edu/unisabana/pizzafactory/model/`:
- Delgada (existentes, ahora implementan interfaces):
  - `AmasadorPizzaDelgada`
  - `MoldeadorPizzaDelgada`
  - `HorneadorPizzaDelgada`
- Gruesa:
  - `AmasadorPizzaGruesa`
  - `MoldeadorPizzaGruesa`
  - `HorneadorPizzaGruesa`
- Integral:
  - `AmasadorPizzaIntegral`
  - `MoldeadorPizzaIntegral`
  - `HorneadorPizzaIntegral`

### 5) Preparador desacoplado de implementaciones concretas
`src/main/java/edu/unisabana/pizzafactory/consoleview/PreparadorPizza.java` ya no instancia clases concretas con `new ...Delgada()`.  
Ahora depende únicamente de:
- `PizzaFactory`
- `Amasador`, `Moldeador`, `Horneador`

---

## Cómo ejecutar

Desde la raíz del proyecto:

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="edu.unisabana.pizzafactory.consoleview.PreparadorPizza"
