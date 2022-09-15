package conversorMoeda;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

	public static void main(String[] args) {
		
		FuncaoConverter converte = new FuncaoConverter();
		
		while(true) {
			String opcao = JOptionPane.showInputDialog(null,"escolha uma opção",
					"menu", JOptionPane.PLAIN_MESSAGE, null,
					new Object[] {"conversor de temperatura"},
					"escolha").toString();
				switch(opcao) {
				case  "conversor de temperatura":
					String input2 = JOptionPane.showInputDialog("insira valor em temperatura");
					double valorRecebido2 =  Double.parseDouble(input2);
					converte.ConverterReaisParaDolar(valorRecebido2);
	}
	}
	}
}
