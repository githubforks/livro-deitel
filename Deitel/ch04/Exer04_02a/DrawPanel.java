package ch04.Exer04_02a;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
	// desenha um X a partir dos cantos do painel
	public void paintComponent( Graphics g )
	{
		// chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent( g );

		int somaWidth = 0;
		int somaHeight = 0;

		for (int i = 0; i <= 15; i++) {

			somaWidth += getWidth()/15;
			g.drawLine( 0, somaHeight, somaWidth, getHeight() );
			somaHeight += getHeight()/15;

		}
	} // fim do método paintComponent
} // fim da classe DrawPanel