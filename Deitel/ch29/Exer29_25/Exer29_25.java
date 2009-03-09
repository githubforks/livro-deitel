/*
 * (Projeto: Um corrector ortográfico) Muitos pacotes populares de software
 * processador de texto têm verificadores ortográficos integrados. Nesse projeto
 * exige-se que você desenvolva seu próprio utilitário de verificado
 * ortográfica. Fazemos sugestões para ajudar você a começar. Você então deve
 * considerar a adição de mais capacidades. Utilize um dicionário
 * computadorizado (se você tiver acesso a um) como uma fonte de palavras.
 *      Por que digitamos tantas palavras com ortografia incorrera? Em alguns
 * casos, isso e porque simplesmente não conhecemos a ortografia correra, então
 * fazemos nossa 'melhor suposição'. Em alguns casos, é porque transpomos duas
 * letras (por exemplo, 'perdão' em vez de 'padrão'). Ocasionalmente digitamos
 * duas vezes uma letra acidentalmente (por exemplo, canssado' em vez de
 * 'cansado'). Às vezes digitamos uma tecla próxima em vez daquela pretendida
 * (por exemplo, 'amiversário' em vez de'aniversário') e assim por diante.
 *      Projete e implemente um aplicativo de verificador ortográfico em Java.
 * Seu aplicativo deve manter um array wordList de strings. Permita que o
 * usuário insira essas strings. [Nota: No Capítulo 14, introduzimos o
 * processamento de arquivo. Com essa capacidade, você pode obter as palavras
 * para o verificador ortográfico de um dicionário computadorizado armazenado em
 * um arquivo.]
 *      Seu aplicativo deve solicitar que um usuário insira uma palavra. O
 * aplicativo deve então pesquisar essa palavra no array wordList. Se a palavra
 * estiver no array, seu aplicativo deve imprimir 'A palavra está escrita
 * corretamente'. Se a palavra não estiver no array, seu aplicativo deve
 * imprimir 'A palavra não está escrita corretamente'. Então seu aplicativo deve
 * tentar localizar outras palavras em wordList que talvez sejam a palavra que o
 * usuário pretendeu digitar. Por exemplo, você pode tentar todas as
 * transposições possiveis simples de letras adjacentes para descobrir que a
 * palavra 'default' é uma correspondência direta com uma palavra em wordList.
 * Naturalmente, isso implica que seu aplicativo verificará todas as outras
 * transposicões simples, como 'edfault', 'dfeault', 'deafult', 'defalut', e
 * 'defautl'. Quando você encontrar uma nova palavra que localize uma palavra na
 * ordList, imprima essa palavra em uma mensagem, como
 *
 *      Did you mean "default"?
 *
 * Implemente outros testes, como substituir cada letra dupla por uma única
 * letra e algum outro teste que voce pode desenvolver para aprimarar o valor de
 * seu verificador ortográfico.
 */

package ch29.Exer29_25;

public class Exer29_25 {

}
