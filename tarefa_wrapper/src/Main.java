public class Main {
    public static void main(String[] args) {
        Numero1 numero1 = new Numero1();

        System.out.println("Numero 1:" + numero1.numero1);
        System.out.println("Numero 2:" + numero1.numero2);
    }

    static class Numero1 {
        public int numero1 = 10;
        public Integer numero2 = numero1;
    }
}
