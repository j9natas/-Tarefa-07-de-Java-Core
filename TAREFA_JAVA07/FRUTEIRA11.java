package JAVA_ATIV_8;

import java.util.Scanner;


public class FRUTEIRA11 {

	
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.println("Digite a quantidade de morangos (em Kg):");
	        double kgMorangos = scanner.nextDouble();

	     
	        System.out.println("Digite a quantidade de maçãs (em Kg):");
	        double kgMaca = scanner.nextDouble();

	        
	        double precoMorangos = kgMorangos * 2.5; 
	     
	        
	        double precoMaca = kgMaca * 1.8; 

	      
	        double precoTotal = precoMorangos + precoMaca;

	        
	        if (kgMorangos + kgMaca > 8 || precoTotal > 25) {
	            double desconto = precoTotal * 0.1; // 
	            precoTotal -= desconto;
	        }

	        
	        System.out.println("O valor a ser pago pelo cliente é: R$" + precoTotal);

	        scanner.close();
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

