# language: es
Característica: Escribir feedback
  Para escribir feedback
  Como un usuario
  Quiero tener un cuadro de texto donde escribir un feedback
  Escenario: Escribir feedback
    Dado un texto pasado por el cuadro de texto "La aplicación me encanta"
    Cuando pulse a "Submit"
    Entonces la salida debería de ser "true"