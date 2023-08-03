package Classes;

public class Pessoa {
    private String nome;
    private String tratamento;
    
    
    
    
    public Pessoa(String nome, String tratamento) {
        this.nome = nome;
        this.tratamento = tratamento;
    }


    public void cumprimentar(String menssagem){
        System.out.println(menssagem);
    }

    public void cumprimentar(Pessoa pessoa ,String messagem){
        System.out.println(pessoa.getTratamento() + " " + pessoa.getNome() + " " + messagem);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTratamento() {
        return tratamento;
    }
    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }

    
}
