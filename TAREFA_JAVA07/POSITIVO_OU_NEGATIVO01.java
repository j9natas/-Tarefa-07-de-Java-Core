package JAVA_ATIV_8;


import java.util.Scanner;

public class POSITIVO_OU_NEGATIVO01 {

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.println("Digite um número: ");
        double numero = scanner.nextDouble();
        
       
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
        
       
        scanner.close();
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

