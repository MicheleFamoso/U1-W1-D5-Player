package Player;

public class Video extends ElementoMultimediale implements AudioVideo{
    private int durata;
    private int luminosita;
    private int volume;

    //Costruttore

    public Video(String titolo, int durata, int luminosita, int volume) {
        super(titolo);
        this.durata = durata;
        this.luminosita = luminosita;
        this.volume = volume;
    }

    //Get e set


    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    //Aumenta e Diminusci luminosita

    public int aumentaLuminosita(){
        if( luminosita < 10 ) {
            luminosita++;
            System.out.println("Luminosita Aumentata a : " + luminosita);
        }else {
            System.out.println("Luminosita Massima Raggiunta " + luminosita);
        }
        return luminosita;

    }

    public int diminuisciLuminosita(){
        if(luminosita == 0){
            System.out.println("Livello luminosita minimo raggiunto : " + luminosita);
        }else{
            luminosita--;
            System.out.println("Luminosita diminuita a : " + luminosita);
        }
        return luminosita;

    }



    // Volume


    public int aumentaVolume(){
        if( volume < 10 ) {
            volume++;
            System.out.println("Volume Aumentato a : " + volume);
        }else {
            System.out.println("Volume Massimo Raggiunto " + volume);
        }
        return volume;

    }

    public int diminuisciVolume(){
        if(volume == 0){
            System.out.println("Volume minimo raggiunto : " + volume);
        }else{
            volume--;
            System.out.println("Volume diminuito a : " + volume);
        }
        return volume;

    }


    @Override
    public void play() {
        String puntoEsclamativo = "!".repeat(volume);
        String stelle = "*".repeat(luminosita);
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + puntoEsclamativo + stelle);

        }
    }


}
