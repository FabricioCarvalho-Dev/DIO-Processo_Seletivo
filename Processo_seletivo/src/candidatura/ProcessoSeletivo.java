package candidatura;
import java.util.Scanner;
public class ProcessoSeletivo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem vindo ao Processo Seletivo");
		System.out.println("Digite um numero da opção de acordo com a etapa do processo seletivo\n [1]=>ANALISAR CANDIDATOS\n [2]=>SELECIONAR CANDIDATOS\n [3]=>LISTAR CANDIDATOS SELECIONADOS\n [4]=>ENTRAR EM CONTATO COM OS CANDIDATOS");
		int menu = scan.nextInt();
		
		switch (menu) {
		
		case 1: 
			Analise.analisarCandidato(1900.0); 
			Analise.analisarCandidato(2200.0);
			Analise.analisarCandidato(2000.0);
			break;
		case 2:
			Analise.selecaoCandidatos();
			break;
		case 3: 
			Analise.imprimirSelecionados();
			break;
		case 4: 
			Analise.SelecionadosEntrandoEmContato();
			break;
		default:
			System.out.println("NUMERO INVALIDO: " + menu);
		}
	}
}
