package controller;

import model.PilhaString;

public class ConverteController {

	private PilhaString p;

	public ConverteController(PilhaString p) {
		this.p = p;
	}

	public String decToBin(int val) {
		if (val == 0) {
			return "0";
		}
		if (val == 1) {
			p.push("1");
			
			StringBuffer bin = new StringBuffer();
			
			try {
				while (p != null) { 
					bin.append(p.top());
					p.pop();
				}
			} catch (Exception e) {
				//System.err.println(e.getMessage());
				//Não é necessário imprimir a exceção, ja q o while sempre irá chegar no nulo
				//Em algum ponto, já q ele ira destruir a pilha até montar todo o resultado
				//E a pilha ficar vazia
			}
			return bin.toString();
		}

		int resto = val % 2;
		String res = String.valueOf(resto);
		val /= 2;
		p.push(res);

		return decToBin(val);
	}

}
