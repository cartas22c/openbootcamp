public class Main {
    public static void main(String[] args) {

        Main.sumaTresParametros(5, 2, 1);

        Coche miCoche = new Coche();
        miCoche.incrementaPuertas(5);


        System.out.println("Numero total de puertas " + miCoche.getNumPuertas());


    }

    public static int sumaTresParametros(int a, int b, int c) {
        return a + b + c;
    }
}