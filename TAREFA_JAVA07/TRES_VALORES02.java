package JAVA_ATIV_8;

import java.util.Scanner;


public class TRES_VALORES02 {

	
	
	
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.println("Digite o primeiro valor: ");
	        double valor1 = scanner.nextDouble();
	        
	        System.out.println("Digite o segundo valor: ");
	        double valor2 = scanner.nextDouble();
	        
	        System.out.println("Digite o terceiro valor: ");
	        double valor3 = scanner.nextDouble();
	        

	        if (valor1 > valor2 && valor1 > valor3) {
	            System.out.println("O maior valor é: " + valor1);
	        } else if (valor2 > valor3) {
	            System.out.println("O maior valor é: " + valor2);
	        } else {
	            System.out.println("O maior valor é: " + valor3);
	        }
	        
	       
	        scanner.close();
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

