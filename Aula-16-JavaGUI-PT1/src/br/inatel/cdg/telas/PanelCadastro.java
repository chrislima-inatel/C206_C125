package br.inatel.cdg.telas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class PanelCadastro extends JPanel {
	private JTextField txtNome;
	private JTextField txtVida;
	private final ButtonGroup botaoInimigo = new ButtonGroup();

	public PanelCadastro() {
		setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(51, 81, 61, 16);
		add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(139, 76, 130, 26);
		add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblVida = new JLabel("Vida");
		lblVida.setBounds(68, 138, 61, 16);
		add(lblVida);
		
		txtVida = new JTextField();
		txtVida.setBounds(139, 133, 130, 26);
		add(txtVida);
		txtVida.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastro de Inimigos");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(149, 6, 195, 16);
		add(lblNewLabel_1);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(190, 245, 117, 29);
		add(btnSalvar);
		
		JRadioButton rdbtnKnight = new JRadioButton("Knight");
		rdbtnKnight.setSelected(true);
		botaoInimigo.add(rdbtnKnight);
		rdbtnKnight.setBounds(66, 184, 141, 23);
		add(rdbtnKnight);
		
		JRadioButton rdbtnZombie = new JRadioButton("Zombie");
		botaoInimigo.add(rdbtnZombie);
		rdbtnZombie.setBounds(251, 184, 141, 23);
		add(rdbtnZombie);

	}
}