import java.util.stream.LongStream;
// V3: Implementación funcionalv
public class Factorial {
 public static long calcular(int n) {
 return LongStream
 .rangeClosed(1, n)
 .reduce(1, (a, b) -> a * b);
 }
}