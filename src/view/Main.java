package view;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;
import controller.ConverteController;
import model.PilhaString;

public class Main {

	public static void main(String[] args) throws HeadlessException, Exception {

		PilhaString p = new PilhaString();
		ConverteController c = new ConverteController(p);
		int val;
		do {
			val = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor decimal (0 até 1000) que será convertido em binário: "));
			if (val < 0 || val > 1000) {
				JOptionPane.showMessageDialog(null, "Dado incorreto");
			}
		} while (val > 1000 || val < 0);

		JOptionPane.showMessageDialog(null, "Valor convertido para binário: " + c.decToBin(val));
	}

}
