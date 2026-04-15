import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
      int cantidadEstudiantes = 60000000;
      int cantidadConsultas = 40_000;

      System.out.println("Generando Estudiantes ... ");

      List<Estudiante> estudiantes = Generate.generarEstudiantes(cantidadEstudiantes); // Usar list crea un ARREGLO y en esta linea llamamos al metodo que retorna un objeto llamador estudiante
    //   for (Estudiante est : estudiantes){
    //     System.out.println(est.nombre);
    //   }


      // Buscar si existe el usuario CI 51_999_993
      String cedulaBuscar = "51999993";
      for (Estudiante est : estudiantes){
        if (est.cedula.equals(cedulaBuscar)){
            System.out.println("EXISTE");
            break;
        }
      }

    //   int inicio = 0;
    //   int fin = estudiantes.size()-1;
    //   while(inicio<=fin){
    //     int medio = (inicio+fin)/2; //me saca el estudiante del medio en este caso el de 1 millon
    //     Estudiante actual = estudiantes.get(medio); //me da el estudiante que este en la posicion medio que dijimos que era 1millo osea el medio
    //     int comparacion = actual.cedula.compareTo(cedulaBuscar);//esto nos dara 0 cuanto la comparacion sea igual. Pero me dara un numero positivo si e un posicion alfabeticamente mayor y uno menor si es alfebeticamente menor 
    //     if (comparacion == 0){
    //         System.out.println("Existe");
    //         break;
    //     }else if (comparacion < 0){
    //         inicio = medio + 1;
    //     }else{
    //         fin = medio - 1;
    //     }
    //   }
    }
}
