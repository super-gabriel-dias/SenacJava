package elevador;

import java.awt.Component;
import java.awt.Font;

import javax.swing.*;

public class Janela extends JFrame {
	
	private JButton btnAbrir, btnFechar;
	private JButton [] btnAndar;
	private JLabel lblinicio;
	
	public Janela() {
		inicio();
	}
	
	private void inicio() {
		setTitle("Bem-vindo ao Elevador KXPO");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		criarPainel();
		setLayout(null);
		setVisible(true);
	}

	private void criarPainel() {
		add(criarLabel());
		criarBtnAbrirFechar();
		criarBtnAndares();
		
	}

	private void criarBtnAndares() {
		btnAndar = new JButton [5];
		int x = 65;
		for(int i=0; i<btnAndar.length; i++) {
			
			btnAndar[i] = new JButton(""+(i+1));
			btnAndar[i].setBounds(x, 460, 120, 60);
			x += 125;
			add(btnAndar[i]);
			
		}

		
	}

	private void criarBtnAbrirFechar() {
		btnAbrir = new JButton("abrir");
		btnFechar = new JButton("fechar");
		btnAbrir.setBounds(160, 285, 220, 60);
		btnFechar.setBounds(400, 285, 220, 60);
		add(btnAbrir);
		add(btnFechar);
		
		
	}

	private Component criarLabel() {
		lblinicio = new JLabel("Elevador KXPO: Escolha um andar.");
		lblinicio.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblinicio.setHorizontalAlignment(JLabel.CENTER);
		lblinicio.setBounds(0, 60, 800, 30);
		return lblinicio;
	}


}
