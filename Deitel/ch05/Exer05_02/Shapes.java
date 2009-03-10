package ch05.Exer05_02;

import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel
{
	private int width, height;
	private int n1,n2,n3,n4,n5;

	Shapes(int n1, int n2, int n3, int n4, int n5)
	{
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
		this.n5 = n5;
	}

	// desenha uma cascata de formas que iniciam do canto superior esquerdo 
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );

		width = getWidth();
		height = getHeight();

		for ( int i = 1; i <= 5; i++ )
		{
			switch(i){
				case 1:
					g.drawRect( 20 , height-(n1*10)-1 ,
								30 , n1*10 );
					break;
				case 2:
					g.drawRect( 70 , height-(n2*10)-1 ,
								30 , n2*10 );
					break;
				case 3:
					g.drawRect( 130 , height-(n3*10)-1 ,
								30 , n3*10 );
					break;
				case 4:
					g.drawRect( 190 , height-(n4*10)-1 ,
								30 , n4*10 );
					break;
				case 5:
					g.drawRect( 250 , height-(n5*10)-1 ,
								30 , n5*10 );
					break;
			}
		} // Fecha o loop for
	} // fim do método paintComponent
} // fim da classe Shapes
