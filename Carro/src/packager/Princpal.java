package packager;
import java.util.Scanner;
class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("    Sistema Concencionária    ");
		
		System.out.println("Cadastro de cliente");
		System.out.println("Insira as seguintes informações:");
		System.out.print("Nome: ");
		String Nome = sc.nextLine();
		System.out.print("Telefone: ");
		String Telefone = sc.nextLine();
		System.out.print("Endereço: ");
		String Endereco = sc.nextLine();
		System.out.print("Nome do banco: ");
		String NB = sc.nextLine();		
		

		System.out.println("Selecione o modelo de carro:");
		System.out.println(" MODELO       VALOR R$ ");
		System.out.println(" BMW x1       R$ 1000 ");
		System.out.println(" Fiesta       R$ 1500 ");
		System.out.println(" Uno          R$ 2000 ");
		System.out.println(" Peugeot 206  R$ 100 ");
		System.out.println(" Civic        R$ 5000 ");
		System.out.println(" Corsa        R$ 4000 \n");
		String carro = sc.nextLine(); 
		double valor_carro = 0;		
		switch(carro) {
			case "BMW x1":				
				valor_carro = 1000;
			break;			
			case "Fiesta":
				valor_carro = 1500;
			break;
			case "Uno":
				valor_carro = 2000;
			break;
			case "Peugeot 206":
				valor_carro = 100;
			break;
			case "Civic":
				valor_carro = 5000;
			break;
			case "Corsa":
				valor_carro = 4000;
			break;			
		}
	
		System.out.println("\nSelecione a forma de pagamento (1 para Dinheiro ou 0 para Cartão de Débito):");
		int opcao = sc.nextInt();
		double saldo = 3000; 
		
		int hash = 8790;
		
		if(opcao == 0) {			
			System.out.println("\nInsira a senha de 4 digitos do cartão:");			
			int senha  = sc.nextInt();			

			if (senha != hash) {
				 System.out.println("\nSenha incorreta!");
				 System.out.println("\nEncerrando o atendimento...\nTenha um bom dia!");
				 System.exit(0);
			}			
			if (saldo < valor_carro) {
				System.out.println("\nSaldo insuficiente para realizar a compra!");
				System.out.println("\nEncerrando o atendimento...\nTenha um bom dia!");
				System.exit(0);
			}						
			
		}
		else {
			
			if (saldo < valor_carro) {
				System.out.println("\nSaldo insuficiente para realizar a compra!");
				System.out.println("\nEncerrando o atendimento...\nTenha um bom dia!");
				System.exit(0);
			}		
			
		}
		saldo = saldo - valor_carro;
		
		System.out.println(" Comprovante de pagamento");
		
		
		System.out.println("\nValor do pagamento: " + valor_carro);
		System.out.println("Saldo restante: " + saldo);
		
		
		System.out.println(" Comprovante de compra");

		System.out.println("Carro comprado: " + carro);
		System.out.println("Endereço para entrega: " + Endereco);
		
	}

}
