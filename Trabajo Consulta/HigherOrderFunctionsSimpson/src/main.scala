object Main {

  def integracion(f: Double => Double, a: Double, b: Double): Double = {
    val xMedio = (a + b) / 2.0
    ((b - a) / 6.0) * (f(a) + 4 * f(xMedio) + f(b))
  }

  val f1 = (x: Double) => -x*x + 8*x - 12
  val f2 = (x: Double) => 3 * x * x
  val f3 = (x: Double) => x + 2*x*x - x*x*x + 5*Math.pow(x,4)
  val f4 = (x: Double) => (2*x + 1) / (x*x + x)
  val f5 = (x: Double) => Math.exp(x)
  val f6 = (x: Double) => 1 / (x - 1)
  val f7 = (x: Double) => 1 / (1 + x*x)

  def calcularError(valorEsperado: Double, valorObtenido: Double): Double = {
    Math.abs(valorEsperado - valorObtenido)
  }

  def main(args: Array[String]): Unit = {

    val esperados = List(7.33, 8, 3.333, 1.09861, 1.71828, 0.828427, 0.785398)

    val resultados = List(
      integracion(f1, 3, 5),
      integracion(f2, 0, 2),
      integracion(f3, -1, 1),
      integracion(f4, 1, 2),
      integracion(f5, 0, 1),
      integracion(f6, 2, 3),
      integracion(f7, 0, 1)
    )

    for (i <- resultados.indices) {
      val obtenido = resultados(i)
      val esperado = esperados(i)
      val error = calcularError(esperado, obtenido)

      println(s"${i+1}. Esperado: $esperado  Obtenido: $obtenido  Error: $error")
    }
  }
}
