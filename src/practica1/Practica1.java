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
        jugadores j=new jugadores();
        inicio ventana=new inicio();
        ventana.setVisible(true);
        listaCabecera c=new listaCabecera();
        c.add(1);
        c.add(2);
        c.add(3);
        listaCabecera f=new listaCabecera();
        f.add(1);
        f.add(2);
        f.add(3);
        Matriz tablero=new Matriz();
        nodoPersonaje a=new nodoPersonaje(0,1,1,"cesped1","cesped.jpeg",0,0);
        nodoPersonaje a1=new nodoPersonaje(0,1,2,"cesped2","cesped.jpeg",0,0);
        nodoPersonaje a2=new nodoPersonaje(0,1,3,"cesped3","cesped.jpeg",0,0);
        nodoPersonaje a3=new nodoPersonaje(0,2,1,"cesped4","cesped.jpeg",0,0);
        nodoPersonaje a4=new nodoPersonaje(0,2,2,"cesped5","cesped.jpeg",0,0);
        nodoPersonaje a5=new nodoPersonaje(0,2,3,"cesped6","cesped.jpeg",0,0);
        nodoPersonaje a0=new nodoPersonaje(0,3,1,"cesped7","cesped.jpeg",0,0);
        nodoPersonaje aa0=new nodoPersonaje(0,3,2,"cesped8","cesped.jpeg",0,0);
        nodoPersonaje aaa0=new nodoPersonaje(0,3,3,"cesped9","cesped.jpeg",0,0);


        tablero.add(c, f, a, 1, 1); // nodopersonaje,x,y
        tablero.add(c, f, a1, 1, 2);
        tablero.add(c, f, a2, 1, 3);
        tablero.add(c, f, a3, 2, 1);
        tablero.add(c, f, a4, 2, 2);
        tablero.add(c, f, a5, 2, 3);
        tablero.add(c, f, a0, 3, 1);
        tablero.add(c, f, aa0, 3, 2);
        tablero.add(c, f, aaa0, 3, 3);
        tablero.recorrer(c, f);
        tablero.graficar(c, f);
        /*pila p=new pila();
        p.add(1, 0, 0, "", 5, 1);
        p.add(11, 0, 0, "", 5, 2);
        p.add(111, 0, 0, "", 5, 1);
        p.add(1111, 0, 0, "", 5, 2);
        p.add(11111, 0, 0, "", 5, 1);
        
        p.recorrer();
        
        cola cc=new cola();
        cc.add(2, 0, 0, "", 4, 1);
        cc.add(22, 0, 0, "", 4, 1);
        cc.add(222, 0, 0, "", 4, 1);
        cc.add(2222, 0, 0, "", 4, 1);
        cc.add(22222, 0, 0, "", 4, 1);
        cc.add(222222, 0, 0, "", 4, 1);
        cc.add(2222222, 0, 0, "", 4, 1);
        
        cc.recorrer();
        */
    }  
}
