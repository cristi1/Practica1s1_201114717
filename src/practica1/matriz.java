package practica1;

public class matriz {
    
    public void add(listaCabecera col, listaCabecera fil, int tipo, int x, int y){
        nodoMatriz actX=null,actY=null;
        nodoMatriz nuevo=new nodoMatriz(tipo,x,y);
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
    
    private nodoMatriz ubicarColumna(nodoMatriz primero, nodoMatriz nuevo, int x){
        nodoMatriz aux=primero;
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
    
    private nodoMatriz ubicarFila(nodoMatriz primero, nodoMatriz nuevo, int y){
        nodoMatriz aux=primero;
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
    
    private void ubicarProfundidad(nodoMatriz base, nodoMatriz nuevo){
        nodoMatriz aux=base;
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
            nodoMatriz aux1=aux.interior;
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
            nodoMatriz aux1=aux.interior;
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
    
    private void recProfundidad(nodoMatriz base){
        nodoMatriz aux=base;
        if(aux.atras!=null){
            while(aux!=null){
                System.out.print("¡"+aux.tipo+"! ");
                aux=aux.atras;
            }
        }
    }
}