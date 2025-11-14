val generadorIncrementadorAnonimo: Int => (Int => Int) =
  (incremento: Int) =>
    (x: Int) =>
      x + incremento

def generadorIncrementador(incremento: Int,x: Int): Int =
  x + incremento
generadorIncrementador(5,5)