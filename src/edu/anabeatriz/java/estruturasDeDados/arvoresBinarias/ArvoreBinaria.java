package edu.anabeatriz.java.estruturasDeDados.arvoresBinarias;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;
    
    public ArvoreBinaria() {
        this.raiz = null;
    }

    //Método recursivo de inserção
    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
        if(atual == null){
            //Inserindo a raiz
            return novoNo;

            //Comparando se o novo é menor que o atual
        } else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            //Vai pra esquerda
            atual.setNoEsquerdo(inserir(atual.getNoEsquerdo(), novoNo));

        } else {
            //É maior, vai para a direita
            atual.setNoDireito(inserir(atual.getNoDireito(),  novoNo));
        }
        return atual;
    }

    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        this.raiz = inserir(raiz, novoNo);
    }

    private void exibirInOrdem(BinNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsquerdo());
            System.out.print(atual.getConteudo()+ ", ");
            exibirInOrdem(atual.getNoDireito());
        }
    }
    public void exibirInOrdem(){
        System.out.print("\nExibição in-ordem: ");
        exibirInOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsquerdo());
            exibirPosOrdem(atual.getNoDireito());
            System.out.print(atual.getConteudo()+ ", ");
        }
    }
    public void exibirPosOrdem(){
        System.out.print("\nExibição pós-ordem: ");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.print(atual.getConteudo()+ ", ");
            exibirPreOrdem(atual.getNoEsquerdo());
            exibirPreOrdem(atual.getNoDireito());
        }
    }
    public void exibirPreOrdem(){
        System.out.print("\nExibição pré-ordem: ");
        exibirPreOrdem(this.raiz);
    }

    public void remover(T conteudo){
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temporario = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getNoEsquerdo();

                } else{
                    atual = atual.getNoDireito();
                }
            }
            if(atual == null)
                System.out.println("Conteúdo não encontrado.");

            if(pai == null){
                if(atual.getNoDireito() == null){
                    this.raiz = atual.getNoEsquerdo();

                } else if(atual.getNoEsquerdo() == null){
                    this.raiz = atual.getNoDireito();

                } else{
                    for(
                        temporario = atual, filho = atual.getNoEsquerdo();
                        filho.getNoDireito() != null;
                        temporario = filho, filho = filho.getNoEsquerdo()
                    ){
                            if(filho != atual.getNoEsquerdo()){
                                temporario.setNoDireito(filho.getNoEsquerdo());
                                filho.setNoEsquerdo(raiz.getNoEsquerdo());
                            }
                    }
                    filho.setNoDireito(raiz.getNoDireito());
                    raiz = filho;
                }

            //Se a referencia de nó a direita do nó atual é nula
            } else if(atual.getNoDireito() == null){
                if(pai.getNoEsquerdo() == atual){
                    pai.setNoEsquerdo(atual.getNoEsquerdo());

                } else{
                    pai.setNoDireito(atual.getNoEsquerdo());
                }

            //Se a referencia de nó a esquerda do nó atual é nula
            } else if(atual.getNoEsquerdo() == null){
                if(pai.getNoEsquerdo() == atual){
                    pai.setNoEsquerdo(atual.getNoDireito());

                } else{
                    pai.setNoDireito(atual.getNoDireito());
                }

            } else{
                for(
                    temporario = atual, filho = atual.getNoEsquerdo();
                    filho.getNoDireito() != null;
                    temporario = filho, filho = filho.getNoDireito()
                ){
                    if(filho != atual.getNoEsquerdo()){
                        temporario.setNoDireito(filho.getNoEsquerdo());
                        filho.setNoEsquerdo(atual.getNoEsquerdo());
                    }
                    filho.setNoDireito(atual.getNoDireito());

                    if(pai.getNoEsquerdo() == atual){
                        pai.setNoEsquerdo(filho);
                    } else{
                         pai.setNoDireito(filho);
                    }
                }
            }
            
        } catch (NullPointerException erro) {
            System.out.println("Conteúdo não encontrado.");
        }
    }
}
