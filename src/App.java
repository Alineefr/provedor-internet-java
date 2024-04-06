import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       String nome_provedor = "Fenda do Biquini";      
       String nome_assistente = "Bob Esponja";
       String nome_usuario;
    
        
        System.out.printf("Olá, bem-vindo a central de atendimento \"%s\"!", nome_provedor);

        System.out.printf("\nMeu nome é  %s, sou seu assistente virtual", nome_assistente);

        System.out.print("\nDurante o atendimento siga minhas instruções");

        System.out.print("\nPrimeiramente informe seu nome: ");
        nome_usuario = scanner.next();

        System.out.printf("Obrigado %s, como posso lhe ajudar?" ,nome_usuario);

        scanner.close();
    }
}
