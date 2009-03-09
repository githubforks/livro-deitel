/*
 * (Proteção de cheque) Os computadores são freqüentemente empregados em
 * sistemas de verificação de escrita como aplicativos de folha de pagamento e
 * contas a pagar. Ouvimos muitas histórias estranhas relacionadas a cheques de
 * pagamento semanal que são impressos (por engano) com quantias de mais de
 * $ 1 milhão. Quantidades incorreras são impressas por sistemas
 * computadorizados de preenchimento de cheque por causa de erro humano ou falha
 * de máquina. Os projetistas de sistemas embutem controles em seus sistemas
 * para evitar a emissão desses cheques errados.
 *      Outro problema sério é a alteração intencional do valor de um cheque por
 * alguém que planeja receber um cheque fraudulentamente. Para evitar que uma
 * quantia monetária seja alterada, alguns sistemas computadorizados de
 * preenchimento de cheque empregam uma técnica chamada proteção de cheque.
 * Cheques projetados para imprimir por computador contém um numero fixo de
 * espaços em que o computador pode imprimir uma quantia. Suponha que um cheque
 * de pagamento contenha oito espaços em branco em que o computador deve
 * imprimir a quantidade de um cheque de pagamento semanal. Se o valor for alto,
 * então todos os oito espaços serão preenchidos. Por exemplo,
 *
 *          Comprimento de palavra       Ocorrências
 *          1                            0
 *          2                            2
 *          3                            1
 *          4                            2 (incluindo 'tis)
 *          5                            0
 *          6                            2
 *          7                            1
 *          Figura 29.25 Contagens de comprimento de palavra da string.
 *
 *      1.230,60 (valor do cheque)
 *      --------
 *      12345678 (posição dos números)
 *
 * Por outro lado, se a quantidade for menor que $ 1000, então vários dos
 * espaços seriam comumente deixados em branco. Por exemplo,
 *
 *         99,87
 *      --------
 *      12345678
 *
 * contém três espaços em branco. Se um cheque é impresso com espaços em branco,
 * e mais fáncil para alguém alterar o valor do cheque. Para evitar que um
 * cheque seja alterado, muitos sistemas de preenchimento te cheque inserem
 * asteriscos iniciais para proteger o valor como segue:
 *
 *      ***99,87
 *      --------
 *      12345678
 *
 * Escreva um aplicativo que insira uma quantia monetária que será impressa em
 * um cheque e então imprima o valor em formato de cheque protegida com
 * asteriscos iniciais, se necessário. Assuma que nove espaços estão disponíveis
 * para imprimir o valor.
 */

package ch29.Exer29_21;

public class Exer29_21 {

}
