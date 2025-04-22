package model;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Logica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, StandardCharsets.UTF_8);
        int numero = 0;
        int acumulador = 1;

        System.out.print("Insira um valor: ");
        numero = input.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i == acumulador) {
                System.out.print("\n");
                acumulador = acumulador + acumulador;
            }

            System.out.print("*");
        }
    }
}
