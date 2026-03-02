package view;
import javax.swing.JOptionPane;
import controller.FrequenciaDigitosController; 
//RECEBE NUMERO ENTRE 10 E 999999 E OUTRO DE 0 A 9 E EXIBE QUANTAS VZS ELE APARECE NO PRIMEIRO
public class FrequenciaDigitosView {

	public static void main(String[] args) {
		
		FrequenciaDigitosController fc = new FrequenciaDigitosController();
		
        // VALIDAÇÃO
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (10 a 999999):"));
        int digito = Integer.parseInt(JOptionPane.showInputDialog("Digite o dígito a buscar (0 a 9):"));
        
        if (num >= 10 && num <= 999999 && digito >= 0 && digito <= 9) {
            System.out.println("O dígito aparece " + fc.contaFrequencia(num, digito) + " vezes.");
        } else {
            System.out.println("Valores fora do intervalo permitido.");
        }
	}
}