package practica1;

public class nodoMatriz {
    int tipo;
    int posx;
    int posy;
    nodoMatriz ant;
    nodoMatriz sig;
    nodoMatriz arriba;
    nodoMatriz abajo;
    nodoMatriz atras;
    nodoMatriz adelante;
    //nodoCabecera cabeza;
    
    nodoMatriz(int tipo, int posx, int posy){
        this.tipo=tipo;
        this.posx=posx;
        this.posy=posy;
        this.ant=null;
        this.sig=null;
        this.arriba=null;
        this.abajo=null;
        this.atras=null;
        this.adelante=null;
        //this.cabeza=null;
    }   
}
