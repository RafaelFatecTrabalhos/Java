/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.academico;

import sistema.academico.Work_data.Aluno;

/**
 *
 * @author Orion
 */
public class VetorAluno {

   
    private final Aluno[] objetos = new Aluno[100];
    private int totalDeObjetos = 0;

    public void adiciona(Aluno objeto) {
        this.garantaEspaco();
        this.objetos[this.totalDeObjetos] = objeto;
        this.totalDeObjetos++;
        System.out.println("Cadastrado com sucesso!");
    }

    public void adiciona(int posicao, Aluno aluno) {
        this.garantaEspaco();
        if (!this.posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = this.totalDeObjetos - 1; i >= posicao; i--) {
            this.objetos[i + 1] = this.objetos[i];
        }
        this.objetos[posicao] = aluno;
        this.totalDeObjetos++;
        System.out.println("Cadastrado com sucesso!");
    }

    public Aluno pega(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.objetos[posicao];
    }

    public void remove(int posicao) 
    {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i < this.totalDeObjetos - 1; i++) {
            this.objetos[i] = this.objetos[i + 1];
        }
        this.totalDeObjetos--;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.totalDeObjetos; i++) {
            if (aluno.equals(this.objetos[i])) {
                return true;
            }
        }
        return false;

    }

    public int tamanho() {
        return this.totalDeObjetos;
    }
    
    
    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeObjetos;
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= this.totalDeObjetos;
    }

    private void garantaEspaco() {
        if (this.totalDeObjetos == this.objetos.length) {
            Object[] novaArray = new Object[this.objetos.length * 2];
            System.arraycopy(this.objetos, 0, novaArray, 0, this.objetos.length);
            
        }
    }
    
    public void Listar()
    {    System.out.println("\t\n ALUNOS");
        if(this.totalDeObjetos != 0)
        for(int i = 0; i > this.totalDeObjetos; i++)
            System.out.println("Nome: "+this.objetos[i].toString());
    }
}
