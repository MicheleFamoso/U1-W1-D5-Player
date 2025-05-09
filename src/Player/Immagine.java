package Player;

public class Immagine extends ElementoMultimediale implements Img {
    private int luminosita;

    //Costruttore
    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }



    //Get e Set
    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
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



    // Show


    @Override
    public void show() {
        String stelle = "*".repeat(luminosita);
        System.out.println(titolo + stelle);
    }

    //To String
    @Override
    public String toString() {
        return "Immagine{" +
                "luminosita=" + luminosita +
                ", titolo='" + titolo + '\'' +
                '}';
    }


}
