package practica1;

public class nodoCabecera {  
    int id;
    nodoCabecera ant;
    nodoCabecera sig;
    nodoMatriz interior;
    
    nodoCabecera(int id){
        this.id=id;
        this.ant=null;
        this.sig=null;
        this.interior=null;
    }
}
