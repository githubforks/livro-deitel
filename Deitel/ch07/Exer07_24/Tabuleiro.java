package ch07.Exer07_24;
public class Tabuleiro
{
	private boolean tab[][];

	public Tabuleiro( int x )
	{
		tab = new boolean[ x ][ x ];
	}

	public boolean ocupaPosicao( int linha, int coluna )
	{
		/**Retorna true se a posição pôde ser ocupada, ou seja, estava livre*/
		
		if( tab[ linha ][ coluna ] = false )
		{
			tab[ linha ][ coluna ] = true;
			return true;
		}
		return false;
	}

	public boolean isOcupado( int linha, int coluna )
	{
		/**Retorna se uma posição do tabuleiro está ocupada*/
		return tab[ linha ][ coluna ];
	}

	public void setPosicao( int linha, int coluna, boolean tipo )
	{
		/**Ocupa ou desocupa uma posição do tabuleiro*/

		tab[ linha ][ coluna ] = tipo;
	}

	public String toString()
	{
		String t = "";
	
		for( int i = 0; i < tab.length; i++ )
		{
			for( int j = 0; j < tab[ i ].length; j++ )
			{
				if( tab[ i ][ j ] )
				{
					t += "1" + "  ";
				}else{
					t += "0" + "  ";
				}				
			}
			t += "\n";
		}
		return t;
	}

	public int getSize()
	{
		return tab.length;
	}
}
		