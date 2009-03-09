/*
 * (Código Morse em rede) Talvez o mais famoso de todos os esquemas de
 * codificação seja o código Morse, desenvolvido por Samuel Morse em 1812 para
 * utilização com o sistema de telegrafo. O código Morse atribui uma série de
 * pontos e traços para cada letra do alfabeto, para cada digito e alguns
 * caracteres especiais (como ponto, virgula, dois-pontos e ponto-e-virgula). Em
 * sistemas orientados para áudio, o ponto representa um som curto e o traço
 * representa um som longo. Outras representações de pontos e traços são
 * utilizadas com sistemas baseados em sinais luminosos e sistemas baseados em
 * sinais de bandeira. A separação entre palavras é indicada por um espaço, ou,
 * simplesmente, pela ausência de um ponto ou traço. Em um sistema orientado a
 * som, um espaço é indicado por um tempo curto durante o qual nenhum som e
 * transmitido. A versão internacional do código Morse aparece na Figura 24.30.
 *
 * Caractere    Cógigo      Caractere   Código
 * A            .-          T           -
 * B            -...        U           ..-
 * C            -.-.        V           ...-
 * D            -..         W           .--
 * E            .           X           -..-
 * F            ..-.        Y           -.--
 * G            --.         Z           --..
 * H            ....
 * I            ..          Dígitos
 * J            .---        1           .----
 * K            -.-         2           ..---
 * L            .-..        3           ...--
 * M            --          4           ....-
 * N            .-          5           .....
 * O            ---         6           -....
 * P            .--.        7           --...
 * Q            --.-        8           ---..
 * R            .-.         9           ----.
 * S            ...         0           .....
 * Figura 24.30 As letras do alfabeto como expressas no código Morse
 *              internacional
 *
 * Escreva um aplicativo cliente/servidor em que dois Cientes possam enviar
 * mensagens em código Monrse entre si por meio de um aplicativo servidor com
 * múltiplas threads. O aplicativo cliente deve permitir que o usuário digite
 * frases em linguagem natural em uma JTextArea. Ouando o usuário envia a
 * mensagem, o aplicativo cliente codifica o texto em código Morse e envia a
 * mensagem codificada, por meio do servidor, para o outro cliente. Utilize um
 * espaço em branco entre cada letra codificada em Morse e três espaços em
 * branco entre cada palavra codificada em Morse. Ouando as mensagens são
 * recebidas elas devem ser decodificadas e exibidas como caracteres normais e
 * como código Morse. O cliente deve ter um JTextField para digitar e um
 * JTextArea para exibir as mensagens do outro cliente.
 */

package ch24.Exer24_23;

public class Exer24_23 {

}
