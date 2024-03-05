package src;

public class Giocatore{
    String username;
    int punteggioPartita;
    int punteggioTotale;
    

    public Giocatore(String username){
        this.username = username;
        this.punteggioPartita = 0;
        this.punteggioTotale = 0;
    }

    public void puntiPartita(int punti){
        punteggioPartita = punti;
        System.out.println("Punteggio partita: " + punteggioPartita); 
    }

    public void puntiTotali(int punti){
       punteggioTotale += punteggioPartita; 
    }

    public String  getNome(){
        return username;

    }

    @Override
    public String toString(){
        return "Giocatore: " + username + "Punteggio totale: " + punteggioTotale; 

    }

}
