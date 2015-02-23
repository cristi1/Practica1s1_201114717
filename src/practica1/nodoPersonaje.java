package practica1;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class nodoPersonaje extends JLabel{
    String nombre;
    String pic;
    int puntos;
    int ataque;
    nodoPersonaje ant;
    nodoPersonaje sig;
    
    nodoPersonaje(String nombre,String pic,int puntos,int ataque){
        this.nombre=nombre;
        this.pic=pic;
        this.puntos=puntos;
        this.ataque=ataque;
        this.setIcon(icono(pic));
        this.setSize(40,40);
        this.setVisible(true);
        this.ant=null;
        this.sig=null;
    }
    
    private ImageIcon icono(String pic){
        ImageIcon portadap= new ImageIcon(pic);//"grafico.jpg"
        Image imagenp = portadap.getImage();
        ImageIcon tamanop = new ImageIcon(imagenp.getScaledInstance(40,40,Image.SCALE_SMOOTH));//SCALE_SMOOTH
        return tamanop;
    }
    
}
