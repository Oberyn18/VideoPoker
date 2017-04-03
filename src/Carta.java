/**
 * Esta classe representa uma carta de baralho.
 * Ao criar o objeto é necessario estabelecer o valor e o naipe.
 * @author Oberyn
 *
 */
public class Carta {
	/**
	 * O valor é representado por um int, no caso de A, J, Q, K, seus valores serao 14, 11, 12 e 13 respectivamente.
	 */
	private String valor;
	
	/**
	 * O naipe é representado por um char, Paus: P, Copas: C, Espadas: E e Ouros: O.
	 */
	private char naipe;
	
	/**
	 * Cria uma carta de um valor e um naipe.	
	 * @param valor O valor (2, ..., A) da Carta
	 * @param naipe O naipe (Paus, Copas, Espadas, Ouros) da Carta
	 */
	
	public Carta(String valor, char naipe){
		this.valor = valor;
		this.naipe = naipe;
	}
	
	/**
	 * Permite obtener o valor da carta.
	 * @return O valor da carta.
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * Permite obtener o naipe da carta.
	 * @return O naipe da carta.
	 */
	public char getNaipe() {
		return naipe;
	}
	
	/**
	 * Transforma a representacao da Carta em String.
	 * Esta representacao funcioa para tudas as cartas do baralho oficial.
	 */
	@Override
	public java.lang.String toString(){
		String printable;
		int sizeAux;
		printable = "*************\n";
		// LINE 2
		printable += "*";
		printable += this.getValor();
		sizeAux = this.getValor().length();
		if(sizeAux == 1){
			printable += "          *\n";
		}else{
			printable += "         *\n";
		}
		// LINE 3
		printable += "*";
		printable += this.getNaipe() + "          *\n";
		// LINE 4
		printable += "*           *\n";
		// LINE 5
		printable += "*";
		String naipeNome = "";
		switch(this.getNaipe()){
		case 'P':
				sizeAux = 4;
				naipeNome = "PAUS";
				break;
		case 'C':
				sizeAux = 5;
				naipeNome = "COPAS";
				break;
		case 'E':
				sizeAux = 7;
				naipeNome = "ESPADAS";
				break;
		case 'O':
				sizeAux = 5;
				naipeNome = "OUROS";
				break;
		}
		for(int i = 0; i < (11-sizeAux)/2; i++){
			printable += " ";
		}
		printable += naipeNome;
		for(int i = (11-sizeAux)/2; i < (11-sizeAux); i++){
			printable += " ";
		}
		printable += "*\n";
		// LINE 6
		printable += "*           *\n";
		// LINE 7
		printable += "*          ";
		printable += this.getNaipe() + "*\n";
		// LINE 8
		sizeAux = this.getValor().length();
		if(sizeAux == 1){
			printable += "*          ";
		}else{
			printable += "*         ";
		}
		printable += this.getValor() + "*\n";
		// LINE 9
		printable += "*************\n";
		return printable;
	}
}
