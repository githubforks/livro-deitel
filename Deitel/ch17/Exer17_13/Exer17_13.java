/*
 * Escreva a classe PostfixEvaluator, que avalia uma expressão pós-fixa como
 *      6 2 + 5 * 8 4 / -
 * O programa deve ler uma expressão pós-fixa consistindo em dígitos e
 * operadores em um StringBuffer. Utilizando as versões modificadas dos métodos
 * pilha implementadas anteriormente neste capítulo, o programa deve varrer a
 * expressão e avaliá-la (suponha que da seja válida). O algoritmo é como segue:
 *
 *      a) Acrescentar um paréntese direito ')' ao final da expressão pos-fixa.
 *         Quando o caractere do parêntese direito for encontrado, mais nenhum
 *         processamento é necessário
 *      b) Enquanto o caractere do parêntese direito não for encontrado, ler a
 *         expressão da esquerda para a direta.
 *              Se o caractere atual for um dígito, faça o seguinte:
 *                   Adicione seu valor inteiro à pilha (o valor inteiro de um
 *                   caractere de dígito é seu valor no conjunto de caractares
 *                   do computador menos o valor de '0' em Unicode).
 *              Caso contrário, se o caractere atual for um operador:
 *                   Remover os dois elementos superiores da pilha para
 *                      variaveis x e y.
 *                  Calcule y operador x.
 *              Insira o resultado do cálculo na pilha.
 *      c) Quando o parêntese direito for encontrado na expressão, remover o
 *         valor do topo da pilha. Esse e o resultado da expressão pós-fixa.
 *         [Nota: Em (b) acima (com base na expressão de exemplo no inicio deste
 *         exercício), se o operador for '/', a parte superior da pilha é 2 e o
 *         próximo elemento na pilha é 8, então remova 2 para x, remova 8 para
 *         y, avalie 8 / 2 e adicione o resultado, 4, de volta à pilha. Essa
 *         nota lambém se aplica ao operador '-'.] As operações aritméticas
 *         permitidas em uma expressão são:
 *              + adição
 *              - subtração
 *              * multiplicação
 *              / divisão
 *              ^ exponenciação
 *              % resto
 * A pilha deve ser mantida com uma das classes de pilha introduzidas neste
 * capítulo. Você pode querer fornecer os seguintes métodos:
 *      a) O método evaluatePostfixExpression, que avalia a expressão pos-fixa.
 *      b) O método calculate, que avalia a expressão op1 operator op2.
 *      c) O método push, que insere um valor na pilha.
 *      d) O método pop, que remove um valor da pilha.
 *      e) O método isEnpty, que determina se a pilha esta vazia.
 *      f) O método printStack, que imprime a pilha.
 */

package ch17.Exer17_13;

public class Exer17_13 {

}
