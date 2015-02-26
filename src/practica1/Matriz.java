package practica1;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Matriz {
    
    public void add(listaCabecera col, listaCabecera fil, nodoPersonaje nuevo, int x, int y){
        nodoPersonaje actX=null,actY=null;
        nodoCabecera auxC,auxF;
        auxC=col.buscar(y);     //todos los nodos a buscar deben existir
        auxF=fil.buscar(x);
        if(auxC.interior==null){
            auxC.interior=nuevo;
        }else{
            actX=ubicarColumna(auxC.interior,nuevo,x);
        }
        if(auxF.interior==null){
            auxF.interior=nuevo;
        }else{
            actY=ubicarFila(auxF.interior,nuevo,y);
        }
        if(actX!=null && actY!=null){
            ubicarProfundidad(actX,nuevo);
        }
    }
    
    private nodoPersonaje ubicarColumna(nodoPersonaje primero, nodoPersonaje nuevo, int x){
        nodoPersonaje aux=primero;
        while(aux.abajo!=null && aux.posx!=x){
            aux=aux.abajo;
        }
        if(aux.posx==x){//verificar
            return aux;
            //ubicarProfundidad(aux,nuevo);
        }else{
            aux.abajo=nuevo;
            nuevo.arriba=aux;
            return null;
        }
    }
    
    private nodoPersonaje ubicarFila(nodoPersonaje primero, nodoPersonaje nuevo, int y){
        nodoPersonaje aux=primero;
        while(aux.sig!=null && aux.posy!=y){
            aux=aux.sig;
        }
        if(aux.posy==y){//verificar
            return aux;
            //ubicarProfundidad(aux,nuevo);
        }else{
            aux.sig=nuevo;
            nuevo.ant=aux;
            return null;
        }
    }
    
    private void ubicarProfundidad(nodoPersonaje base, nodoPersonaje nuevo){
        nodoPersonaje aux=base;
        while(aux.atras!=null){
            aux=aux.atras;
        }
        aux.atras=nuevo;
        nuevo.adelante=aux;
    }
    
    public void recorrer(listaCabecera columna, listaCabecera fila){
        recColumna(columna);
        recFila(fila);
    }
    
    private void recColumna(listaCabecera columna){
        nodoCabecera aux=columna.primero;
        while(aux!=null){
            System.out.println("<"+aux.id+">");
            nodoPersonaje aux1=aux.interior;
            while(aux1!=null){
                System.out.print("("+aux1.posx+","+aux1.posy+") ");
                aux1=aux1.abajo;
            }
            System.out.println();
            aux=aux.sig;
        }
    }
    private void recFila(listaCabecera fila){
        nodoCabecera aux=fila.primero;
        while(aux!=null){
            System.out.println("<"+aux.id+">");
            nodoPersonaje aux1=aux.interior;
            while(aux1!=null){
                System.out.println("["+aux1.posx+","+aux1.posy+"] ");
                recProfundidad(aux1);//rev
                System.out.println();//rev
                aux1=aux1.sig;
            }
            System.out.println();
            aux=aux.sig;
        }
    }
    
    private void recProfundidad(nodoPersonaje base){
        nodoPersonaje aux=base;
        if(aux.atras!=null){
            while(aux!=null){
                System.out.print("¡"+aux.tipo+" "+aux.nombre+"! ");
                aux=aux.atras;
            }
        }
    }
    
    private String contenidoCOL(listaCabecera columna){
        String cad="";    
        nodoCabecera aux=columna.primero;
        while(aux!=null){
            nodoPersonaje aux1=aux.interior;
            if(aux1!=null){
                cad=cad+aux1.posx+aux1.posy+"; ";
            while(aux1!=null){
                if(aux1.arriba!=null){
                    cad=cad+aux1.posx+aux1.posy+" -> "+aux1.arriba.posx+aux1.arriba.posy+"[constraint=false];";
                }
                if(aux1.abajo!=null){
                    cad=cad+aux1.posx+aux1.posy+" -> "+aux1.abajo.posx+aux1.abajo.posy+"[constraint=false]; ";
                }
                aux1=aux1.abajo;
            }
            }
            aux=aux.sig;
        }
        return cad;
    }
    
    private String contenidoFIL(listaCabecera fila){
        nodoCabecera aux=fila.primero;
        String cad="";
        while(aux!=null){
            nodoPersonaje aux1=aux.interior;
            if(aux1!=null){
                cad=cad+aux1.posx+aux1.posy+"; ";
            while(aux1!=null){
                if(aux1.sig!=null){
                    cad=cad+aux1.posx+aux1.posy+" -> "+aux1.sig.posx+aux1.sig.posy+"[constraint=false]; ";
                }
                if(aux1.ant!=null){
                    cad=cad+aux1.posx+aux1.posy+" -> "+aux1.ant.posx+aux1.ant.posy+"; [constraint=false];";
                }
                aux1=aux1.sig;
            }
        }
            aux=aux.sig;
        }
        return cad;
    }
    
    public void graficar(listaCabecera columna, listaCabecera fila){
        String cad1=contenidoCOL(columna);
        String cad0=contenidoFIL(fila);
        
        try{
    	File creardot = new File("/home/clnx/Escritorio/Estructuras/EDD1sem2015/Practica1/src/practica1/tablero.dot"); //Crear un objeto File que se encarga de crear un arch. esp. en su constructor
    	FileWriter escritor = new FileWriter(creardot,false); //false para que vaya al inicio del arch. a escribir 
            try (PrintWriter impresor = new PrintWriter(escritor)) {
                impresor.println("digraph G { node[shape=box, style=filled, color=Gray95]; edge[color=blue]; rankdir=RL ");//rankdir=LR
                impresor.println(cad0+cad1+"\n label = \"Tablero\";");
                impresor.println("}");
            }
    	}catch(Exception er){	
    		System.out.println(er.getMessage());
    		er.printStackTrace();
    	}  
            try{
                String dot="/home/clnx/Escritorio/Estructuras/EDD1sem2015/Practica1/src/practica1/tablero.dot";
                String png="/home/clnx/Escritorio/Estructuras/EDD1sem2015/Practica1/src/practica1/tablero.png";
                ProcessBuilder pbuilder;
                pbuilder = new ProcessBuilder( "dot", "-Tpng", "-o", png, dot );
                pbuilder.redirectErrorStream( true );
                pbuilder.start();
            } catch (Exception e) { e.printStackTrace(); } 
    }
}
