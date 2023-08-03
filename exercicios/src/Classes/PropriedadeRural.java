package Classes;

public class PropriedadeRural {
    
   private String nome;
   private double area;
   private String proprietario;
    
    
    public PropriedadeRural(String nome, double area, String proprietario) {
        this.nome = nome;
        this.area = area;
        this.proprietario = proprietario;
    }


    public void plantar(){
        System.out.println("Plantando na " + this.nome + " do " + this.proprietario);
    }

    public void adubar(){
        System.out.println("Adubando a " + this.nome);
    }


    public String getNome() {
        return this.nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getArea() {
        return this.area;
    }


    public void setArea(double area) {
        this.area = area;
    }


    public String getProprietario() {
        return this.proprietario;
    }


    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    

    
}
