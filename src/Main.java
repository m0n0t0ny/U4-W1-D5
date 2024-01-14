import it.epicode.be.multimedia.Audio;
import it.epicode.be.multimedia.Image;
import it.epicode.be.multimedia.Video;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Object[] arrayMultimediaFiles = new Object[3];


        Scanner scanner = new Scanner(System.in);

        System.out.println("Aggiungi 3 file multimediali per cominciare!");

        for (int i = 0; i < arrayMultimediaFiles.length; i++) {

            System.out.println("Vuoi caricare un audio, un video o un immagine?");
            String objectType = scanner.nextLine();


            switch (objectType.toLowerCase().trim()) {


                case "audio":

                    System.out.println("Assegna un nome al file audio:");
                    String audioTitle = scanner.nextLine();

                    System.out.println("Assegna una durata al file audio:");
                    int audioDuration = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Assegna un volume di partenza per il file audio (da 0 a 10):");
                    int audioVolume = scanner.nextInt();
                    scanner.nextLine();

                    arrayMultimediaFiles[i] = new Audio(audioTitle, audioDuration, audioVolume);

                    break;

                case "video":

                    System.out.println("Assegna un nome al file video:");
                    String videoTitle = scanner.nextLine();

                    System.out.println("Assegna una durata al file video:");
                    int videoDuration = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Assegna una luminosità di partenza per il file audio (da 0 a 10):");
                    int videoBrightness = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Assegna un volume di partenza per il file video (da 0 a 10):");
                    int videoVolume = scanner.nextInt();
                    scanner.nextLine();

                    arrayMultimediaFiles[i] = new Video(videoTitle, videoBrightness, videoDuration, videoVolume);

                    break;

                case "immagine":

                    System.out.println("Assegna un nome al file immagine:");
                    String imageTitle = scanner.nextLine();

                    System.out.println("Assegna una luminosità di partenza per il file immagine (da 0 a 10):");
                    int imageBrightness = scanner.nextInt();
                    scanner.nextLine();

                    arrayMultimediaFiles[i] = new Image(imageTitle, imageBrightness);

                    break;

                default:
                    System.out.println("Valore inserito non valido, riprova 🔴");
                    i--;
                    break;
            }

        }
        System.out.println("Hai aggiunto 3 nuovi file 🟢");


        while (true) {
            System.out.println("Scegli il file da riprodurre (da 1 a 3):");
            Integer scelta = scanner.nextInt();
            scanner.nextLine();
            if (scelta.equals(0)) {
                System.out.println("Applicazione terminata 👋");
                scanner.close();
                break;
            } else if (arrayMultimediaFiles[scelta - 1] instanceof Audio) {
                ((Audio) arrayMultimediaFiles[scelta - 1]).play();

            } else if (arrayMultimediaFiles[scelta - 1] instanceof Video) {
                ((Video) arrayMultimediaFiles[scelta - 1]).play();

            } else if (arrayMultimediaFiles[scelta - 1] instanceof Image) {
                ((Image) arrayMultimediaFiles[scelta - 1]).show();
            }

        }


    }


}