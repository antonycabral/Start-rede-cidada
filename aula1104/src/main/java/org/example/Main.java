package org.example;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner dados = new Scanner(System.in);

            System.out.println("Insira a altura: ");
            double height = dados.nextDouble();

            System.out.println("Insira a largura: ");
            double width = dados.nextDouble();

            System.out.printf("A área do retângulo é: %.2f%n",area(height, width));
            System.out.printf("O perímetro do retângulo é: %.2f%n",perimetro(height, width));
            System.out.printf("A diagonal do retângulo é: %.2f%n", diagonal(height, width));
        }

        static double area(double height, double width) {
            return height * width;
        }

        public static double perimetro(double height, double width) {
            return 2 * height + 2 * width;
        }

        static double diagonal(double height, double width) {
            return Math.sqrt(height*height + width*width);
        }
}