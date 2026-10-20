public class Ejercicio5 {

  public static void main(String[] args) {
    // Calcular la suma de los multiplos de 3 y 5 entre el 1 y 100 incluidos
    int suma = 0;
    for (int i = 1; i <= 100; i++){
      if (i % 3 == 0 && i % 5 == 0){
        suma += i;
      }
    }
    System.out.println("La suma de los múltiplos de 3 y 5 entre 1 y 100 es: " + suma);
  }
}