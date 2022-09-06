package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameTabuada {

	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundoDaTela;
	public Font fonteDosLabels;
	public Color corDoTextoDoBotao;
	
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
		labelTabuada.setFont(new Font("Calibri", Font.BOLD, 24));
		labelTabuada.setBounds(70, 10, 150, 50);
		labelTabuada.setForeground(new Color(255, 0, 0));
		
		JLabel labelLegenda = new JLabel();
		labelLegenda.setText("Calcule a tabuada que desejar!");
		labelLegenda.setFont(new Font("Calibri", Font.BOLD, 12));
		labelLegenda.setBounds(70, 13, 300, 80);
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando: ");
		labelMultiplicando.setBounds(85, 60, 100, 50);
		
		JTextField textMultiplicando = new JTextField();
		textMultiplicando.setBounds(90, 90, 100, 30);
		
		
		// Adicionar componetes no painel
		painel.add(labelTabuada);
		painel.add(labelLegenda);
		painel.add(labelMultiplicando);
		painel.add(textMultiplicando);
		
		
		tela.setVisible(true);
	}
}
