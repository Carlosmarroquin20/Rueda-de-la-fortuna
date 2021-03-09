
//importando random y scanner
import java.util.Random;
import java.util.Scanner;

//Inicio de programa
public class Main{
    public static void main (String[] args) {
        int Exit;
        do{
            Random Premios = new Random(); //Los premios se daran de forma aleatoria
            Scanner obj = new Scanner((System.in));
            int PremioGanador;

            //Premios
            String[] Premio1 = {" UN Mouse Logitech G203!", " UnTeclado ASUS  Tuf k7!!!!", " Una Laptop MSI THIN!!!", "Una Motocicleta Kawasaki", " Un Carro Tesla® Model S3", "Un Fantastico Viaje a la luna con compañia Space X para 2 personas"};

            // BIENVENIDA E INTRODUCCION AL USUARIO
            System.out.println("-----------------------------------------------------|");
            System.out.println("-----BIENVENIDO A LA RUEDA DE LA FORTUNA-------------|");
            System.out.println("-----------------------------------------------------|");
            System.out.println("");
            System.out.println("La rueda de la fortuna donde todos salen ganadores!! |");
            System.out.println("Participa ya ya ya ya yaaaaaaaaaa!                   |");
            System.out.println("-----------------------------------------------------|");
            System.out.println("");
            System.out.println("Le vas a entrar????????");
            System.out.println("1.  Demoleeee!!!!    //        2. No Gracias :/       ");
            System.out.println("");
            System.out.println("-----------------------------------------------------|");

            PremioGanador = obj.nextInt(); //Eleccion del usario

            if (PremioGanador == 1){
                int random = Premios.nextInt(Premio1.length);
                System.out.println("-----------------------------------------------------|");
                System.out.println("Girando, Girando, Girando, Girando, Girando!!!!!!!   | ");
                System.out.println("-----------------------------------------------------|");
                System.out.println("");
                System.out.println("");
                System.out.println(" wow si que tiene suerte !!!!!!");
                System.out.println("");
                System.out.println(" FELICIDADES!!!!!! Ganaste  " + Premio1[random]);
                System.out.println("");
                System.out.println("Alguien Encontro el trebol de 4 hojas esta mañana jajaja!!!"); //Resultado
                System.out.println("");
            } else {

                System.out.println("Nos vemos a la proxima :(  ");
            }

            System.out.println("¿Quieres intentar de nuevo?");
            System.out.println("1. Claroooo //  2. No, Gracias :/       ");
            System.out.println("");
            Exit = obj.nextInt();
        }
        while (Exit == 1);  //Fin
    }
}