package janela1;
import javax.swing.*;
import java.awt.*;


public class ExemploJTexField2 extends JFrame {
	
	JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7,
	rotulo8, rotulo9, rotulo10, rotulo11, rotulo12;
	
	JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7,
	texto8, texto9, texto10, texto11, texto12;
	
	public ExemploJTexField2(){
		super("Exemplo com JTextField");
		Container tela = getContentPane();
		setLayout(null);
		
		rotulo1 = new JLabel("Nome:");
		rotulo2 = new JLabel("RG:");
		rotulo3 = new JLabel("CPF:");
		rotulo4 = new JLabel("Idade:");
		rotulo5 = new JLabel("Endereço:");
		rotulo6 = new JLabel("Telefone residencial:");
		rotulo7 = new JLabel("Telefone comercial:");
		rotulo8 = new JLabel("Celular:");
		rotulo9 = new JLabel("Nome do pai:");
		rotulo10 = new JLabel("Nome da mãe:");
		rotulo11 = new JLabel("Nome do conjuge:");
		rotulo12 = new JLabel("Sexo:");
		
		texto1 = new JTextField(50);
		texto2 = new JTextField(15);
		texto3 = new JTextField(11);
		texto4 = new JTextField(8);
		texto5 = new JTextField(30);
		texto6 = new JTextField(30); 
		texto7 = new JTextField(30);
		texto8 = new JTextField(30);
		texto9 = new JTextField(30);
		texto10 = new JTextField(30);
		texto11 = new JTextField(30);
		texto12 = new JTextField(30);
		
		rotulo1.setBounds(50,20,100,20);
		rotulo2.setBounds(50,60,100,20);
		rotulo3.setBounds(50,100,100,20);
		rotulo4.setBounds(50,140,100,20);
		rotulo5.setBounds(50,180,100,20);
		rotulo6.setBounds(50,220,120,20);
		rotulo7.setBounds(50,260,140,20);
		rotulo8.setBounds(50,300,160,20);
		rotulo9.setBounds(50,340,180,20);
		rotulo10.setBounds(50,380,200,20);
		rotulo11.setBounds(50,420,220,20);
		rotulo12.setBounds(50,460,240,20);
		
		
		texto1.setBounds(200,20,200,20);
		texto2.setBounds(200,60,200,20);
		texto3.setBounds(200,100,200,20);
		texto4.setBounds(200,140,200,20);
		texto5.setBounds(200,180,200,20);
		texto6.setBounds(200,220,200,20);
		texto7.setBounds(200,260,200,20);
		texto8.setBounds(200,300,200,20);
		texto9.setBounds(200,340,200,20);
		texto10.setBounds(200,380,200,20);
		texto11.setBounds(200,420,200,20);
		texto12.setBounds(200,460,200,20);
		
		tela.add(rotulo1);
		tela.add(rotulo2);
		tela.add(rotulo3);
		tela.add(rotulo4);
		tela.add(rotulo5);
		tela.add(rotulo6);
		tela.add(rotulo7);
		tela.add(rotulo8);
		tela.add(rotulo9);
		tela.add(rotulo10);
		tela.add(rotulo11);
		tela.add(rotulo12);
		
		tela.add(texto1);
		tela.add(texto2);
		tela.add(texto3);
		tela.add(texto4);
		tela.add(texto5);
		tela.add(texto6);
		tela.add(texto7);
		tela.add(texto8);
		tela.add(texto9);
		tela.add(texto10);
		tela.add(texto11);
		tela.add(texto12);
		
		setSize(400,250);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	public static void main(String args[]) {
		ExemploJTexField2 app = new ExemploJTexField2();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
