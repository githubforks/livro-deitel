package ch04.Exer04_01a;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
	public void paintComponent( Graphics g )
	{
		// chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent( g );

		int width = getWidth()/2; // largura total
		int height = getHeight()/2; // altura total
		g.drawLine( 0, 0, width, height );

		for (int i = 1; i <= 7; i++) {

			width = width + getWidth()/15;
			height = height - getHeight()/15;
			// desenha uma linha a partir do canto superior esquerdo até o inferior direito
			g.drawLine( 0, 0, width, height );

		}

		width = getWidth()/2; // largura total
		height = getHeight()/2; // altura total
		for (int i = 1; i <= 7; i++) {

			width = width - getWidth()/15;
			height = height + getHeight()/15;
			// desenha uma linha a partir do canto superior esquerdo até o inferior direito
			g.drawLine( 0, 0, width, height );

		}
	} // fim do método paintComponent
} // fim da classe DrawPanel