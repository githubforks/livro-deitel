package ch07.Exer07_22;

// Programa que resolve o algoritmo problema do passeio do cavalo por Heuristica de acessibilidade
//pg 290

/*
*  @author Rodrigo Pletsch Aramburu
*
*  Nota: o cavalodo xadrez pode se movimentar para 8 lugares diferentes  aos quais numerei da seguinte maneira
*  0 1 0 2 0
*  8 0 0 0 3
*  0 0 C 0 0
*  7 0 0 0 4
*  0 6 0 5 0
*
**/

import java.util.*	;

public class PasseioCavalo
{
	private int[][] tabuleiro;//Tabuleiro onde o cavalo vai andar
	private Random  aleatorio;//gerado de números aleatórios
	private int nMovimento;// número do movimento do cavalo
	private Scanner scan;
	
	public Casa casaInicial;
	
	private int[][] heuristica =
	{
		{2,3,4,4,4,4,3,2},
		{3,4,6,6,6,6,4,3},	
		{4,6,8,8,8,8,6,4},
		{4,6,8,8,8,8,6,4},
		{4,6,8,8,8,8,6,4},
		{4,6,8,8,8,8,6,4},
		{3,4,6,6,6,6,4,3},
		{2,3,4,4,4,4,3,2}
	};	
	
	//construtor
	public PasseioCavalo()
	{
		tabuleiro = new int[8][8];// instancia a matriz do tabuleiro
		aleatorio = new Random();
		nMovimento = 1;
		scan = new Scanner(System.in);
		casaInicial = new Casa(4,4);
	}
	

    /**
     * Retorna a casa do movimento indicado pelo parâmetro i
     */
	public Casa getMoveByID(Casa c,int i)
	{
		switch(i)
		{
			case 1:
			{
					Casa ca = new Casa( c.getX()-2 , c.getY()-1);
					return ca;					
			}
			case 2:
			{
					Casa ca = new Casa( c.getX()-2 , c.getY()+1);
					return ca;
			}
			case 3:
			{
					Casa ca = new Casa( c.getX()-1 , c.getY()+2);
					return ca;
			}
			case 4:
			{
					Casa ca = new Casa( c.getX()+1 , c.getY()+2);
					return ca;
			}
			case 5:
			{
					Casa ca = new Casa( c.getX()+2 , c.getY()+1);
					return ca;
			}
			case 6:
			{
					Casa ca = new Casa( c.getX()+2 , c.getY()-1);
					return ca;
			}
			case 7:
			{
					Casa ca = new Casa( c.getX()+1 , c.getY()-2);
					return ca;
			}
			case 8:
			{
					Casa ca = new Casa( c.getX()-1 , c.getY()-2);
					return ca;
			}
			default: return null;
		}
	}
	
	/**
     * Marca o movimento na matriz que representa o tabuleiro
     */
	public void marcaMove(Casa c)
	{
        if(c != null)
        {
            tabuleiro[c.getX()][c.getY()] = this.nMovimento++;
        }
	}
	
	
	/**
     * Retorna o valor de acesso da heuristica
     */
	public int getAccess(Casa c)
	{
		return this.heuristica[c.getX()][c.getY()];
	}
	

   /**
    * Retorna a próxima casa que o cavalo irá passar
    */
	public Casa getNextMove(Casa c)
	{
		Casa nextCasa = null; 
		int minAccess = 10;
		int nopcoes = 0;
		ArrayList opcoes = new ArrayList();
		for(int i = 1 ; i <= 8; i++)
		{
			Casa ca = getMoveByID(c,i);
			if( ca.isValid( tabuleiro ) )
				opcoes.add(ca);				
		}
		
		// acha o menor valor da heuristica
		Iterator i = opcoes.iterator();
		ArrayList array = new ArrayList();
		int minAcesso = this.getMinAccess(opcoes);
		while( i.hasNext() )
		{
			Casa casa =  (Casa) i.next();
			int nextAcesso = this.getAccess(casa);
			if( nextAcesso == minAcesso)
				array.add(casa);
		}
        int move = 0;
        Casa proxima = null;
		if( array.size() > 0 )
		{
            move = aleatorio.nextInt(array.size());
            proxima = (Casa) array.get(move);
        }
		return proxima;	
	}


    /**
     * Retorna o menor valor de acesso dos movimentos passados
     */
	private int getMinAccess(ArrayList array)
	{
		Iterator i = array.iterator();
		int acesso = 10;
		int nextAcesso;
		while( i.hasNext() )
		{
			Casa casa =  (Casa) i.next();
			nextAcesso = this.getAccess(casa);
			if( acesso == 10 || acesso > nextAcesso)
				acesso = nextAcesso;
		}
		return acesso;
	}
	
	private boolean hasNextMove(Casa c)
	{
		return true;
	}
	
	/**
     * Imprime o tabuleiro
     */
	public void printTabuleiro()
	{
	
		for(int x =0; x<8 ; x++){
			for(int y=0; y<8; y++){
				System.out.printf("%2d ",tabuleiro[x][y]);
			}
			System.out.println();
		}
	}


    /**
     * Método recursivo que move o cavalo no tabuleiro e retorna o numero de
     * passos 
     */
	public int moveCavalo(Casa c)
	{
	
		if( this.nMovimento > 64 ||  !this.hasNextMove(c) )
		{
			this.printTabuleiro();
			return nMovimento;
		}
		else
		{
			Casa proxima = getNextMove(c);
			//System.out.println(this.nMovimento);
			//this.printTabuleiro();	
			//int s = scan.nextInt();
			
			if( proxima == null )
			{
				return this.nMovimento;	
			}
            this.marcaMove(proxima);
			moveCavalo(proxima);
		}
		return nMovimento;
	}
	
	public static void main(String args[])
	{
		int passos = 0;
        PasseioCavalo pc = null;
		while( passos <= 64)
		{
    		pc = new PasseioCavalo();
            pc.marcaMove(pc.casaInicial);
        	passos = pc.moveCavalo(pc.casaInicial);
            System.out.println("Numero de passos: "+(passos-1) );
		}
	}
}