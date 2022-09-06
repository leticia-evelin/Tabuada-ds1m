package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTabuada {

	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundoDaTela;
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		// Obter instância do container da janela
		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundoDaTela);
		
		// Componentes do container
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("Tabuada 1.0");
		labelTabuada.setBounds(30, 10, 100, 30);
		
		JLabel labelLegenda = new JLabel();
		labelLegenda.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule\r\n"
				+ "a tabuada que desejar em segundos!");
		labelLegenda.setBounds(30, 20, 100, 30);
		
		// Adicionar componetes no painel
		painel.add(labelTabuada);
		painel.add(labelLegenda);
		
		
		
		
		tela.setVisible(true);
	}
}
