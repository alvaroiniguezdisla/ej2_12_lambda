package dominio;
import java.util.stream.Stream;

public class ej2_12_lambda {
    public static int fibonacci(int n){
        return Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]}).limit(n).map(f -> f[0]).reduce(0, (a, b) -> b);
    }
}
