/*
 * Modifique o Exercício 11.18 para permiti ao usuário salvar um desenho em um
 * arquivo ou carregar um desenho anterior a partir de um arquivo utilizando
 * serialização de objeto. Adicione botões Load (para ler objetos de um arquivo)
 * e Save (para gravar objetos em um arquivo). Utilize um ObjectOutputStream
 * para gravar no arquivo e um ObjectInputStream para ler o arquivo. Escreva o
 * array de objetos MyShape utilizando o método writeObject (classe
 * ObjectOutputStream), e leia o array utilizando o método readObject
 * (ObjectInputStram). Observe que o mecanismo de serialização de objeto pode
 * ler ou gravar arrays inteiros - não é necessário manipular cada elemento do
 * array de objetos MyShape individualmente. Simplesmente é exigido que todas as
 * formas sejam Serializable. Como o array de objetos MyShape é de comprimento
 * 100 (e necessariamente não é preenchido com formas desenhadas pelo usuário),
 * você também pode querer armazenar o número de formas desenhadas no arquivo.
 * Para os dois botões Load e Save, utilize um JFileChooser para permitir que o
 * usuário selecione o arquivo em que as formas serão armazenadas ou do qual
 * elas serão lidas. Quando o usuário executa o programa pela primeira vez,
 * nenhuma forma deve ser exibida na tela.
 *      O usuário pode exibir formas abrindo um arquivo previamente salvo de
 * formas ou clicando no botão Generate Shapes. Quando se clica no botão
 * Generate Shapes, o aplicativo deve gerar um número aleatório de formas até um
 * total de 15. Uma vez que haja formas na tela, os usuários podem salvá-las em
 * um arquivo utilizando o botão Save.
 */

package ch14.Exer14_14;

public class Exer14_14 {

}
