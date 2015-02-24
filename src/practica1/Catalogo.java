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
    
    public void recorrer(){
        nodoPersonaje auxiliar=primero;
        while(auxiliar!=null){
            System.out.println(auxiliar.nombre);
            auxiliar=auxiliar.sig;
        }
    }
    
}
