import java.util.Arrays;
import java.util.Collections;

/**
 * Esta classe representa um baralho de cartas.
 * Quer dizer, um conjunto de 52 cartas.
 * @author Oberyn
 *
 */
public class Baralho {
	/**
	 * Array de cartas, tudas formam parte de Baralho.
	 */
	private Carta[] cartas = new Carta[52];
	
	/**
	 * Este construtor preenche automaticamente o baralho de cartas.
	 * Logo, embaralho as cartas, usamdo um Java Method
	 */
	public Baralho(){
		char[] naipes = {'P', 'O', 'C', 'E'};
		String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		int indexAux = 0;
		for(int i = 0; i < naipes.length; i++){
			for(int j = 0; j < valores.length; j++){
				cartas[indexAux] = new Carta(valores[j], naipes[i]);
				indexAux++;
			}
		}
		/*
		for(int k = 0; k < 52; k++)
			System.out.println(cartas[k].getValor() + "\t" + cartas[k].getNaipe());
		*/
		
		Collections.shuffle(Arrays.asList(cartas));
		/*
		for(int k = 0; k < 52; k++)
			System.out.println(cartas[k].getValor() + "\t" + cartas[k].getNaipe());
		*/
	}
	
	/*
	public static void main(java.lang.String[] args){
		Baralho b = new Baralho();
		
	}
	*/
}
