
package agencia;

import javax.swing.JOptionPane;


public class VentaVehiculo {
    
    public void venta(Vehiculo matCarros[][]) {
        for(int fila=0; fila<matCarros.length; fila++) { //siempre se recorre fila y columna, sin importar el orden en que se coloque
            for(int col=0; col<matCarros[fila].length; col++) {
                matCarros[fila][col] = new Vehiculo();
                matCarros[fila][col].setPlaca(JOptionPane.showInputDialog("Digite la placa del carro"));
                matCarros[fila][col].setModelo(JOptionPane.showInputDialog("Digite el modelo"));
                matCarros[fila][col].setColor(JOptionPane.showInputDialog("Digite el color"));
                matCarros[fila][col].setPrecioVehiculo(Float.parseFloat(JOptionPane.showInputDialog("Digite el precio del vehiculo")));
                byte extra = Byte.parseByte(JOptionPane.showInputDialog("1. Extra \n2. Sin Extra \n Digite su Opcion"));
                
                if (extra==1)
                  matCarros[fila][col].setExtras(true);
                else
                    matCarros[fila][col].setExtras(false);
            }
        }//cierra ciclos

    }//cierra metodo venta
    
    public void imprimeVenta(Vehiculo matCarros[][]) {
        for(int fila=0; fila<matCarros.length; fila++) {
            for(int col=0; col<matCarros[fila].length; col++) {
                System.out.println("Placa " + matCarros[fila][col].getPlaca());
                System.out.println("Modelo " + matCarros[fila][col].getModelo());
                System.out.println("Precio Vehiculo " + matCarros[fila][col].getPrecioVehiculo());
                System.out.println("Color " + matCarros[fila][col].getColor());
                if (matCarros[fila][col].isExtras()==true) //is porque es booleano <-----
                    System.out.println("Tiene Extras");
                else
                    System.out.println("No tiene Extras");
                
                System.out.println("-----------------------------------------------------------");
                
            }
        }
        
        
        
    }//Cierra metodo imprimeVenta
    
    public void imprimeExtras (Vehiculo matCarros[][]) {
        for(int fila=0; fila<matCarros.length; fila++) {
            for(int col=0; col<matCarros[fila].length; col++) {
                if (matCarros[fila][col].isExtras()==true)
                    System.out.println(matCarros[fila][col].getModelo());
            }
        }
        
        
    }//cierra metodo imprimeExtras
    
    
    public void imprimeMillonarios (Vehiculo matCarros[][]) {
        for(int fila=0; fila<matCarros.length; fila++) {
            for(int col=0; col<matCarros[fila].length; col++) {
                if (matCarros[fila][col].getPrecioVehiculo()>25000000)
                    System.out.println(matCarros[fila][col].getModelo());
            }
        }
        
        
    }//cierra metodo imprimeMillonarios
    
    
    
    public void imprimeVerdes (Vehiculo matCarros[][]) {
        for(int fila=0; fila<matCarros.length; fila++) {
            for(int col=0; col<matCarros[fila].length; col++) {
                if (matCarros[fila][col].getColor().equalsIgnoreCase("Verde"))
                    System.out.println(matCarros[fila][col].getModelo());
            }
        }
        
        
    }//cierra metodo imprimeMillonarios
    
    
    public void carroMasCaro(Vehiculo matCarros[][]) {
        float mayor;
        double mayorDeTodos=0;
        
        for(int fila=0; fila<matCarros.length; fila++) {
            for(int col=0; col<matCarros[fila].length; col++) {
                mayor = 0;
                if(mayor<matCarros[fila][col].getPrecioVehiculo())
                    mayorDeTodos = matCarros[fila][col].getPrecioVehiculo();
            }
        }
       
        System.out.println("El precio mas caro es: " + mayorDeTodos);
        
    }
    
    
    //carro mas caro
    
    public void CarroCaro(Vehiculo matCarros[][]) {
        System.out.println("Carro mas caro");
        float precio = matCarros[0][0].getPrecioVehiculo();
        int i=0, j=0;
        for(int fila=0; fila<matCarros.length; fila++) {
            for(int col=0; col<matCarros[fila].length; col++) {
                if(matCarros[fila][col].getPrecioVehiculo()>precio) {
                    precio = matCarros[fila][col].getPrecioVehiculo();
                    i= fila;
                    j=col;
                }//cierra if
                    
            }
        }
        
        
        
        System.out.println("Placa " + matCarros[i][j].getPlaca());
        System.out.println("Modelo " + matCarros[i][j].getModelo());
        System.out.println("Precio Vehiculo " + matCarros[i][j].getPrecioVehiculo());
        System.out.println("Color " + matCarros[i][j].getColor());
        
        
        
        
    }//cierra metodo
    
    
    
    
}//cierra clase venta vehiculo
