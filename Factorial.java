// V1: Implementación iterativa
public class Factorial {
 public static long calcular(int n) {
 long resultado = 1;
 for (int i = 1; i <= n; i++) {
 resultado = resultado * i;
 }
 return resultado;
 }
}
