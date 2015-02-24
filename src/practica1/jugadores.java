package practica1;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

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
    
    public void grafica(){
        nodoJugador aux=raiz;
        String cad="";
        if(aux!=null){
        while(aux!=null){
            if(aux.sig!=null){
                cad=cad+aux.texto+" -> "+aux.sig.texto+" ;";
            }
            nodoJugador aux1=aux.otros;
            if(aux1!=null){
                cad=cad+aux.texto+" -> "+aux1.texto+" ;";
                while(aux1!=null){
                    if(aux1.otros!=null){
                        cad=cad+aux1.texto+" -> "+aux1.otros.texto+" ;";
                    }
                    aux1=aux1.otros;
                }
            }
            aux=aux.sig;
        }
        }
        archivo(cad);
    }
    
    private void archivo(String cadena){
        try{
    	File creardot = new File("/home/clnx/Escritorio/Estructuras/EDD1sem2015/Practica1/src/practica1/jugadores.dot"); //Crear un objeto File que se encarga de crear un arch. esp. en su constructor
    	FileWriter escritor = new FileWriter(creardot,false); //false para que vaya al inicio del arch. a escribir 
            try (PrintWriter impresor = new PrintWriter(escritor)) {
                impresor.println("digraph G { node[shape=box, style=filled, color=Gray95]; edge[color=blue];  rankdir=UD;");
                impresor.println("subgraph cluster_0 {  style=filled;  color=lightgrey;  node [style=filled,color=white]; ");
                impresor.println(cadena);
                impresor.println(" label = \"\"Jugadores\"\";  }");
            }
    	}catch(Exception er){	
    		System.out.println(er.getMessage());
    		er.printStackTrace();
    	}  
            try{
                String dot="/home/clnx/Escritorio/Estructuras/EDD1sem2015/Practica1/src/practica1/jugadores.dot";
                String png="/home/clnx/Escritorio/Estructuras/EDD1sem2015/Practica1/src/practica1/jugadores.png";
                ProcessBuilder pbuilder;
                pbuilder = new ProcessBuilder( "dot", "-Tpng", "-o", png, dot );
                pbuilder.redirectErrorStream( true );
                pbuilder.start();
            } catch (Exception e) { e.printStackTrace(); } 
        
        
    }   
}
