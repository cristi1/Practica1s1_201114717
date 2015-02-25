package practica1;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class archivos {
    
    public void archivoCatalogo(String cadena0,String cadena1){
        try{
    	File creardot = new File("/home/clnx/Escritorio/Estructuras/EDD1sem2015/Practica1/src/practica1/catalogos.dot"); //Crear un objeto File que se encarga de crear un arch. esp. en su constructor
    	FileWriter escritor = new FileWriter(creardot,false); //false para que vaya al inicio del arch. a escribir 
            try (PrintWriter impresor = new PrintWriter(escritor)) {
                impresor.println("digraph G { node[shape=box, style=filled, color=Gray95]; edge[color=blue]; rankdir=LR");
                //impresor.println("digraph G { \n rankdir=LR");
                impresor.println("subgraph cluster0 {style=filled;  color=lightgrey;  node [color=white];");
                impresor.println(cadena0+"\n label = \"Catalogo Plantas\";");
                impresor.println("} ");
                impresor.println("subgraph cluster1 {style=filled;  color=lightgrey;  node [color=white];");
                impresor.println(cadena1+"\n label = \"Catalogo Zombies\";");
                impresor.println("}");
                impresor.println("}");
            }
    	}catch(Exception er){	
    		System.out.println(er.getMessage());
    		er.printStackTrace();
    	}  
            try{
                String dot="/home/clnx/Escritorio/Estructuras/EDD1sem2015/Practica1/src/practica1/catalogos.dot";
                String png="/home/clnx/Escritorio/Estructuras/EDD1sem2015/Practica1/src/practica1/catalogos.png";
                ProcessBuilder pbuilder;
                pbuilder = new ProcessBuilder( "dot", "-Tpng", "-o", png, dot );
                pbuilder.redirectErrorStream( true );
                pbuilder.start();
            } catch (Exception e) { e.printStackTrace(); } 
    }
}
