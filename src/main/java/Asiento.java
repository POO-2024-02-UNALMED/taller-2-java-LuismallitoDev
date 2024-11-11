import java.util.Arrays;
import java.util.List;

public class Asiento {
    String color;
    int precio;
    int registro;
    static final List<String> COLORES = Arrays.asList("rojo", "verde", "amarillo", "negro", "blanco");

    public void cambiarColor(String nuevoColor) {
        if(COLORES.contains(nuevoColor)) {
            color = nuevoColor;
        }
    }
}