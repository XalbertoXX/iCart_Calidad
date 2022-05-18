# language: es
Característica: Aparición de un producto en la lista de la compra
  Para mostrar elementos de la lista
  Como un desarrollador
  Quiero que no se repitan productos en la lista de la compra
  Escenario: Añadir productos
    Dado que he introducido "Manzana" en la lista
    Cuando la lista no lo encuentre
    Entonces la salida debería de ser "true"