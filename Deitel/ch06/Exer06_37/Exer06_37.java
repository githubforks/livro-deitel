/*
 * Modifique o programa de jogo de dados da figura 6.9 para permitir apostas.
 * Inicialize a variável bankBalance com $ 1.000. Peça ao jogador para inserir
 * um wager (uma aposta). Verifique se o wager é menor ou igual a bankBalance e,
 * se não o for, faça o usuário reinserir o wager até um wager válido inserido.
 * Depois que um wager correto foi inserido, execute um jogo de dados. Se o
 * jogador ganhar, aumente o bankBalance por wager e exiba o novo bankBalance.
 * Se o jogador perder, diminua o bankBalance por wager, exiba o novo bank
 * balance, verifique se bankBalance tornou-se zero e, se tiver ocorrido, exiba
 * a mensagem "Sorry. You busted." ["Desculpe, mas você faliu."]. Enquanto o
 * jogo se desenvolve, exiba várias mensagens para criar uma 'conversa', como
 * "Oh, you're going for broke, huh?" ["Oh, parece que você vai quebrar, hein?"]
 * ou "Aw, c'mon, take a chance" ["Ah, vamos lá, dê uma chance para sua sorte!"]
 * ou "You're up big. No's the time to cash in your chips!" [Você está montado
 * na grana. Agora é hora de trocar essas fichas e embolsar o dinheiro!"].
 * Implemente a 'conversa' como um método separado que escolhe aleatóriamente a
 * string a exibir.
 */

package ch06.Exer06_37;

import java.util.Random;
import java.util.Scanner;

public class Exer06_37 {
	// cria um gerador de números aleatórios para uso no método rollDice
	private Random randomNumbers = new Random();

	// enumeração com constantes que representam o status do jogo
	private enum Status { CONTINUE, WON, LOST };                

	// constantes que representam lançamentos comuns dos dados
	private final static int SNAKE_EYES = 2;
	private final static int TREY = 3;      
	private final static int SEVEN = 7;     
	private final static int YO_LEVEN = 11;
	private final static int BOX_CARS = 12;
	
	// Saldo inicial na conta bancaria
	private int bankBalance = 1000;

	// Aposta do jogador
	private int wager = 0;
	
	// joga uma partida de craps
	public void play()
	{
		int myPoint; // pontos se não ganhar ou perder na 1a. rolagem
		Status gameStatus; // pode conter CONTINUE, WON ou LOST
		Scanner input = new Scanner( System.in );
		Convarsation conv = new Convarsation( bankBalance );
		
		while ( ( bankBalance > 0 ) )
		{

			myPoint = 0;
			
			System.out.print("Your wager: ");
			wager = input.nextInt();
			
			int sumOfDice = rollDice(); // primeira rolagem dos dados
			
			// determina o status do jogo e a pontuação com base no primeiro lançamento
			switch ( sumOfDice ) 
			{
				case SEVEN: // ganha com 7 no primeiro lançamento
				case YO_LEVEN: // ganha com 11 no primeiro lançamento
					gameStatus = Status.WON;
					break;
				case SNAKE_EYES: // perde com 2 no primeiro lançamento
				case TREY: // perde com 3 no primeiro lançamento
				case BOX_CARS: // perde com 12 no primeiro lançamento
					gameStatus = Status.LOST;
					break;
				default: // não ganhou nem perdeu, portanto registra a pontuação
					gameStatus = Status.CONTINUE; // jogo não terminou
					myPoint = sumOfDice; // informa a pontuação
					System.out.printf( "Point is %d\n", myPoint );
					break; // opcional no final do switch
			} // switch final
			
			// enquanto o jogo não estiver completo
			while (gameStatus == Status.CONTINUE) // nem WON nem LOST
			{ 
				sumOfDice = rollDice(); // lança os dados novamente
				
				// determina o status do jogo
				if ( sumOfDice == myPoint ) // vitória por pontuação
					gameStatus = Status.WON;
				else
					if ( sumOfDice == SEVEN ) // perde obtendo 7 antes de atingir a pontuação
						gameStatus = Status.LOST;
			} // fim do while
			
			// exibe uma mensagem ganhou ou perdeu
			if (gameStatus == Status.WON)
			{
				System.out.println( "Player wins" );
				bankBalance += wager;
			}
			else
			{
				System.out.println( "Player loses" );
				bankBalance -= wager;
			}
			System.out.println( "New Bank Balance = " + bankBalance );
			conv.talk(bankBalance);
		}
		System.out.println( "Sorry. You busted. [Desculpe, mas você faliu.]." );
	} // fim do método play

	// lança os dados, calcula a soma e exibe os resultados
	public int rollDice()
	{
		// seleciona valores aleatórios do dado
		int die1 = 1 + randomNumbers.nextInt( 6 ); // primeiro lançamento do dado
		int die2 = 1 + randomNumbers.nextInt( 6 ); // segundo lançamento do dado

		int sum = die1 + die2; // soma dos valores dos dados

		// exibe os resultados desse lançamento
		System.out.printf( "Player rolled %d + %d = %d\n", 
				die1, die2, sum );

		return sum; // retorna a soma dos dados
	} // fim do método rollDice
}
