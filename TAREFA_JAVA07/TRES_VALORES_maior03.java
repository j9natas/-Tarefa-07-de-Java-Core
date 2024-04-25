package JAVA_ATIV_8;

import java.util.Scanner;


public class TRES_VALORES_maior03 {

	
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        
        System.out.println("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();
        
       
        double maior1, maior2;
        
        if (valor1 > valor2 && valor1 > valor3) {
            maior1 = valor1;
            maior2 = Math.max(valor2, valor3);
        } else if (valor2 > valor1 && valor2 > valor3) {
            maior1 = valor2;
            maior2 = Math.max(valor1, valor3);
        } else {
            maior1 = valor3;
            maior2 = Math.max(valor1, valor2);
        }
        

        double soma = maior1 + maior2;
        System.out.println("A soma dos dois maiores valores é: " + soma);
        

        scanner.close();
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

