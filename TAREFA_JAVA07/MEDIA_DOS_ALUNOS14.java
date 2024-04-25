package JAVA_ATIV_8;

import java.util.Scanner;


public class MEDIA_DOS_ALUNOS14 {

	
	
	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Digite a nota da primeira verificação:");
	        double nota1 = scanner.nextDouble();

	        System.out.println("Digite a nota da segunda verificação:");
	        double nota2 = scanner.nextDouble();

	        System.out.println("Digite a nota da terceira verificação:");
	        double nota3 = scanner.nextDouble();

	       
	        System.out.println("Digite a média dos exercícios:");
	        double mediaExercicios = scanner.nextDouble();

	        
	        double mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;

	       
	        String conceito;
	        if (mediaAproveitamento >= 9) {
	            conceito = "A";
	        } else if (mediaAproveitamento >= 7.5) {
	            conceito = "B";
	        } else if (mediaAproveitamento >= 6) {
	            conceito = "C";
	        } else if (mediaAproveitamento >= 4) {
	            conceito = "D";
	        } else {
	            conceito = "E";
	        }

	     
	        System.out.println("Conceito do aluno: " + conceito);

	        scanner.close();
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

