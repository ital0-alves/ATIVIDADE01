package PROJETOTEMPERATURA;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// CONVERSÃO DE TEMPERATURA
		while (true) {
			Scanner inputTemperatura = new Scanner(System.in);
			System.out.println("digite uma temperatura:");
			Double Temperatura = inputTemperatura.nextDouble();
			System.out.println(Temperatura);
			System.out.println("EM QUAL TEMPERATURA ESTÁ?");
			System.out.println("1 - Kelvin\n2 - Fahrenheit\n3 - Celsius\n4 - Encerar sistema");

			Scanner input = new Scanner(System.in);
			System.out.println("Escolha uma opção: ");
			int op = input.nextInt();

			if (op == 1) {
				System.out.println("Você quer converter para? ");
				System.out.println("1 - Fahrenheit\n2 - Celsius");
				int escolha = input.nextInt();

				if (escolha == 1) {
					Double resultado = 1.8 * (Temperatura - 273) + 32; // Kelvin → Fahrenheit
					System.out.println("Temperatura em Fahrenheit: " + resultado);
				} else if (escolha == 2) {
					Double resultado = Temperatura - 273; // Kelvin → Celsius
					System.out.println("Temperatura em Celsius: " + resultado);
				} else {
					System.out.println("Opção inválida!");
				}

			} else if (op == 2) {
				System.out.println("Você quer converter para? ");
				System.out.println("1 - Kelvin\n2 - Celsius");
				int escolha = input.nextInt();

				if (escolha == 1) {
					Double resultado = ((Temperatura - 32) * 5) / 9 + 273; // Fahrenheit → Kelvin
					System.out.println("Temperatura em Kelvin: " + resultado);
				} else if (escolha == 2) {
					Double resultado = (Temperatura - 32) / 1.8; // Fahrenheit → Celsius
					System.out.println("Temperatura em Celsius: " + resultado);
				} else {
					System.out.println("Opção inválida!");
				}

			} else if (op == 3) {
				System.out.println("Você quer converter para? ");
				System.out.println("1 - Kelvin\n2 - Fahrenheit");
				int escolha = input.nextInt();

				if (escolha == 1) {
					Double resultado = Temperatura + 273; // Celsius → Kelvin
					System.out.println("Temperatura em Kelvin: " + resultado);
				} else if (escolha == 2) {
					Double resultado = Temperatura * 1.8 + 32; // Celsius → Fahrenheit
					System.out.println("Temperatura em Fahrenheit: " + resultado);
				} else {
					System.out.println("Opção inválida!");
				}

			}else if(op==4) {
				System.out.println("encerrar o sitema");
				break;
			}
			else {
				System.out.println("Opção inválida!");
			}

			//input.close();
			//inputTemperatura.close();
		}
	}
}