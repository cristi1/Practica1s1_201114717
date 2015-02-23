package practica1;

public class jugadores {
    private nodoJugador raiz;
    private nodoJugador ultimo;
    
    jugadores(){
        this.raiz=null;
    }
    
    public void add(int tipo, String texto, int cantidad){
        nodoJugador nuevo=new nodoJugador(tipo,texto,cantidad);
        if (raiz==null){
            raiz=nuevo;
            ultimo=nuevo;
        }else{
            ultimo.sig=nuevo;
            ultimo=nuevo;
        }
    }
    
    public void otros(int jugador,String texto){
        nodoJugador auxiliar=raiz;
        while(auxiliar.sig!=null && auxiliar.tipo!=jugador){
            auxiliar=auxiliar.sig;
        }
        if(auxiliar.tipo==jugador){
            nodoJugador aux=auxiliar.otros;
            nodoJugador nuevo=new nodoJugador(jugador,texto,0);
            if(aux==null){
                auxiliar.otros=nuevo;
            }else{
                while(aux.otros!=null){
                    aux=aux.otros;
                }
                aux.otros=nuevo;
            }
        }
    }
    
    public boolean completa(){
        nodoJugador aux=raiz;
        int c=0;
        while(aux!=null){
            c++;
            aux=aux.sig;   
        }
        if(c==2){
            return true;
        }else{
            return false;
        }
    }
    
    public void recorrer(){
        nodoJugador aux=raiz;
        while(aux!=null){
            System.out.println("["+aux.texto + " --> "+aux.tipo+"]");
            nodoJugador aux1=aux.otros;
            while(aux1!=null){
                System.out.print(aux1.texto+aux1.tipo+" ");
                aux1=aux1.otros;
            }
            System.out.println();
            aux=aux.sig;
        }
    }
}
