package pruebajavasemana1julio21;

import java.util.Scanner;

public class PruebaJavaSemana1Julio21 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        int a, b;
        double c,d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite el primer número: ");
        a = sc.nextInt();
        System.out.print("Digite el segundo número: ");
        b = sc.nextInt();
        System.out.print("El resultado de la suma de " + a + " y " + b + " es: " + suma(a, b));
        System.out.println("");
        System.out.print("Digite el número a calculatr el cuadrado: ");
        c = sc.nextDouble();
        System.out.print("El resultado del cuadrado del número " + c + "es: " + cuadrado(c));
        System.out.println("");
        System.out.print("Digite el número para calcular el área del circulo: ");
        d = sc.nextDouble();
        System.out.print("El área del circulo con rádio "+d+" es: "+areaCirculo(d));
         */
        double num = -65.23;
        imprimirSigno(num);
    }

    public static int suma(int x, int y) {
        return x + y;
    }

    public static double cuadrado(double x) {
        return Math.pow(x, 2);
    }

    public static double areaCirculo(double r) {
        return Math.PI * cuadrado(r);
    }

    public static double areaRectangulo(double a, double b) {
        return a * b;
    }

    public static float valorAbsoluto(float x) {
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    public static float numMayor(float x, float y) {
        if (x > y) 
            return x;
         else 
            return y;
        
        //si el if y el else solo tienen una línea de código no es necesario poner llaves 
    }
    
    public static float numMayorRes(float x, float y){
        return (x > y) ? x : y;
        //solo si cada uno tiene una linea de comando
    }
    
    public static void imprimirSigno(double x) {
        if (x >= 0.0)
            System.out.print("+");
        System.out.println(x);
    }

}
