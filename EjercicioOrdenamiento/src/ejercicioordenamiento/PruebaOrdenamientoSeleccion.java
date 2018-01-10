package ejercicioordenamiento;

// Fig 16.7: PruebaOrdenamientoSeleccion.java
// Prueba la clase de ordenamiento por selecci�n.

public class PruebaOrdenamientoSeleccion
{
   public static void main( String[] args )
   {
      // crea objeto para realizar el ordenamiento por selecci�n
      int[] valores = {10, 90, 1, 20, 4, 7};
      OrdenamientoSeleccion arregloOrden = new OrdenamientoSeleccion(valores);
      
      
      System.out.println( "Arreglo desordenado:" );
      System.out.println( arregloOrden ); // imprime arreglo desordenado

      arregloOrden.ordenar(); // ordena el arreglo

      System.out.println( "Arreglo ordenado:" );
      System.out.println( arregloOrden ); // imprime el arreglo ordenado
   } // fin de main
} // fin de la clase PruebaOrdenamientoSeleccion


/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/