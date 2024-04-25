package JAVA_ATIV_8;

import java.util.Scanner;


public class TRES_VALORES_crescente04 {


	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Digite o primeiro valor:");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor:");
        double valor2 = scanner.nextDouble();

        System.out.println("Digite o terceiro valor:");
        double valor3 = scanner.nextDouble();

       
        double temp;
        if (valor1 > valor2) {
            temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }
        if (valor2 > valor3) {
            temp = valor2;
            valor2 = valor3;
            valor3 = temp;
        }
        if (valor1 > valor2) {
            temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }

    
        System.out.println("Valores em ordem crescente:");
        System.out.println(valor1 + ", " + valor2 + ", " + valor3);

        scanner.close();
    }
}
	
	
	
	
	
	
	

