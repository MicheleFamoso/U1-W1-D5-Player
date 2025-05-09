package Player;

import java.util.Scanner;

public class MainPlayer {
    public static void main(String[] args) {
                //Array
              ElementoMultimediale[] elementi = new ElementoMultimediale[5];
              Scanner scanner = new Scanner(System.in);
              //Ciclo for per la creazione degli elementi
        for (int i = 0; i < 5; i++) {
            System.out.println("Elementi creati :" + (i));
            System.out.println("Scegli il tipo di elemento da creare");

            System.out.println("1 - Immagine , 2 - Audio , 3 Video");
            int tipo = scanner.nextInt();
            System.out.println(" inserisci il titolo");
            String titolo = scanner.next();
            // Switch per gestire i 3 tipi di elementi da creare
            switch (tipo){
                case 1 :
                    System.out.println("Inserisci una luminosita compresa tra 0 e 10");
                    int lum = scanner.nextInt();
                    elementi[i]= new Immagine(titolo,lum);
                    break;
                case 2:
                    System.out.println("Inserisci la durata");
                    int durata = scanner.nextInt();
                    System.out.println("Inserisci il volume compreso tra 0 e 10");
                    int volume = scanner.nextInt();
                    elementi[i]= new Audio(titolo,durata,volume);
                    break;
                case 3 :
                    System.out.println("Inserisci la durata");
                    int dur = scanner.nextInt();
                    System.out.println("Inserisci una luminosita compresa tra 0 e 10");
                    int lumi = scanner.nextInt();
                    System.out.println("Inserisci il volume compreso tra 0 e 10");
                    int vol = scanner.nextInt();
                    elementi[i] = new Video(titolo,dur,lumi,vol);
                    break;
                default:
                    System.out.println("!!Tipo non valido!!");
                    i--;
            }

        }
        // ciclo doWhile per la gestione della visualizzazione
        int elementoScelto;
        do{
            System.out.println("Scegli un elemento da 1 a 5, esci dal programma con 0");
            elementoScelto = scanner.nextInt();
            // If per gestire la scelta tra 1 e 5
            if(elementoScelto >= 1 && elementoScelto <=5){
                ElementoMultimediale scelto = elementi[elementoScelto - 1];
                // Un altro if per controllare i tipi a runtime
                if( scelto instanceof AudioVideo){
                    ((AudioVideo) scelto).play();
                } else if (scelto instanceof  Img) {
                    ((Img) scelto).show();
                }

            }

        } while (elementoScelto !=0);
        System.out.println("Sei uscito dal programma;");


   }

}
