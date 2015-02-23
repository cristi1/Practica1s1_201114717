package practica1;

public class nodoJugador {
    String texto;
    int tipo;
    int cantidad;
    nodoJugador sig;
    nodoJugador otros;
    
    nodoJugador(int tipo, String texto, int cantidad){
        this.texto=texto;
        this.tipo=tipo;
        this.cantidad=cantidad;
        this.sig=null;
        this.otros=null;
    }
}
