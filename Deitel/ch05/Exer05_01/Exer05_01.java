/*
 * Desenhe 12 círculos cocêntricos no centro de um JPanel (Figura 5.28). O círculo mais
 * interno deve ter um raio de 10 pixels e cada círculo sucessivo deve ter um raio dez pixels
 * maior que o anterior. Comece localizando o centro do JPanel. Para obter o canto superior
 * esquerdo de um círculo, mova-se um raio para cima e um raio para a esquerda a partir do
 * centro. A largura ea altura do retângulo delimitador são o diâmetro do círculo (duas vezes
 * o raio).
 */

package ch05.Exer05_01;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exer05_01 extends JPanel {
	public static void main(String[] args) {
		Shapes s = new Shapes();
		JFrame jf = new JFrame();

		jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		jf.add( s ); // adiciona o painel ao frame
		jf.setSize( 300, 300 ); // configura o tamanho desejado
		jf.setVisible( true ); // mostra o frame
	}
}
