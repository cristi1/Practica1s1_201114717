package practica1;

/**
 *
 * @author clnx
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //jiijjijjiji
        System.out.println("Hola a todos :J");
        listaCabecera c=new listaCabecera();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        listaCabecera f=new listaCabecera();
        f.add(1);
        f.add(2);
        matriz tablero=new matriz();
        tablero.add(c, f, 0, 1, 1);
        tablero.add(c, f, 1, 1, 1);
        tablero.add(c, f, 2, 1, 1);
        tablero.add(c, f, 3, 1, 1);
        tablero.add(c, f, 4, 1, 1);
        tablero.add(c, f, 5, 1, 1);
        tablero.add(c, f, 0, 2, 1);
        tablero.add(c, f, 0, 1, 2);
        tablero.add(c, f, 0, 2, 2);
        tablero.add(c, f, 1, 2, 2);
        tablero.add(c, f, 2, 2, 2);
        tablero.recorrer(c, f);
        
    }  
}
