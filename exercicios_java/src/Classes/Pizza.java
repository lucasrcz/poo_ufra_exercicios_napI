package Classes;

public class Pizza {


    private String sabor;
    
    private String tamanho;

    public Pizza(String sabor , String tamanho){
        this.sabor = sabor;
        this.tamanho = tamanho;
    }
   
    public String getSabor() {
        return this.sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }


}
