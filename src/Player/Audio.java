package Player;

public class Audio extends ElementoMultimediale implements AudioVideo{
    private int durata;
    private int volume;


    //Costruttore


    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    //Get e Set

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
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

    // Play


    @Override
    public void play() {
        String puntoEsclamativo = "!".repeat(volume);
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + puntoEsclamativo);

        }
    }

}
