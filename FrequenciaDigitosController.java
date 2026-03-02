package controller;
//RECEBE NUMERO ENTRE 10 E 999999 E OUTRO DE 0 A 9 E EXIBE QUANTAS VZS ELE APARECE NO PRIMEIRO
public class FrequenciaDigitosController {

	public FrequenciaDigitosController() {
		super();
	}
	
	public int contaFrequencia(int num, int digito) {
        //CONDIÇÃO DE PARADA
        if (num == 0) {
            return 0;
        }
        //CHAMADA
        int verifica = (num % 10 == digito) ? 1 : 0;
        return verifica + contaFrequencia(num / 10, digito);
    }
}