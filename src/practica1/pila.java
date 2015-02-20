package practica1;

public class pila {
    nodoMatriz cima;
    
    pila(){
        this.cima=null;
    }
    
    public void add(int tipo, int x, int y, String pic, int danio, int ataque){
        nodoMatriz nuevo=new nodoMatriz(tipo,x,y,pic,danio,ataque);
        if(cima==null){
            cima=nuevo;
        }else{
            cima.sig=nuevo;
            nuevo.ant=cima;
            cima=nuevo;
        }
    }
    
    public void recorrer(){
        nodoMatriz aux=cima;
        while(aux!=null){
            System.out.print("<"+aux.tipo+"> ");
            aux=aux.ant;
        }
        System.out.println();
    }
}
