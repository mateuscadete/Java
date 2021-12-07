package janela1;
import javax.swing.*;
import java.awt.*;

public class ExemploJTextField extends JFrame {
	
	JLabel rotulo1, rotulo2, rotulo3, rotulo4;
	JTextField texto1, texto2, texto3, texto4;
	public ExemploJTextField() {
		super("Exemplo com JTextField");
		Container tela = getContentPane();
		setLayout(null);
		
		rotulo1 = new JLabel("CEP:");
		rotulo2 = new JLabel("Telefone:");
		rotulo3 = new JLabel("CPF:");
		rotulo4 = new JLabel("Data:");
		
		texto1 = new JTextField(8);
		texto2 = new JTextField(15);
		texto3 = new JTextField(11);
		texto4 = new JTextField(8);
		
		rotulo1.setBounds(50,20,80,20);
		rotulo2.setBounds(50,60,80,20);
		rotulo3.setBounds(50,100,80,20);
		rotulo4.setBounds(50,140,80,20);
		
		texto1.setBounds(110,20,100,20);
		texto2.setBounds(110,60,100,20);
		texto3.setBounds(110,100,100,20);
		texto4.setBounds(110,140,100,20);
		
		tela.add(rotulo1);
		tela.add(rotulo2);
		tela.add(rotulo3);
		tela.add(rotulo4);
		tela.add(texto1);
		tela.add(texto2);
		tela.add(texto3);
		tela.add(texto4);
		setSize(400,250);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	public static void main(String args[]) {
		ExemploJTextField app = new ExemploJTextField();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
