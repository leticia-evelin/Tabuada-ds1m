package br.senai.sp.jandira.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ListResourceBundle;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Scrollable;

import br.senai.sp.jandira.model.Tabuada;

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
		
		//ImageIcon icon = new ImageIcon();
		
		// Componentes do container
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("Tabuada 1.0");
		labelTabuada.setFont(new Font("Calibri", Font.BOLD, 26));
		labelTabuada.setBounds(70, 10, 150, 50);
		labelTabuada.setForeground(new Color(255, 0, 0));
		
		JLabel labelLegenda = new JLabel();
		labelLegenda.setText("Calcule a tabuada que desejar!");
		labelLegenda.setFont(new Font("Calibri", Font.BOLD, 12));
		labelLegenda.setBackground(new Color(0, 128, 255));
		labelLegenda.setBounds(70, 13, 300, 80);
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setFont(new Font("Calibri", Font.BOLD, 14));
		labelMultiplicando.setBounds(70, 70, 100, 50);
		
		JTextField textMultiplicando = new JTextField();
		textMultiplicando.setBounds(170, 80, 130, 30);
		
		JLabel labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Mínimo Multiplicador:");
		labelMinimoMultiplicador.setFont(new Font("Calibri", Font.BOLD, 14));
		labelMinimoMultiplicador.setBounds(30, 120, 135, 30);
		
		JTextField textMinimoMultiplicador = new JTextField();
		textMinimoMultiplicador.setBounds(170, 120, 130, 30);
		
		JLabel labelMaximoMultiplicador = new JLabel();
		labelMaximoMultiplicador.setText("Máximo Multiplicador:");
		labelMaximoMultiplicador.setFont(new Font("Calibri", Font.BOLD, 14));
		labelMaximoMultiplicador.setBounds(25, 160, 135, 30);
		
		JTextField textMaximoMultiplicador = new JTextField();
		textMaximoMultiplicador.setBounds(170, 160, 130, 30);
		
		// Criar o botão calcular
		JButton buttonCalcularTabuada = new JButton();
		buttonCalcularTabuada.setText("Calcular");
		buttonCalcularTabuada.setBounds(20, 210, 160, 35);
		buttonCalcularTabuada.setFont(new Font("Calibri", Font.BOLD, 14));
		buttonCalcularTabuada.setForeground(new Color(255, 255, 255));
		buttonCalcularTabuada.setBackground(new Color(0, 151, 75));
		
		//Criar o botão limpar
		JButton buttonLimparTabuada = new JButton();
		buttonLimparTabuada.setText("Limpar");
		buttonLimparTabuada.setBounds(185, 210, 113, 35);
		buttonLimparTabuada.setFont(new Font("Calibri", Font.BOLD, 14));
		buttonLimparTabuada.setForeground(new Color(255, 255, 255));
		buttonLimparTabuada.setBackground(new Color(255, 201, 14));
		
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setFont(new Font("Arial", Font.BOLD, 14));
		labelResultado.setForeground(new Color(0,0,0));
		labelResultado.setBounds(20, 250, 190, 30);
		
		//JTextField textResultado = new JTextField();
		//textResultado.setBounds(20, 280, 280, 230);
		//textResultado.setBackground(new Color(191, 233, 255));
		
		JList listResultadoTabuada = new JList();
		listResultadoTabuada.setBounds(20, 280, 280, 230);
		listResultadoTabuada.setBackground(new Color(191, 233, 255));
		
		
		tela.getContentPane().setLayout(new FlowLayout());  
		JTextArea area = new JTextArea(0,0);
		JScrollPane rolagemTabuada = new JScrollPane(area);
		rolagemTabuada.setPreferredSize(new Dimension(280, 280));
		rolagemTabuada.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
		
		tela.getContentPane().add(rolagemTabuada);  
		
	
		
		buttonCalcularTabuada.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Tabuada tabuada = new Tabuada();
				tabuada.multiplicando = Integer.parseInt(textMultiplicando.getText());
				tabuada.minimoMultiplicador = Integer.parseInt(textMinimoMultiplicador.getText());
				tabuada.maximoMultiplicador = Integer.parseInt(textMaximoMultiplicador.getText());
				
				listResultadoTabuada.setListData(tabuada.getTabuada());		
				
			}
		});
		
		
		//buttonLimparTabuada.addActionListener(new ActionListener() {
			
			//@Override
			//public void actionPerformed(ActionEvent e) {
				//buttonLimparTabuada.setText(null);
				//listResultadoTabuada.clearSelection();  
			//}
		//});
		
		
		// Adicionar componetes no painel
		painel.add(labelTabuada);
		painel.add(labelLegenda);
		painel.add(labelMultiplicando);
		painel.add(textMultiplicando);
		painel.add(labelMinimoMultiplicador);
		painel.add(textMinimoMultiplicador);
		painel.add(labelMaximoMultiplicador);
		painel.add(textMaximoMultiplicador);
		painel.add(buttonCalcularTabuada);
		painel.add(buttonLimparTabuada);
		painel.add(labelResultado);
		painel.add(listResultadoTabuada);
		painel.add(rolagemTabuada);
		painel.add(area);
		
		
		tela.setVisible(true);
	}
}
