package practica1;

public class Catalogo {
    public nodoPersonaje primero;
    public nodoPersonaje ultimo;
    
    Catalogo(){
        primero=null;
        ultimo=null;
    }
    
    public void add(int tipo, int x, int y,String nombre, String pic, int puntos, int ataque){
        if(primero==null){
            nodoPersonaje nuevo=new nodoPersonaje(tipo,x,y,nombre,pic,puntos,ataque);
            primero=nuevo;
            ultimo=nuevo;
        }else{
            boolean r=buscar(nombre);
            if(r==false){
                nodoPersonaje nuevo=new nodoPersonaje(tipo,x,y,nombre,pic,puntos,ataque);
                ultimo.sig=nuevo;
                nuevo.ant=ultimo;
                ultimo=nuevo;
            }
        }
    }
    
    public boolean vacia(){
        if(primero!=null){
            return false;
        }else{
            return true;
        }
    }
    
    public boolean buscar(String nombre){
        nodoPersonaje auxiliar=primero;
        int i=auxiliar.nombre.compareTo(nombre);
        while(auxiliar.sig!=null && i!=0){
            auxiliar=auxiliar.sig;
            i=auxiliar.nombre.compareTo(nombre);
        }
        if(auxiliar.nombre.compareTo(nombre)==0){
            return true;
        }else{
            return false;
        }
    }
    
    //public boolean modificar(){}
    
    public boolean eliminar(String nombre){
        if(vacia() || !buscar(nombre)){
            return false;
        }else{
            nodoPersonaje auxiliar=primero;
            int i=auxiliar.nombre.compareTo(nombre);
            while(auxiliar.sig!=null && i!=0){
                auxiliar=auxiliar.sig;
                i=auxiliar.nombre.compareTo(nombre);
            }
            if(auxiliar.nombre.compareTo(nombre)==0){
                if(auxiliar.ant!=null && auxiliar.sig!=null){
                    auxiliar.ant.sig=auxiliar.sig;
                    auxiliar.sig.ant=auxiliar.ant;
                }else if(auxiliar.ant==null && auxiliar.sig!=null){
                    primero=auxiliar.sig;
                    auxiliar.sig.ant=null;
                }else if(auxiliar.sig==null && auxiliar.ant!=null){
                    auxiliar.ant.sig=null;
                    ultimo=auxiliar.ant;
                }else{
                    primero=null;
                    ultimo=null;
                }
            }
            return true;
        }
    }
    public void recorrer(){
        nodoPersonaje auxiliar=primero;
        while(auxiliar!=null){
            System.out.println(auxiliar.nombre);
            auxiliar=auxiliar.sig;
        }
    }
    
    public String contenido(){
        nodoPersonaje auxiliar=primero;
        String cad0=""; 
        while(auxiliar!=null){
            cad0=cad0+auxiliar.nombre+"_"+auxiliar.puntos+";";
            if(auxiliar.sig!=null){
                cad0=cad0+auxiliar.nombre+"_"+auxiliar.puntos+" -> "+auxiliar.sig.nombre+"_"+auxiliar.sig.puntos+";";
            }
            auxiliar=auxiliar.sig;
        }
        return cad0;
    }
    
        
}
