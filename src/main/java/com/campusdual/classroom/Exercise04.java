package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {

        System.out.println("Ejemplos de cálculos SIN estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + (1 + 2 + 3 + 4 + 5));
        System.out.println("Suma de los primeros 20 números pares: " + (2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 + 18 + 20 + 22 + 24 + 26 + 28 + 30 + 32 + 34 + 36 + 38 + 40));
        System.out.println("Obtén el factorial del número 7 → (7!): " + (7 * 6 * 5 * 4 * 3 * 2 * 1));
        System.out.println("######################################################################");
        System.out.println("Ejemplos de cálculos CON estructuras de control:");
        System.out.println("Suma de los primeros 5 números: " + sumNum(5));
        System.out.println("Suma de los primeros 20 números pares: " + sumEvenNum(20));
        System.out.println("Obtén el factorial del número 7 → (7!): " + factorial(7));
        System.out.println("Obtén el factorial del número 7 usando recursividad → (7!): " + recursiveFactorial(7));

    }

    public static int sumNum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum= sum + i;
        }
        return sum;
    }
  public static int sumEvenNum2(int number){
        int num = 0;
        int resultado = 0;
        for (int i = 0; i < number; i++) {
           num = nextPar(num);
           resultado = resultado + num;
        }
        return resultado;
    }
    private static int nextPar(Integer num){
        num++;
        while (isPar(num) == 0) {
            num++;
        }
        return num;
    }
    public static int sumEvenNum(int num) {
        int sum = 0;
        int cont = 0;
        int i = 0;
        while(cont <= num){
            sum = sum + (isPar(i)*i);
            if (isPar(i) == 1){
                cont++;
            }
            i++;
        }
        return sum;
    }
    private static int isPar(Integer num){
        if (num % 2 == 0) {
            return 1;
        }
        return 0;
    }
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int recursiveFactorial(int num) {
        if (num == 0){
            return 1;
        } else {
            return num * recursiveFactorial(num - 1);
        }
    }
}
