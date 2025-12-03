# Trabajo-de-consulta
<html>
<body>
<!--StartFragment--><html><head></head><body><h1>Método de Simpson 1/3 en Scala</h1>
<p>Este documento resume el trabajo solicitado sobre <strong>funciones de orden superior</strong> y el <strong>método de Simpson 1/3</strong>, incluyendo:</p>
<ul>
<li>
<p>Tablas de resultados</p>
</li>
<li>
<p>Código en Scala (partes importantes)</p>
</li>
<li>
<p>Explicaciones breves</p>
</li>
<li>
<p>Funciones matemáticas utilizadas</p>
</li>
</ul>
<hr>
<h2>1. Función <code inline="">integracion</code> usando Simpson 1/3</h2>
<p>El método de Simpson 1/3 aproxima integrales definidas utilizando la fórmula:</p>
<p>
<img width="303" height="44" alt="image" src="https://github.com/user-attachments/assets/3de8f1c3-4bfa-4f9f-af8c-f14100eb380b" />

<p>Donde:</p>
<ul>
<li>
<p><code inline="">a</code> = límite inferior</p>
</li>
<li>
<p><code inline="">b</code> = límite superior</p>
</li>
<li>
<p><code inline="">f(x)</code> = función a integrar</p>
</li>
<li>
<p><code inline="">x̄ = (a + b) / 2</code></p>
</li>
</ul>
<h3>Código principal en Scala</h3>
<pre><code class="language-scala">// Función de orden superior que recibe una función f
// y los límites a y b

def integracion(f: Double =&gt; Double, a: Double, b: Double): Double = {
  val xMedio = (a + b) / 2.0
  val resultado = ((b - a) / 6.0) * (f(a) + 4 * f(xMedio) + f(b))
  resultado
}
</code></pre>
<p><strong>Explicación breve:</strong></p>
<ul>
<li>
<p>Se recibe una función matemática como parámetro → ejemplo de <em>Higher Order Function</em>.</p>
</li>
<li>
<p>Se calcula el punto medio.</p>
</li>
<li>
<p>Se aplica directamente la fórmula de Simpson.</p>
</li>
</ul>
<hr>
<h2>2. Aproximaciones de integrales dadas</h2>
<p>A continuación se presenta una tabla con los valores esperados y los valores aproximados usando <code inline="">integracion</code>.</p>
<h3>Tabla de aproximaciones</h3>

Nº | Integral | f(x) | Intervalo | Valor esperado | Valor obtenido (Simpson)
-- | -- | -- | -- | -- | --
1 | ∫₃⁵ (-x² + 8x - 12) dx | -x² + 8x - 12 | [3, 5] | 7.33 | integracion(...)
2 | ∫₀² 3x² dx | 3x² | [0, 2] | 8 | integracion(...)
3 | ∫₋¹¹ (x + 2x² − x³ + 5x⁴) dx | x + 2x² − x³ + 5x⁴ | [-1, 1] | 3.333 | integracion(...)
4 | ∫₁² (2x + 1)/(x² + x) dx | (2x+1)/(x²+x) | [1,2] | 1.09861 | integracion(...)
5 | ∫₀¹ eˣ dx | exp(x) | [0,1] | 1.71828 | integracion(...)
6 | ∫₂³ 1/(x-1) dx | 1/(x-1) | [2,3] | 0.828427 | integracion(...)
7 | ∫₀¹ 1/(1+x²) dx | 1/(1+x²) | [0,1] | 0.785398 | integracion(...)
<img width="847" height="255" alt="image" src="https://github.com/user-attachments/assets/13eb8949-7d23-40d0-a64e-82aa1c746452" />
<img width="772" height="666" alt="image" src="https://github.com/user-attachments/assets/a2b6c083-7a8a-4f00-8fcc-316f06d2a869" />


<hr>
<h2>4. Resumen</h2>
<ul>
<li>
<p>Se emplearon <strong>funciones de orden superior</strong> al enviar funciones matemáticas como parámetros.</p>
</li>
<li>
<p>Se implementó el <strong>método de Simpson 1/3</strong> para aproximar integrales definidas.</p>
</li>
<li>
<p>Se calcularon errores mediante una función adicional.</p>
</li>
<li>
<p>Las tablas permiten observar claramente resultados, funciones aplicadas y errores.</p>
</li>
</ul>
<hr>
</body>
</html>
