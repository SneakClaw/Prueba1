
package agencia;

import javax.swing.JOptionPane;


public class Agencia {
    
    public void menu(){
        
        byte opc =1;
        
        VentaVehiculo obj = new VentaVehiculo();
        Vehiculo matCarros[][] = new Vehiculo[2][2];
        
        while (opc>=1 && opc<7) {
            opc = Byte.parseByte(JOptionPane.showInputDialog("1. Realizar Ventas \n2. Impresion \n3. Modelos que tienen Extra \n4. Precio mayor a 25 Millones \n5. Vehiculos verdes \n6. Precio mas Caro \n7. Salir \nDigite su opcion"));
            switch(opc) {
                case 1:  obj.venta(matCarros);
                         System.out.println("-----------------------------------------------------------");
                break;
                case 2: obj.imprimeVenta(matCarros);
                        
                break;
                case 3: obj.imprimeExtras(matCarros);
                        System.out.println("-----------------------------------------------------------");
                break;
                case 4: obj.imprimeMillonarios(matCarros);
                        System.out.println("-----------------------------------------------------------");
                break;
                case 5: obj.imprimeVerdes(matCarros);
                        System.out.println("-----------------------------------------------------------");
                break;
                case 6: obj.CarroCaro(matCarros);
                        System.out.println("-----------------------------------------------------------");
                break;
                default: System.out.println("Saliendo del sistema...");
            }
            
        }//cierra while
        
    }//cierra metodo menu
    
    
    public static void main(String[] args) {
        Agencia objAgencia = new Agencia();
        objAgencia.menu();
        
        
    }//cierra main
    
}
