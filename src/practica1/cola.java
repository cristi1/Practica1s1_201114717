package practica1;

public class cola {
    nodoMatriz primero;
    nodoMatriz ultimo;
    
    cola(){
        primero=null;
        ultimo=null;
    }
    
    public void add(int tipo, int x, int y, String pic, int danio, int ataque){
        nodoMatriz nuevo=new nodoMatriz(tipo,x,y,pic,danio,ataque);
        if(primero==null){
            primero=nuevo;
            ultimo=nuevo;
        }else{
            ultimo.sig=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
    }
    
    public void recorrer(){
        nodoMatriz aux=primero;
        while(aux!=null){
            System.out.print("["+aux.tipo+"] ");
            aux=aux.sig;
        }
        System.out.println();
    }
}
