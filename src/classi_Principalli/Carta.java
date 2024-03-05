package src;

//classe per carta singola
public class Carta {
    public enum Seme{CUORI,QUADRI,FIORI,PICCHE} //classe enum per il tipo di seme
    public enum Colore{ROSSO,NERO} //classe enum per il colore del jolly

    Seme seme; //seme della carta (cuori,quadri,fiori,picche)
    String nomeCarta; //nomeCarta+seme, ad esempio "Re di" + "fiori"
    int valore; //valore singolo che non corrisponde in tutti i casi al valore effettivo della carta secondo le regole delle carte francesi(ES: Re di fiori, valore 20 e non 13)
    boolean effetto; //indica se la carta ha un effetto speciale o meno
    Colore colore; //colore del jolly

    public Carta(Seme seme, String nomeCarta, int valore, boolean effetto) { // costruttore delle carte normali
        if (seme == null || nomeCarta == null) {
            throw new IllegalArgumentException("Seme e nomeCarta non possono essere null."); //gestione dell'eccezione per evitare valori null
        }
        this.seme = seme;
        this.nomeCarta = nomeCarta;
        this.valore = valore;
        this.effetto = effetto;
    }

    public Carta(Colore colore) { //costruttore per i jolly
        if (colore == null) {
            throw new IllegalArgumentException("Colore non può essere null."); //gestione dell'eccezione per evitare valori null
        }
        this.nomeCarta = "Jolly"; //nome della carta già stabilito
        this.valore = -2; //valore già stabilito
        this.colore = colore;
        this.effetto = false; //effetto assente già stabilito
    }

    @Override
    public String toString() {// TO DO, aggiungere una leggenda nella leaderboard che indichi le carte con valore differente da quello visivo
        if (seme != null) { //Verifica se il seme è stato inizializzato
            return nomeCarta + " di " + seme; //stampa carta normale
        } else {
            return nomeCarta + " " + colore; //stampa Jolly
        }
    }
}
