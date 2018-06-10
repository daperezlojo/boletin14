package boletin14;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Garaxe {
    private int cantActual;
    private int matricula;
    private int cantMaxima;

    
    Scanner sc = new Scanner(System.in);

    //Constructor por defecto
    public Garaxe() {
    }

    //Getters y Setters
    public int getNumeroCoches() {
        return cantActual;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getCantidadActual() {
        return cantMaxima;
    }

    public void setNumeroCoches(int numeroCoches) {
        this.cantActual = numeroCoches;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantMaxima = cantidadActual;
    }
    
    
        
        public void DejarCoche(){

    JOptionPane.showMessageDialog(null,"Bienvenido al Garaje");

            if(cantActual<=cantMaxima){
                    
                   String matricula = JOptionPane.showInputDialog("Por favor, introduzca la matrícula de su vehículo");
//                            int numMatricula = Integer.parseInt(matricula);
                     
                   String tiempo = JOptionPane.showInputDialog("y el tiempo que estará su vehiculo en el garage");
                            int numTiempo = Integer.parseInt(tiempo);
                            if(numTiempo>3){
                            double precio = (1.5+numTiempo*0.20);
                    String cartosrecibidos = JOptionPane.showInputDialog("El precio seria de "+precio+"\n"
                    + "Por favor introduzca el dinero");
                    int numCartosrecibidos = Integer.parseInt(cartosrecibidos);
                            
                    JOptionPane.showMessageDialog(null,"Aqui tiene su factura: "
                            + "FACTURA:\n"
                            + "MATRICULA COCHE: "+matricula+"\n"
                            + "TIEMPO: "+tiempo+"horas\n"
                            + "PRECIO: "+((1.5+numTiempo*0.20))+"euros\n"
                            + "CARTOS RECIBIDOS: "+(cartosrecibidos)+"euros\n"
                            + "CARTOS DEVOLTOS: "+Math.abs((precio)-(numCartosrecibidos))+"euros\n"
                            + "GRACIAS POR USAR O NOSO APARCADOIRO");
                            cantActual++;     
                            }
                            else{
                            double precio = 1.5;
                    String cartosrecibidos = JOptionPane.showInputDialog("El precio seria de "+precio+"\n"
                    + "Por favor introduzca el dinero");
                    int numcartosrecibidos = Integer.parseInt(cartosrecibidos);
                            
                    JOptionPane.showMessageDialog(null,""
                            + "FACTURA:\n"
                            + "MATRICULA COCHE: "+matricula+"\n"
                            + "TIEMPO: "+numTiempo+"horas\n"
                            + "PRECIO: "+precio+"euros\n"
                            + "CARTOS RECIBIDOS: "+(cartosrecibidos)+"euros\n"
                            + "CARTOS DEVOLTOS: "+Math.abs((precio)-(numcartosrecibidos))+"euros\n"
                            + "GRACIAS POR USAR O NOSO APARCADOIRO");
                            cantActual++;
                            }
                                
                            }
                                else{
                   JOptionPane.showInputDialog("Completo");
                        }    
                     
    }
}

