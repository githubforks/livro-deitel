/*
 * Utilizar loops e instruções de controle para desenhar linhas pode levar a muitos projetos
 * interessantes
 * 
 * a) Crie o projeto na captura de tela a esquerda da Figura 4.21. Esse projeto desenha linhas
 * a partir do canto superior esquerdo, estendendo as linhas até que elas cubram a metade
 * superior esquerda do painel. Uma abordagem é dividir a largura e a altura em um número
 * igual de passos (descobrimos que 15 passos fucionam bem). A primeira extremidade de uma
 * linha sempre estará no canto superior esquerdo (0,0). A segunda extremidade pode ser
 * encontrada iniciando no canto inferior esquerdo e movendo-se para cima um passo vertical
 * e para a direita um passo horizontal. Desenhe uma linha entre as duas extremidades.
 * Continue movendo-se para cima e para à direita para encontrar cada extremidade sucessiva.
 * A figura deve ser dimensionada de maneira correspondente à medida que você redimencionar
 * a janela.
 * 
 *  b) Modifique sua resposta na parte (a) para que as linhas se estendam a partir de todos
 *  os quatro cantos, como mostrado na captura de tela direita da Figura 4.21. As linhas nos
 *  cantos opostos devem interseccionar no meio.
 */

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

		for (int i = 1; i <= 7; i++)
		{

			width = width + getWidth()/15;
			height = height - getHeight()/15;
			// desenha uma linha
			g.drawLine( 0, 0, width, height );

		}

		width = getWidth()/2; // largura total
		height = getHeight()/2; // altura total
		for (int i = 1; i <= 7; i++) {

			width = width - getWidth()/15;
			height = height + getHeight()/15;
			// desenha uma linha
			g.drawLine( 0, 0, width, height );

		}
	} // fim do método paintComponent
} // fim da classe DrawPanel