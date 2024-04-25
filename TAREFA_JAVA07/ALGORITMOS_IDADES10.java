package JAVA_ATIV_8;


import java.util.Scanner;


public class ALGORITMOS_IDADES10 {

	
	
	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Digite a idade do primeiro homem:");
	        int idadeHomem1 = scanner.nextInt();

	        System.out.println("Digite a idade do segundo homem:");
	        int idadeHomem2 = scanner.nextInt();

	     
	        System.out.println("Digite a idade da primeira mulher:");
	        int idadeMulher1 = scanner.nextInt();

	        System.out.println("Digite a idade da segunda mulher:");
	        int idadeMulher2 = scanner.nextInt();

	   
	        int homemMaisVelho = Math.max(idadeHomem1, idadeHomem2);
	        int mulherMaisNova = Math.min(idadeMulher1, idadeMulher2);

	  
	        int homemMaisNovo = Math.min(idadeHomem1, idadeHomem2);
	        int mulherMaisVelha = Math.max(idadeMulher1, idadeMulher2);

	      
	        int somaIdades = homemMaisVelho + mulherMaisNova;

	      
	        int produtoIdades = homemMaisNovo * mulherMaisVelha;

	        
	        System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + somaIdades);
	        System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + produtoIdades);

	        scanner.close();
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

