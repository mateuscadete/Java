
package ex31;

import javax.swing.JOptionPane;

public class Ex31 {

    public static void main(String[] args) {
        double i = 0, quadrado = 0;
        
        for(i = 10; i < 150; i++){
            quadrado = Math.pow(i, 2);
        
            System.out.println(quadrado);
        }
    }
    
}
