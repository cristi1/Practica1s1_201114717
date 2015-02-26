package practica1;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class nodoPersonaje extends JLabel{
    String nombre;
    String pic;
    int puntos;
    int ataque;
    int tipo;
    int posx;
    int posy;
    nodoPersonaje ant;
    nodoPersonaje sig;
    nodoPersonaje arriba;
    nodoPersonaje abajo;
    nodoPersonaje atras;
    nodoPersonaje adelante;
    
    nodoPersonaje(int tipo, int x, int y, String nombre,String pic,int puntos,int ataque){
        this.nombre=nombre;
        this.pic=pic;
        this.puntos=puntos;
        this.ataque=ataque;
        this.tipo=tipo;
        this.setIcon(new ImageIcon(getClass().getResource(pic)));
        this.setSize(400,120);
        this.posx=x;
        this.posy=y;
        this.ant=null;
        this.sig=null;
        this.arriba=null;
        this.abajo=null;
        this.atras=null;
        this.adelante=null;
    }
}
