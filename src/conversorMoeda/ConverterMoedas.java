package conversorMoeda;

import javax.swing.JOptionPane;

public class ConverterMoedas extends ConversorTemperatura{
	public static void main(String[] args) {
		
		FuncaoConverter converter = new FuncaoConverter();
		
		while(true) {
			String opcao = JOptionPane.showInputDialog(null,"escolha uma opção",
					"menu", JOptionPane.PLAIN_MESSAGE, null,
					new Object[] {"conversor de moeda","conversor de temperatura"},
					"escolha").toString();
				switch(opcao) {
				case  "conversor de moeda":
				    String input = JOptionPane.showInputDialog("insira um valor em reais");
				    double valorRecebido =  Double.parseDouble(input);
				    converter.ConverterReaisParaDolar(valorRecebido);
				       
				
				case  "conversor de temperatura":
					String input2 = JOptionPane.showInputDialog("insira um valor em graus farenheits");
					double valorDigitado =  Double.parseDouble(input2);
					converter.ConverterTemperaturaGrausCentigrados(valorDigitado);
			}
		}
	}
}
