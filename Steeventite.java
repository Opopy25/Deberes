package Actividad;

public class Steeventite {

    public static void main(String[] args) {
        int n = 20; // número de términos a sumar

        double sumatoria = 0;
        double denominador = 2;
        int contador = 0;

        while (contador < n) {
            double termino = 0;

            if (contador % 5 == 0) {
                termino = 5 / denominador;
                denominador += 10;
            } else if (contador % 2 == 0) {
                termino = 2 / denominador;
                denominador += 1;
            } else {
                termino = -7 / denominador;
                denominador += 1;
            }

            sumatoria += termino;
            System.out.println("Término " + (contador + 1) + ": " + termino);
            contador++;
        }

        System.out.println("Sumatoria de los primeros " + n + " términos: " + sumatoria);
    }
}
