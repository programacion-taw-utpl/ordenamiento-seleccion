package ejercicioordenamiento;

// Fig. 14.11: LeerArchivoTexto.java
// Este programa lee un archivo de texto y muestra cada registro.

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class LeerArchivoTexto
{
   private Scanner entrada;

   // permite al usuario abrir el archivo
   public void abrirArchivo()
   {
      try
      {
         entrada = new Scanner( new File( "data.txt" ) );
      } // fin de try
      catch ( FileNotFoundException fileNotFoundException )
      {
         System.err.println( "Error al abrir el archivo." );
         System.exit( 1 );
      } // fin de catch
   } // fin del m�todo abrirArchivo

   // lee registro del archivo
   public int [] leerRegistros()
   {
      
      ArrayList<Integer> lista = new ArrayList<>();
      try // lee registros del archivo, usando el objeto Scanner
      {
         
         while ( entrada.hasNext() )
         {
             // System.out.println(entrada.nextLine());
             String cadena = entrada.nextLine();
             ArrayList<String> registro = new ArrayList<>(Arrays.asList(cadena.split("\\,")));

             lista.add(Integer.parseInt(registro.get(0)));
             lista.add(Integer.parseInt(registro.get(1)));
             
                    
         } // fin de while
      } // fin de try
      catch ( NoSuchElementException elementException )
      {
         System.err.println( "El archivo no esta bien formado." );
         entrada.close();
         System.exit( 1 );
      } // fin de catch
      catch ( IllegalStateException stateException )
      {
         System.err.println( "Error al leer del archivo." );
         System.exit( 1 );
      } // fin de catch
      return transforar_arrayList_arreglo(lista);
   } // fin del m�todo leerRegistros

   public int [] transforar_arrayList_arreglo(ArrayList<Integer> l){
       int [] arreglo = new int[l.size()];
       for (int i=0; i< l.size(); i ++){
            arreglo[i] = l.get(i);
       }
       
       return arreglo;
   }
   
   // cierra el archivo y termina la aplicaci�n
   public void cerrarArchivo()
   {
      if ( entrada != null )
         entrada.close(); // cierra el archivo
   } // fin del m�todo cerrarArchivo
}