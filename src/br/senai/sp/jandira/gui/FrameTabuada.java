package br.senai.sp.jandira.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ListResourceBundle;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;

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
		
		
		JList listResultadoTabuada = new JList();
		//listResultadoTabuada.setBounds(20, 280, 280, 230); Dentro do scroll
		listResultadoTabuada.setBackground(new Color(191, 233, 255));
		
		
		
		JScrollPane scroll = new JScrollPane(listResultadoTabuada);
		scroll.setBounds(20, 280, 280, 230);
		//scroll.getVerticalScrollBar().setValue(0);;
		//scroll.setViewportView(painel);
		//scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        //scroll.setPreferredSize(new Dimension(400, 400));
        
        
        
        
		// Evento botão calcular
		buttonCalcularTabuada.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				Tabuada tabuada = new Tabuada();
				
				if (textMultiplicando.getText().isEmpty() || textMinimoMultiplicador.getText().isEmpty() || textMaximoMultiplicador.getText().isEmpty());
				JOptionPane.showMessageDialog(null, "Digite um número", "ERRO", JOptionPane.ERROR_MESSAGE);
				
			}else{
				
				Tabuada.multiplicando = Integer.parseInt(textMultiplicando.getText());
				Tabuada.minimoMultiplicador = Integer.parseInt(textMinimoMultiplicador.getText());
				Tabuada.maximoMultiplicador = Integer.parseInt(textMaximoMultiplicador.getText());
				
				listResultadoTabuada.setListData(tabuada.getTabuada());		
				
			}
		});
		
		
		textMultiplicando.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				textMultiplicando.setText(textMultiplicando.getText().replaceAll("[^0-9]",""));
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				
				
			}
		});
		
				textMinimoMultiplicador.addKeyListener(new KeyListener(){

					@Override
					//quando a tecla é digitada
					public void keyTyped(KeyEvent e) {
						
						
					}

					@Override
					//quando a tecla é solta
					public void keyPressed(KeyEvent e) {
						
						
						
					}

					@Override
					//quando a tecla é presionada
					public void keyReleased(KeyEvent e) {
					
						textMinimoMultiplicador.setText(textMinimoMultiplicador.getText().replaceAll("[^0-9]",""));
							
						
						
					}
					
				
					
					
				});
		 

		 textMaximoMultiplicador.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				textMaximoMultiplicador.setText(textMaximoMultiplicador.getText().replaceAll("[^0-9]",""));
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				
				
			}
		});
		 
				
		 //Evento do botão limpar
		buttonLimparTabuada.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textMultiplicando.setText(null);
				textMinimoMultiplicador.setText(null);
				textMaximoMultiplicador.setText(null);	
				listResultadoTabuada.removeAll();
				
			}
		});
		
		
		
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
		//painel.add(listResultadoTabuada);
		painel.add(scroll);
		
		
		
		
		
		
		tela.setVisible(true);
	}


	


	
		
	}

