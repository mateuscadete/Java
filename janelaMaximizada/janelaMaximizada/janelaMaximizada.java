package janelaMaximizada;
import javax.swing.*;

public class janelaMaximizada extends JFrame{
	public janelaMaximizada() {
		super("Como exibir a janela maximizada");
		setSize(300, 150);
		setVisible(true);
		setExtendedState(MAXIMIZED_BOTH);
	}
	public static void main(String args[]) {
		janelaMaximizada app = new janelaMaximizada();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
