package br.inatel.ehealth.telas;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import br.inatel.ehealth.controle.BotaoSalvarAluno;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PainelCadastroAluno extends JPanel {
	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textMatricula;
	private JTextField textCurso;

	/**
	 * Create the panel.
	 */
	public PainelCadastroAluno() {
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Cadastro de aluno");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblTitulo.setBounds(60, 0, 240, 36);
		add(lblTitulo);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textNome.setBounds(190, 47, 147, 20);
		add(textNome);
		textNome.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textEmail.setColumns(10);
		textEmail.setBounds(190, 78, 147, 20);
		add(textEmail);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNome.setBounds(100, 47, 80, 20);
		add(lblNome);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblEmail.setBounds(100, 77, 80, 20);
		add(lblEmail);
		
		JLabel lblMatricula = new JLabel("Matr\u00EDcula");
		lblMatricula.setHorizontalAlignment(SwingConstants.LEFT);
		lblMatricula.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMatricula.setBounds(100, 112, 80, 20);
		add(lblMatricula);
		
		textMatricula = new JTextField();
		textMatricula.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textMatricula.setColumns(10);
		textMatricula.setBounds(190, 113, 71, 20);
		add(textMatricula);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setHorizontalAlignment(SwingConstants.LEFT);
		lblCurso.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblCurso.setBounds(100, 147, 80, 20);
		add(lblCurso);
		
		textCurso = new JTextField();
		textCurso.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textCurso.setColumns(10);
		textCurso.setBounds(190, 148, 71, 20);
		add(textCurso);
		
		JButton btnSalvarCadastro = new JButton("Salvar");
		btnSalvarCadastro.addActionListener(new BotaoSalvarAluno(this));
		btnSalvarCadastro.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnSalvarCadastro.setBounds(140, 204, 103, 30);
		add(btnSalvarCadastro);

	}

	public String getTextNome () {
		return textNome.getText();
	}
	
	public String getTextEmail () {
		return textEmail.getText();
	}
	
	public double getTextMatricula () {
		try {
			Integer.parseInt(textMatricula.getText());
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Número de matricula!");
		}
		
		return Integer.parseInt(textMatricula.getText());
	}
	
	public String getTextCurso () {
		return textCurso.getText();
	}

	public void limpaNome() {
		textNome.setText("");
	}
	public void limpaEmail() {
		textEmail.setText("");
	}
	public void limpaMatricula() {
		textMatricula.setText("");
	}
	public void limpaCurso() {
		textCurso.setText("");
	}
}
