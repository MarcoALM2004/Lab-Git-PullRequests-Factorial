// V2: Implementación recursiva
public class Factorial {
 public static long calcular(int n) {
 if (n <= 1) {
 return 1;
 }
 return n * calcular(n - 1);
 }
}