package conversorMoeda;

import javax.swing.JOptionPane;

public class FuncaoConverter {

		
	public void ConverterReaisParaDolar(double valorRecebido) {
		double moedaDolar = valorRecebido / 5.11;
		moedaDolar = (double) Math.round(moedaDolar *100d)/100;
		JOptionPane.showConfirmDialog(null, "você tem $ " + moedaDolar + "Dolares");
		
	}
	public void ConverterReaisParaEuro(double valorRecebido) {
		double moedaEuro = valorRecebido / 5.09;
		moedaEuro = (double) Math.round(moedaEuro *100d)/100;
		JOptionPane.showConfirmDialog(null, "você tem $ " + moedaEuro + "Dolares");
	}
	
	public void ConverterReaisParaLibra(double valorRecebido) {
		double moedaLibra = valorRecebido / 6.09;
		moedaLibra = (double) Math.round(moedaLibra *100d)/100;
		JOptionPane.showConfirmDialog(null, "você tem $ " + moedaLibra + "Libras esterlinas");
	}
	
	public void ConverterReaisParaPesoArgentino(double valorRecebido) {
		double moedaPesoArgentino = valorRecebido / 0.89;
		moedaPesoArgentino = (double) Math.round(moedaPesoArgentino*100d)/100;
		JOptionPane.showConfirmDialog(null, "você tem $ " + moedaPesoArgentino + "Peso Argentino");
	}
	
	public void ConverterReaisParaPesoChileno(double valorRecebido) {
		double moedaPesoChileno = valorRecebido / 1.09;
		moedaPesoChileno = (double) Math.round(moedaPesoChileno *100d)/100;
		JOptionPane.showConfirmDialog(null, "você tem $ " + moedaPesoChileno + "Peso Chileno");
	}
	
	public void ConverterTemperaturaGrausCentigrados(double valorRecebido2) {
		double grausCentigrados = valorRecebido2 / 1.09;
		grausCentigrados = (double) Math.round(grausCentigrados *100d)/100;
		JOptionPane.showConfirmDialog(null, "A temperatura é " + grausCentigrados + "Graus Centigrados");
	}
}
