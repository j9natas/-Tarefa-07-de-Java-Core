package JAVA_ATIV_8;


import java.util.Scanner;


public class CODIGO_USUARIO12 {




	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int codigoArmazenado = 1256;

     
        System.out.println("Digite o código de usuário:");
        int codigoUsuario = scanner.nextInt();

       
        if (codigoUsuario != codigoArmazenado) {
            System.out.println("Usuário inválido!");
        } else {
          
            int senhaCorreta = 9956;

            
            System.out.println("Digite a senha:");
            int senha = scanner.nextInt();

           
            if (senha != senhaCorreta) {
                System.out.println("Senha incorreta.");
            } else {
                System.out.println("Acesso permitido.");
            }
        }

        scanner.close();
    }
}
	
	
	
	
	
	
	




