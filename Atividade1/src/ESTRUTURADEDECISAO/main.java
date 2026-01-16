package ESTRUTURADEDECISAO;import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
        System.out.println("1 produtos e serviços\n2 - pedidos\n3 - finaceiro\n4 - agenda\n5 - treinamentos\n6 - avisos\n7 - encerrar Sistema");
		Scanner input = new Scanner(System.in);
		System.out.println("Escolha uma opção: ");
		int op = input.nextInt();
		if (op==1) {
			System.out.println("acesso aos produtos e serviços");
			Scanner texto = new Scanner(System.in);
			System.out.println("Qual o conserto você deseja fazer? Manutenção ou Reparo");
			String opconserto = texto.nextLine();
			if (opconserto.equals("Manutenção")) {
				System.out.println("Tela de manutenção");
			}else if(opconserto.equals("Reparo")) {
			    System.out.println("Tela de reparo");
		    }else { 
	     		System.out.println("Digite uma opção valida");
			}
		
		}else if(op == 2) {
		System.out.println("Acesso aos pedidos");
		}else if(op == 3) {
		System.out.println("Acesso ao financeiro");
		System.out.println("Digite a sangria do caixa: ");
		Scanner num = new Scanner(System.in);
		double dinheiro = num.nextDouble();
		if (dinheiro>1000) {
			System.out.println("coletando dinhiro");
		}else if(dinheiro>0 && dinheiro <=1000) {
			System.out.println("não precisa coletar");
		}else {
			
		}
		
		}else if(op == 4) {
		System.out.println("Acesso a agenda");
		}else if(op == 5) {
		System.out.println("Acesso aos treinamentos");
		}else if(op == 6) {
		System.out.println("acesso asos avisos ");
		
		}else if(op == 7) {
		System.out.println("programa encerrado com sucesso");
		}else {
			System.out.println("Digite a opção valida");
	}

}
}