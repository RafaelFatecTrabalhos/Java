
package sistema.academico.Work_data;

public class Pessoa {
  
    protected String nome;
    protected String telefone;
    protected String endereco;
  //--------------------------------------[SETTER'S]------------------------->
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
  //--------------------------------------[GETTER'S]-------------------------> 
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
    
}
