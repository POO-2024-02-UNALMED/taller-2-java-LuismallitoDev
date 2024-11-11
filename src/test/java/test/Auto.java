package test;
public class Auto {
    String modelo;
    int precio; 
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static String cantidadCreados;

    public int cantidadAsientos(){
        int contador = 0;
        for(Asiento asiento : asientos){
            if(asiento!= null){
                contador++;
            }
        }
        return contador;
    }

    public String verificarIntegridad(){
        for(Asiento asiento : asientos){
            if(asiento != null && asiento.registro != registro){
                return "Las piezas no son originales";
            }
        }
        if(motor != null && motor.registro != registro){
            return "Las piezas no son originales";
        }
        return "Auto original";
    }

}
