public class SobrecargaMetodos {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        SobrecargaMetodos calc = new SobrecargaMetodos();

        System.out.println(calc.sumar(5,3));
        System.out.println(calc.sumar(5,3,2));
        System.out.println(calc.sumar(4.5,2.3));
    }
}