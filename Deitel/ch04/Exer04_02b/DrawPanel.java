package ch04.Exer04_02b;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
	// desenha um X a partir dos cantos do painel
	public void paintComponent( Graphics g )
	{
		// chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent( g );
		
		//Canto inferior esquerdo
		int somaHeight = 0;
		int somaWidth = getWidth()/15;
		for (int i = 0; i <= 15; i++) {

			g.drawLine( 0, somaHeight, somaWidth, getHeight() );
			somaHeight += getHeight()/15;
			somaWidth += getWidth()/15;

		}

		//Canto inferior direito
		somaHeight = getHeight()-getHeight()/15;
		somaWidth = 0;
		for (int i = 0; i <= 15; i++) {

			g.drawLine(somaWidth,getHeight(),getWidth(),somaHeight);
			somaWidth += getWidth()/15;
			somaHeight -= getHeight()/15;

		}

		//Canto superior direito
		somaHeight = getHeight();
		somaWidth = getWidth();
		for (int i = 0; i <= 15; i++) {

			g.drawLine(getWidth(),somaHeight,somaWidth,0);
			somaHeight -= getHeight()/15;
			somaWidth -= getWidth()/15;

		}

		//Canto superior esquerdo
		somaHeight = getHeight()/15;
		somaWidth = getWidth();
		for (int i = 0; i <= 15; i++) {

			g.drawLine(somaWidth,0,0,somaHeight);
			somaHeight += getHeight()/15;
			somaWidth -= getWidth()/15;

		}
	} // fim do método paintComponent
} // fim da classe DrawPanel