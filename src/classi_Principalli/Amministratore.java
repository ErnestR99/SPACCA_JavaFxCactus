package src;
 import java.util.Scanner;
 
 public class Amministratore{
    Scanner scan = new Scanner(System.in); 
    boolean adminAutentico = false;
    private static final String USERNAME = "adm";
    private static final String PASSWORD = "cactus";

    
    public void login(){
        while (!adminAutentico){
            System.out.println("Inserisci username:");
            String user = scan.nextLine();
            System.out.println("Inserisci la password:");
            String password = scan.nextLine();

            if (user.equals(USERNAME) && password.equals(PASSWORD)) {
                System.out.println("Accesso eseguito con successo. Benvenuto Admin!");
                adminAutentico = true;
            } else {
                System.out.println("Password o username non valido, si prega di riprovare");
            }
        }        
    }

 
    public CodicePartita configPartita (){
        System.out.print("Inserisci il numero di giocatori: ");
        int numGiocatori = scan.nextInt();
        do{ 
             numGiocatori = scan.nextInt();
        } while (numGiocatori >= 1 && numGiocatori <=4);

        for(int i=0; i<numGiocatori; i++ ){
            aggiungiGiocatore();
        }

        System.out.print("Seleziona la modalità di gioco (1: Singola, 2: Torneo): ");
        int gameMode = scan.nextInt();
        do{ 
             gameMode = scan.nextInt();
        } while (gameMode !=0 && gameMode !=1);

        System.out.print("Seleziona la modalità di gioco (1: Tutti contro tutti, 2: A squadre): ");
        int playMode = scan.nextInt();
        do{ 
             playMode = scan.nextInt();
        } while (playMode !=0 && playMode !=1);

        CodicePartita codice = new CodicePartita(numGiocatori, gameMode, playMode);

        return codice;
    }


    public Giocatore aggiungiGiocatore(){
     System.out.println("Inserici nome giocatore: ");
       String nome = scan.nextLine();
       Giocatore giocatore = new Giocatore(nome);

       return giocatore;

    }


}
