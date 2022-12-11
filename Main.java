package exercicios;
import java.util.*;

public class Main {

	static String[] Vetor = new String[quantidadeLocada()];
	public static void cadastroVeiculos() {
		for (int i = 0; i < Vetor.length; i++) {
			//Digitar os veiculos comprados
			Carro oCarro = new Carro();
			Scanner s = new Scanner(System.in);
			Scanner z = new Scanner(System.in);
			String cpf = "";
			String cnpj = "";
			System.out.println("Digite o modelo do ve�culo " + i + ": ");
			String modelo = z.nextLine();
			System.out.println("Digite a placa do ve�culo: " );
			String placa = z.nextLine();
			System.out.println("Digite o valor do ve�culo: ");
			String valor = z.nextLine();
			System.out.println("Digite a hora da loca��o do ve�culo: ");
			String hora = z.nextLine();
			System.out.println("Digite a hora da devolu��o do ve�culo: ");
			String horaD = z.nextLine();
			System.out.println("Digite a data da loca��o do ve�culo: ");
			String dia = z.nextLine();
			System.out.println("Digite a data da devolu��o do ve�culo: ");
			String diaD = z.nextLine();
			
			
			// Dados proprietario
			
			System.out.println("Digite o nome do propriet�rio: ");
			String nome = z.nextLine();
			System.out.println("Digite o telefone do propriet�rio: ");
			String telefone = z.nextLine();
			System.out.println("Pessoa f�sica ou Jur�dica? \n[1] F�sica \n[2] J�ridica");
			int tipo = s.nextInt();
			
			if (tipo == 1) {
				System.out.println("Digite o CPF do propriet�rio: ");
				cpf = z.nextLine();
				PessoaFisica aPessoaFisica = new PessoaFisica(nome, telefone, cpf);
				oCarro = new Carro(modelo, placa, valor, hora, horaD, dia, diaD, aPessoaFisica); 
				Vetor[i] = oCarro.toString();
			}
			
			else {
				if (tipo == 2) {
					System.out.println("Digite o CNPJ do propriet�rio: ");
					cnpj = z.nextLine();
					PessoaJuridica aPessoaJuridica = new PessoaJuridica(nome, telefone, cnpj);
					oCarro = new Carro(modelo, placa, valor, hora, horaD, dia, diaD, aPessoaJuridica); 
					Vetor[i] = oCarro.toString();
				}
				
				else {
					System.out.println("Tipo n�o encontrado!");
				}
			}
		}
		
	}
	
	public static void mostrarVeiculos() {
		//Mostar o array com os veiculos comprados
		
		System.out.println("VE�CULOS LOCADOS");
		System.out.println("------------------");
		for (int i = 0; i < Vetor.length; i++) {
			System.out.println("Ve�culo " + i);
			System.out.println(Vetor[i].toString());
			System.out.println("------------------");
			
		}
	}
	
	public static int quantidadeLocada() {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a quantidade de ve�culos locados: ");
		int quantidade = Integer.parseInt(s.nextLine());
		return quantidade;
				
	}

	public static void main(String[] args) {
		cadastroVeiculos();
		mostrarVeiculos();
		
	}

}
