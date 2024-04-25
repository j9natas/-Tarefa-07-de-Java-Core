package JAVA_ATIV_8;

import java.util.Scanner;

public class ALGORITIMO08 {

	
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Digite o valor de x:");
	        int x = scanner.nextInt();

	        System.out.println("Digite o valor de y:");
	        int y = scanner.nextInt();

	      
	        int z = (x * y) + 5;
	        char resposta;

	       
	        if (z <= 0) {
	            resposta = 'A';
	        } else if (z <= 100) {
	            resposta = 'B';
	        } else {
	            resposta = 'C';
	        }

	       
	        System.out.println("A resposta é: " + resposta);

	        scanner.close();
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
