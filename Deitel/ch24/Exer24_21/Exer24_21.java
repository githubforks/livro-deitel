/*
 * (Modificações no programo Tic-Toc-Toe com múltiplas threads) Os programas nas
 * figuras 24.13 e 24.15 implemeotaram uma versão cliente/servidor com múltiplas
 * threads do jogo-da-velha. Nosso objetivo ao desenvolver esse jogo foi
 * demonstrar um servidor multiencadeado que pode processar múltiplas conexões
 * de clientes ao mesmo tempo. O servidor no exemplo é na realidade um mediador
 * entre os dois applets clientes - ele se certifica de que cada movimento é
 * válido e cada cliente se move na ordem adequada. O servidor não determina
 * quem ganhou ou quem perdeu nem se houve empate. Além disso, não há capacidade
 * para permitir que um novo jogo seja jogado ou para terminar um jogo
 * existente.
 *      A seguir há uma lista das modificações sugeridas para as figuras 24.13 e
 * 24.15:
 *          a) Modifiquea classe TicTacToeServer para testar se há um vencedor,
 *             um perdedor ou um empate em cada movimento no jogo. Envie uma
 *             mensagem para cada applet cliente indicando o resultado quando o
 *             jogo acabar.
 *          b) Modifique a classe TicTacToeClient para exibir um botão que
 *             quando clicado permita ao cliente jogar outro jogo. O botão
 *             somente deve ser ativado quando um jogo terminar. Observe que
 *             tanto a classe TicTacToeClient como a classe TicTacToeServer
 *             devem ser modificadas para redefinir o tabuleiro e todas as
 *             informações de estado. Além disso, o outro TicTacToeClient deve
 *             ser notificado de que um novo jogo está para ser iniciado, de
 *             modo que seu tabuleiro e seu estado possam ser reinicializados.
 *          c) Modifique a classe TicTacToeClient para fornecer um botão que
 *             permita a um cliente terminar o programa a qualquer hora. Quando
 *             o usuário clicar no botão, o servidor e o outro cliente devem ser
 *             notificados. O servidor deve então esperar uma conexão do outro
 *             cliente para que um novo jogo possa começar.
 *          d) Modifique a classe TicTacToeClient e a classe TicTacToeServer de
 *             modo que o vencedor de um jogo possa escolher ser o X ou o O para
 *             o próximo jogo. Lembre-se: X smpre começa primeiro.
 *          e) Se você for ambicioso, permita que um cliente jogue contra o
 *             servidor enquanto o servidor espera uma conexão de outro cliente.
*/

package ch24.Exer24_21;

public class Exer24_21 {

}
