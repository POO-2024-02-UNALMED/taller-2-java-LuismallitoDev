import java.util.Arrays;
import java.util.List;

public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;
    static final List<String> TIPOS = Arrays.asList("electrico", "gasolina");

    public void cambiarRegistro(int nuevoRegistro) {
        registro = nuevoRegistro;
    }
    
    public void asignarTipo(String tipo) {
        if(TIPOS.contains(tipo)){
            this.tipo = tipo; 
        }
    }
}
