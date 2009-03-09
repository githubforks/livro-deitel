/*
 * A Figura 4.22 exibe dois projetos adicionais criados utilizando loops while e drawLine
 * 
 * a) Crie o projeto na captura de tela esquerda da Figura 4.22. Inicie dividindo cada borda
 * em um número igual de incrementos (escolhemos 15 novamente). A primeira linha inicia no
 * canto superior esquerdo e termina um passo a direita na extremidade inferior. Para cada
 * linha sucessiva, mova-se para baixo um incremento na borda esquerda e um incremento para a
 * direita na borda inferior. Continue desenhando linhas até alcançar o canto inferior
 * direito. A figura deve ser dimensionada à medida que você redimensiona a janela de modo
 * que as extremidades sempre toquem as bordas.
 * 
 * b) Modifique sua resposta na parte (a) para espelhar o projeto em todos os quatro cantos,
 * como mostrado na captura de tela direita da Figura 4.22.
 */

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

		for (int i = 0; i <= 15; i++)
		{
			somaWidth += getWidth()/15;
			g.drawLine( 0, somaHeight, somaWidth, getHeight() );
			somaHeight += getHeight()/15;
		}
	} // fim do método paintComponent
} // fim da classe DrawPanel