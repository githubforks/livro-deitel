// http://carnevalli.googlepages.com/oproblemadasoitorainhas:solu%C3%A7%C3%A3orecursiva

package ch07.Exer07_24;
import java.io.*;
public class JogoRainha
{
	Tabuleiro tab;
        Tabuleiro tabAux[];
	
	public JogoRainha( int tabSize )
	{
		tab = new Tabuleiro( tabSize );
                tabAux = new Tabuleiro[ tabSize ];
		
	}
	
	public JogoRainha()
	{
		tab = new Tabuleiro( 8 );
                tabAux = new Tabuleiro[ 8 ];
	}

	public boolean start( int nivel )
	{
		/*Inicia um novo jogo, populando o tabuleiro*/
                boolean isOk = true;
                if( nivel >= tab.getSize() / 2 )
                {
                    if( tab.getSize() % 2 != 0 )
                    {
                        tab.setPosicao( tab.getSize() / 2, tab.getSize() / 2, true );
                    }
                    return true;
                }
                
                int posCol = -1;
                posCol = getPosCol( nivel, posCol );            
                
                if( posCol < 0 )
                {
                    return false;
                }
                		
                tab.setPosicao( tab.getSize() - 1 - posCol, tab.getSize() - 1 - nivel, true );
                
                while( ! start( nivel + 1 ) )
                {
                    tab.setPosicao( posCol, nivel, false );
                    tab.setPosicao( tab.getSize() - 1 - posCol, tab.getSize() - 1 - nivel, false );
                    
                    posCol = getPosCol( nivel, posCol );
                    
                    if( posCol < 0 )
                    {
                        return false;
                    }

                    tab.setPosicao( tab.getSize() - 1 - posCol, tab.getSize() - 1 - nivel, true );
                                      
                }
                return true;
	}

	public void imprimeTab()
	{
		System.out.println( tab.toString() );
	}
        
        public int getPosCol( int coluna, int posColAtual )
        {
            do
            {
                if( posColAtual == tab.getSize() - 1 )
                {
                    return -1;
                }
                posColAtual++;
                if( verificaDama( posColAtual, coluna, tab ) )
                {
                    tab.setPosicao( posColAtual, coluna, true );
                }
                
                if( verificaDama( tab.getSize() - 1 - posColAtual, tab.getSize() - 1 - coluna , tab ) )
                {
                    return posColAtual;
                }
                
                tab.setPosicao( posColAtual, coluna, false );
            }while( true );
            
        }

	public boolean verificaHorizontal( int x, int y, Tabuleiro t )
	{
		/**Retorna false se uma dama estiver posicionada de forma a cruzar com outra dama na horizontal */

		for( int i = 0; i < t.getSize(); i++ )
		{
			if( t.isOcupado( i, y ) && (! ( x == i ) ) )
			{
				return false;
			}
		}
		return true;
	}

	public boolean verificaVertical( int x, int y, Tabuleiro t )
	{
		/**Retorna false se uma dama estiver posicionada de forma a cruzar com outra dama na vertical */

		for( int i = 0; i < t.getSize(); i++ )
		{
			if( t.isOcupado( x, i ) && ( ! ( i == y ) ) )
			{
				return false;
			}
		}
		return true;
	}

	public boolean verificaDiagPrincipal( int x, int y, Tabuleiro t )	
	{
		/**Retorna false se a dama estiver posicionada de forma a cruzar com outra dama na diagona principal*/

		int i = x - 1;;
		int j = y - 1;

		while( i >= 0 && j >= 0 )
		{
			if( t.isOcupado( i, j ) )
			{
				return false;
			}
			i--;
			j--;
		}

		i = x + 1;
 		j = y + 1;
		
		while( i < t.getSize() && j < t.getSize() )
		{
			if( t.isOcupado( i, j ) )
			{
				return false;
			}
			i++;
			j++;
		}

		return true;
	}

	public boolean verificaDiagSecundaria( int x, int y, Tabuleiro t )
	{
		/**Retorna false se a dama estiver posicionada de forma a cruzar com outra dama na diagona secundária*/
	
		int i = x + 1;
		int j = y - 1;

		while( i < t.getSize() && j >= 0 ) 
		{
			if( t.isOcupado( i, j ) )
			{
				return false;
			}
			i++;
			j--;
		}
		
		i = x - 1;
		j = y + 1;
	
		while( i >= 0 && j < t.getSize() )
		{
			if( t.isOcupado( i, j ) )
			{
				return false;
			}
			i--;
			j++;
		}

		return true;
	}

	public boolean verificaTab()
	{
                Tabuleiro t = tab;
		for( int i = 0; i < t.getSize(); i++ )
		{
			for( int j = 0; j < t.getSize(); j++ )
			{
				if( t.isOcupado( i, j ) )
				{
					if( !( verificaVertical( i, j, t ) && 
				               verificaHorizontal( i , j, t ) &&
					       verificaDiagPrincipal( i, j, t ) &&
					       verificaDiagSecundaria( i, j, t ) ) )
					{
						return false;
					}
				}
			}
		}
		return true;
	}		 

	public boolean verificaDama( int i, int j, Tabuleiro t )
	{
		if( verificaVertical( i, j, t ) && 
			verificaHorizontal( i , j, t ) &&
			verificaDiagPrincipal( i, j, t ) &&
			verificaDiagSecundaria( i, j, t ) )
		{
			return true;
		}
		return false;		
	}

	public static void main( String args[] )
	{
                BufferedReader tec = new BufferedReader( new InputStreamReader( System.in ) );
                
                JogoRainha jogo = null;
                
                try
                {   
                    System.out.println( "Informe a ordem do tabuleiro: " );
                    jogo = new JogoRainha( Integer.parseInt( tec.readLine() ) );
                }catch( NumberFormatException e )
                {
                    System.out.println( "Erro. Deve ser um inteiro.");
                    System.exit( 0 );
                }catch( IOException e )
                {
                    e.printStackTrace();
                    System.exit( 0 );
                }
		jogo.start( 0 );
		jogo.imprimeTab();

		if( jogo.verificaTab() )
		{
			System.out.println( "O tabuleiro está preenchido corretamente." );
		}else{
			System.out.println( "Há erros no preenchimento do tabuleiro." );
		}	
	}

	
}
			