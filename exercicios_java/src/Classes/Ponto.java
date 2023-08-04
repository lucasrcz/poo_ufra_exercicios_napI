package Classes;

public class Ponto {
    private  double x;
    private  double y;
    
    
    
    
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double distancia(double x ,double y){
        return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2) );
    }

    public double distancia(Ponto ponto){
        return Math.sqrt(Math.pow((ponto.getX() - this.x), 2) + Math.pow((ponto.getY() - this.y), 2) );
    }


    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }



    
}
