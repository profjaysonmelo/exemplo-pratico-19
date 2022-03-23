import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try {
			double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso: "));
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: "));
			
			if(peso == 0.0 || altura == 0.0) {
				throw new ArithmeticException();
			}
			
			double imc = peso / (altura * altura);
			
			System.out.println("IMC = " + imc);
		} catch (NumberFormatException e) {
			System.out.println("Informe um valor válido!");
		} catch (ArithmeticException e) {
			System.out.println("Impossível realizar divisão por zero!");
		}
	}
	
}
