package ch05.Exer05_01;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel
{
	private int width, height;

	// desenha uma cascata de formas que iniciam do canto superior esquerdo 
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );

		width = getWidth()/2;
		height = getHeight()/2;

		for ( int i = 1; i <= 12; i++ )
		{
			g.drawOval( width-(i*10) , height-(i*10),
					(i*10)+((i-1)*10) , (i*10)+((i-1)*10) );
//						10+0
// 						10+20
// 						10+30
// 						10+50
// 						 ...
		} // Fecha o loop for
	} // fim do método paintComponent
} // fim da classe Shapes
