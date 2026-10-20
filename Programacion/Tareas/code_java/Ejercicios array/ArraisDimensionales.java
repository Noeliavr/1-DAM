/*
10 alumnos y 3 asignaturas. pedir notas al usuario
que alumno tiene la mejor nota en cada asignatura y la media de cada asignatura
hacer con arrays bidimensional
 */
public class ArraisDimensionales {

    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        double[][] notas = new double[10][3];
        String[] asignaturas = {"Matematicas", "Lengua", "Ingles"};
        
        // Pedir notas al usuario
        for (int alumno = 0; alumno < 10; alumno++) {
            System.out.println("Alumno " + (alumno + 1) + ":");
            for (int asignatura = 0; asignatura < 3; asignatura++) {
                System.out.print("  Nota de " + asignaturas[asignatura] + ": ");
                notas[alumno][asignatura] = teclado.nextDouble();
            }
        }
        
        // Calcular mejor nota y media por asignatura
        for (int asignatura = 0; asignatura < 3; asignatura++) {
            double mejorNota = -1;
            int alumnoMejorNota = -1;
            double sumaNotas = 0;
            
            for (int alumno = 0; alumno < 10; alumno++) {
                double notaActual = notas[alumno][asignatura];
                sumaNotas += notaActual;
                
                if (notaActual > mejorNota) {
                    mejorNota = notaActual;
                    alumnoMejorNota = alumno;
                }
            }
            
            double media = sumaNotas / 10;
            System.out.println("Asignatura: " + asignaturas[asignatura]);
            System.out.println("  Mejor nota: " + mejorNota + " del Alumno " + (alumnoMejorNota + 1));
            System.out.println("  Media: " + media);
        }
        
        teclado.close();
    }
  
}