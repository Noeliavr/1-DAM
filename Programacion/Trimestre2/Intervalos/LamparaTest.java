
public class LamparaTest {

    public static void main(String[] args) {
        Lampara lampara = new Lampara();

        System.out.println(lampara); // Luz OFF, Intensidad 0

        lampara.setEncendida(true);
        lampara.setIntensidad(75);
        System.out.println(lampara); // Luz ON, Intensidad 75

        lampara.setIntensidad(150); // Valor inválido
        System.out.println(lampara); // Luz ON, Intensidad 75

        lampara.setIntensidad(5.0);
        System.out.println(lampara); // Luz ON, Intensidad 31

        lampara.setIntensidad(13.0);
        System.out.println(lampara); // Luz ON, Intensidad 100
    }
    
}
