package candidatura;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Analise {
	
   String[] candidatos = {};
   
	
	public static void analisarCandidato(double salarioPretendido){
		System.out.println("Analizando candidatos...  SALARIO BASE R$:2000,00;");
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("ABAIXO DESSE VALOR BASE - LIGAR PARA O CANDIDATO");
		}else if(salarioBase == salarioPretendido) 
			System.out.println("ACIMA DESSE VALOR BASE - LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		else {
			System.out.println("VALOR IGUAL AO VALOR BASE - AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
	
	public static void selecaoCandidatos() {
		//array com a lista de candidatos
		String[] candidatos = {"FABRICIO","DAVID","DENISE","JULIA","CARLOS", "DIEGO","WELTON","FELIX","AMANDA","PATRICIA"};
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " +candidato+ " Solicitou esse valor de salário R$:"+salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " +candidato+ " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	}
	
	public static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	public static void imprimirSelecionados() {
		String[] candidatos = {"FABRICIO","DAVID","DENISE","JULIA","CARLOS","AMANDA","PATRICIA"};
		System.out.println("Imprimindo a lista de candidatos informando o indice do CANDIDATO");
		for (int indice =0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de n°"+ (indice+1) + " é "+ candidatos[indice]);
		}
	}
	
	public static void SelecionadosEntrandoEmContato() {
		String[] candidatos = {"FABRICIO","DAVID","DENISE","JULIA","CARLOS","AMANDA","PATRICIA"};
		for (int indice =0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de n° "+ (indice+1) + " é "+ candidatos[indice]+"FOI SELECIONADO");
		}
		for(String candidato: candidatos) { entrandoEmContato(candidato); }
	}
	
	public static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	public static void entrandoEmContato(String candidato) {
		
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if (continuarTentando) {
				tentativasRealizadas++;
			}else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando && tentativasRealizadas < 3);
			if (atendeu) {
				System.out.println("CONSEGUIMOS CONTATO COM "+candidato +" NA TENTATIVA"+ tentativasRealizadas);
			}else
				System.out.println("NÂO CONSEGUIMOS CONTATO COM "+candidato+" NUMEROS MAXIMOS DE TENTATIVAS REALIZADAS");
			
	}
}
