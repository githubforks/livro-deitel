/*
 * Pilhas são utilizadas por compiladores para ajudar no processo de avaliar
 * expressões e gerar codigo de linguagem de máquina. Neste e no próximo
 * exercício, investigamos como os compiladores avaliam expressões aritméticas
 * que consistem apenas em constantes, operadores e parenteses.
 *      Os humanos geralmente escrevem expressões como 3 + 4 e 7 / 9 em que o
 * operador (+ ou / aqui) é escrito entre seus operandos - isso é chamado
 * notação infixa. Os computadores 'preferem' a notação pós-fixa em que o
 * operador é escrito a direita de seus dois operandos. As expressões infixas
 * precedentes apareceriam na notação pos-fixa como 3 4 + e 7 9 /,
 * respectivamente.
 *      Para avaliar uma expressão infixa complexa, um compilador primeiro
 * converteria a expressão em notação pós-fixa e avaliaria a versão. Cada um
 * desses algoritmos requer apenas uma única passagem da esquerda para a direita
 * pela expressão. Cada algoritmo utiliza um objeto pilha em suporte de sua
 * operação, mas cada um utiliza a pilha para um propósito diferente.
 *      Nesse exercício, você escreverá uma versão Java do algoritmo de
 * conversão de infixo para pós-fixo. No próximo exercício, você escreverá uma
 * versão Java do algoritmo de avaliação de expressão pós-fixa. Em um exercício
 * posterior, você descobrirá que o código que você escrever nesse exercicio
 * pode ajudá-lo a implementar um compilador completo.
 *      Escreva a classe InfixToPostfix para para converter uma expressão
 * aritmética infixa comum (assuma que uma expressão válida foi inserido) com
 * inteiros de único dígito como
 *      (6 + 2) * 5 - 8/4
 * para uma expressão pós-fixa. A versão pós-fixa da expressão infixa precedente
 * é (note que nenhum parêntese é necessário)
 *      6 2 + 5 * 8 4 / -
 * O programa deve ler a expressão no StringBuffer infix e utilizar uma das
 * classes de pilha implementadas neste capítulo para ajudar a criar a expressão
 * pós-fixa no StringBuffer postfix. O algoritmo para criar uma expressão
 * pós-fixa é o seguinte:
 *      a) Adicionar um parentese esquerdo '(' à pilha.
 *      b) Acrescentar um parêntese direito ')' ao final de infix.
 *      c) Enquanto a pilha não estiver vazia, ler infix da esquerda para a
 *         direita e fazer o seguinte:
 *              Se o caractere atual em infix for um dígito, acrescentá-lo a
 *              postfix.
 *
 *              Se o caractere atual em infix for um parêntese esquerdo,
 *              adicioná-lo à pilha.
 *
 *              Se o caractere atual em infix for o operador:
 *                  Remover operadores (se houver algum) do topo da pilha
 *                  enquanto eles tiverem procedência igual ou mais alta que a
 *                  do operador atual e acrescentar os operadores removidos a
 *                  postfix.
 *
 *                  Adicionar o caractere atual a infix na pilha.
 *              Se o caractere atual em infix for um parêntese direito:
 *                  Remover operadores do topo da pilha e acrescentá-los a
 *                  postfix até que um parêntese esquerdo esteja ao tapo da
 *                  pilha.
 *
 *                  Remover (e descartar) o parentese esquerdo da pilha.
 *
 * As seguintes operações aritméticas são permitidas em uma expresso:
 *      + adição
 *      - subtração
 *      * multiplicação
 *      / divisão
 *      ^ exponenciação
 *      % resto
 * A pilha deve ser mantida com nós de pilha que cada um contém uma variável de
 * instância e uma referência ao próximo nó de pilha. Alguns métodos que você
 * pode querer fornecer são apresentados a seguir:
 *      a) O método convertToPostfix, que converte a expressão infixa em notação
 *         pós-fixa.
 *      b) O método isOperator, que determina se c é um operador.
 *      c) O método precedence, que determina se a precedência do operator1
 *         (proveniente da expressão infixa) é menor que, igual ou maior que
 *         aprecedência do operator2 (proveniente da pilha). O método retorna
 *         true se operator1 tiver precedência mais baixa que operator2. Caso
 *          contrário, false é retornado.
 *      d) O método stackTop (que deve ser adicionado a classe de pilha), que
 *         retorna o valor superior da pilha sem estourar a pilha.
 */

package ch17.Exer17_12;

public class Exer17_12 {

}
