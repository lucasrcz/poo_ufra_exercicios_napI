package Classes;

public class Pedido {
    
    private double valorTotal ;
    private int numeroDeItens ;
    
    
    public Pedido(double valorTotal , int numeroDeItens){

        this.valorTotal = valorTotal ;
        this.numeroDeItens = numeroDeItens;

    }

    public void pagar(){
        System.out.println("Pagando " + this.valorTotal + " do pedido");
    }

    public void cancelar(){
        System.out.println("Cancelando pedido com " + this.numeroDeItens + " itens");
    }

    public void adicionarItem(Produto item){
        this.numeroDeItens ++;
        this.valorTotal += item.getValor();
    }
    
    public double getValorTotal() {
        return this.valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public int getNumeroDeItens() {
        return this.numeroDeItens;
    }
    public void setNumeroDeItens(int numeroDeItens) {
        this.numeroDeItens = numeroDeItens;
    }
    
    
}
