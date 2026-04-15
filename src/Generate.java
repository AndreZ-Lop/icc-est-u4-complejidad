import java.util.ArrayList;
import java.util.List;
public class Generate {
    public static List<Estudiante> generarEstudiantes(int cantidadEstudiante){
        List<Estudiante> estudiantes = new ArrayList<>();
        for (int i =  0; i<cantidadEstudiante;i++){
            String cedula = i+"";  //poner un numero + "" cambia el numero a un texto de i = 0 -> + "" = " 0 "
            String nombre = "Estudiante_"+i; //"Estudiante_"+i // Se guarda en texto como "Estudiante_1"
            Estudiante estudiante = new Estudiante(nombre, cedula);
            estudiantes.add(estudiante);
        }
        return estudiantes;
    }
}
