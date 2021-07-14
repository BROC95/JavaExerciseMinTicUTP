
// Escriba el código fuente de la solución al siguiente ejercicio.
// Se requiere una aplicación por consola que permita calcular el promedio de ventas anuales
// de un listado de vendedores. El sistema debe recibir inicialmente la cantidad de
// vendedores, y después preguntar por cada vendedor, el nombre, y el valor de las ventas
// realizadas en el trimestre 1, 2, 3 y 4.


import javax.swing.JOptionPane;
public class Ventas {

    public static void main(String[] args) {
        
          //ZONA DE DECLARACION DE VARIABLES
          String listaProm= "";
          String listaTabla = "";
          String listaTri= "";
          String [] listaTrimestres = {"Trimestre 1","Trimestre 2","Trimestre 3","Trimestre 4"};
          String[] nombres = null;
          double[][] ventas = null;
          double[] prom = null;
          double promedio = 0;
          double promedioV = 0;
          int CantidadVendedores = 0;
          int n= listaTrimestres.length;

            /**
             * Se crea exceptio para datos no numericos
            
             */ 
            try{
          CantidadVendedores= Integer.parseInt(JOptionPane.showInputDialog(
              null,"Cuantos vendedores son", "Cantidad de vendedores", JOptionPane.QUESTION_MESSAGE));
            }
            catch (NumberFormatException ex){
                System.out.println("error");
                JOptionPane.showMessageDialog(null,
            "Debe ingresar un entero",
            "Error",
            JOptionPane.ERROR_MESSAGE);
                CantidadVendedores= Integer.parseInt(JOptionPane.showInputDialog(
                    null,"Cuantos vendedores son", "Cantidad de vendedores", JOptionPane.QUESTION_MESSAGE));
            }
   
        nombres = new String[CantidadVendedores];
        ventas = new double[CantidadVendedores][n];
        prom = new double [n];
        System.out.println(n);
        for (int i=0;i<CantidadVendedores;i++)
        {
            promedio=0;
            nombres[i] = JOptionPane.showInputDialog(
                    null,
                    "¿Cuál es el nombre del vendedor número " + (i + 1) + "?",
                    "Ingrese  nombre",
                    JOptionPane.QUESTION_MESSAGE);
            for(int k =0; k<n;k++)
            {
                  /**
             * Se crea exceptio para datos no numericos
            
             */  
                try {
                    ventas[i][k] = Double.parseDouble(JOptionPane.showInputDialog(
                        null,
                        listaTrimestres[k]  + " del vendedor " + nombres[i] + "?",
                        "Ingrese venta",
                        JOptionPane.QUESTION_MESSAGE
                ));
                    
                } catch (NumberFormatException e) {
                    //TODO: handle exception
                    JOptionPane.showMessageDialog(null,
                    "Debe ingresar un número",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                    ventas[i][k] = Double.parseDouble(JOptionPane.showInputDialog(
                        null,
                        listaTrimestres[k]  + " del vendedor " + nombres[i] + "?",
                        "Ingrese venta",
                        JOptionPane.QUESTION_MESSAGE
                ));
                }
               
            /**
             *  Se calcula el promedio de ventas
             */
            promedio += ventas[i][k];
            }
            System.out.println(promedio);
            prom[i] = (promedio / n);
            System.out.println(prom[i]);
            listaProm+=nombres[i]+"      "+prom[i]+"\n";
            promedioV+=prom[i];
        }
        promedioV=promedioV/CantidadVendedores;
        for (int k=0; k<n;k++)
        {
            listaTri+="  " +listaTrimestres[k];
        }
        for (int iteracion = 0; iteracion < CantidadVendedores; iteracion++) {
            
            /**
             * Se crea la lista  de nombres como un string para imprimir
            
             */     
        
        listaTabla += "     "+nombres[iteracion] + " |   " ;
        for(int k =0; k<n;k++)
        {
             /**
             * Se crea la lista  de ventas como un string para imprimir
            
             */   
        listaTabla += "     "+ ventas[iteracion][k] +"    ";
        }
        listaTabla+="| \n";
            
    
            
        }
         /**
             * Se muestra en pantalla las tablas de los resultados 
            
             */  
    JOptionPane.showMessageDialog(null,
            "Vendedores |"+listaTri+" |"+"\n"+ listaTabla,
            "Tabla Datos Ingresados",
            JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(
            null,
            "Vendedor "+ "  Promedios"+"\n"+listaProm+"Promedio Vendedores "+promedioV,
            "Tabla Promedio de Ventas Anuales",
            JOptionPane.INFORMATION_MESSAGE);
 
    
    }
}

