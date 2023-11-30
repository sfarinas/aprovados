package arranjoAprovados;

import java.util.Scanner;

public class aprovados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		double media = 0;
		int a = 0;
		
		System.out.println("Quantos Alunos iram entrar : ");
		int n = sc.nextInt();sc.nextLine();
		
		String[] nome = new String[n];
		double[] seme1 = new double[n];
		double[] seme2 = new double[n];
		String[] aprovados = new String[n];
		
		for (int i = 0; i < seme2.length; i++) {
			System.out.println("Digite o nome a primeira e segunda nota ");
			nome[i] = sc.nextLine();
			seme1[i] = sc.nextDouble();
			seme2[i] = sc.nextDouble();sc.nextLine();
			
			soma = seme1[i] + seme2[i];
			media = (seme1[i] + seme2[i]) / 2;
			
			if (media >= 6.0) {
				aprovados[i] = nome[i];
			} else {
				System.out.println("NAO APROVADOS");
			}
		}
		
		for (int i = 0; i < aprovados.length; i++) {
			
			if (aprovados[i] != null) {
				System.out.println("ALUNOS APROVADOS : " + aprovados[i]);
			}
				
		}
		sc.close();
	}

}
