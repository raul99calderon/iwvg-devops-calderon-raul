package es.upm.miw.iwvg_devops.searches;

public class ArithmeticUtils {
    private static int mcd(int num1, int num2) {
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);

        int resultado;
        do {
            resultado = b;
            b = a % b;
            a = resultado;
        } while (b != 0);
        return resultado;
    }

    public static int mcm(int num1, int num2) {
        return (Math.max(num1, num2) / mcd(num1, num2)) *  Math.min(num1, num2);
    }
}
