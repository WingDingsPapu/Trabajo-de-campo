import java.util.ArrayList;

public class Colecciones {

    public static void main(String[] args) {

        ArrayList<String> alumnos = new ArrayList<>();

        alumnos.add("Josue");
        alumnos.add("Kevin");
        alumnos.add("Marcio");
        alumnos.add("Christopher");
        alumnos.add("Jaziel");

        System.out.println("Lista de alumnos:");

        for(String alumno : alumnos){
            System.out.println(alumno);
        }
    }
}