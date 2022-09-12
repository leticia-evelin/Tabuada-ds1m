package br.senai.sp.jandira;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {

	public static void main(String args[]) {
		
		//Tabuada tabuada = new Tabuada();
		//tabuada.multiplicando = 6897;
		//tabuada.minimoMultiplicador = 0;
		//tabuada.maximoMultiplicador = 10000;
		
		//String[] resultado = tabuada.getTabuada();	
		
		//int contador = 0;
		
		//while (contador < resultado.length) {
			//System.out.println(resultado[contador]);
			//contador++;
			
		//}
		
		//System.out.println("FIM");
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.largura = 350;
		tela.altura = 570;
		tela.criarTela();
	}

}
