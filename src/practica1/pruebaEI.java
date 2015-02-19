package practica1;
import javax.swing.JLabel;

public class pruebaEI extends JLabel implements Runnable{
    
    int punteo;
    int x;
    int y;
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setPunteo(int punteo){
        this.punteo=punteo;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    
    public int getPunteo(){
        return this.punteo;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }  
}
