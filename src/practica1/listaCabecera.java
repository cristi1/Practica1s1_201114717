package practica1;

public class listaCabecera {
    nodoCabecera primero;
    nodoCabecera ultimo;
    
    listaCabecera(){
        primero=null;
        ultimo=null;
    }
    
    public void add(int id){
        nodoCabecera nuevo=new nodoCabecera(id);
        if(primero==null){
            primero=nuevo;
            ultimo=nuevo;
        }else{
            ultimo.sig=nuevo;
            nuevo.ant=ultimo;
            ultimo=nuevo;
        }
    }
    
    public boolean vacia(){
        if(primero==null){
            return true;
        }else{
            return false;
        }
    }
    
    public nodoCabecera buscar(int id){
        nodoCabecera aux=primero;
        while(aux.sig!=null && aux.id!=id){
            aux=aux.sig;
        }
        if(aux.id==id){
            return aux;
        }else{
            return null;
        }
    }
    
    public void recorrer(){
        nodoCabecera auxiliar;
        auxiliar=primero;
        while(auxiliar!=null){
            System.out.println(auxiliar.id+" ");
            auxiliar=auxiliar.sig;
        }
    }
}
