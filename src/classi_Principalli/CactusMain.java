

/*import java.util.Scanner;
import java.util.Random;

public class Cactus{
    public static void main(String args[]){
 
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        //Autentificazzione admin
        Amministratore admin = new Amministratore();
        admin.autenticare();

        // INIZIO CARTE
        MazzoDiCarte mazzo = new MazzoDiCarte();
        mazzo.mescola();
        System.out.println(" ");

        //Una volta specificato il tipo di gioco e numero di giocatori inizializiamo i giocatori con nomi 
        //se ci sono meno giocatori di quelli ammessi nel gioco si creano bot per "riempire il tavolo"
         
        int numBot = maxGiocatori - numGiocatori; 
        
         Giocatore[] giocatori = new Giocatore[numGiocatori];


        for (int i=0; i<numGiocatori; i++){
            System.out.println("Giocatore "+(i+1)+ " inserisci il tuo nome:");  
            String nome = scan.nextLine(); 
            giocatori[i] = new Giocatore(nome);
                
            }
        
        if (numBot != 0){
            System.out.println("Inserisci la difficolta dei bot: ");
            int diff = scan.nextInt();

            Robot[] robots = new Robot[numBot];
        
             for (int i=0; i<numBot; i++){
                robots[i] = new Robot(diff);
            }    

        }

        // ROUND 0 (distribuire carte) 

        Carta[][] mano = new Carta [maxGiocatori][4];

            for (int i = 0; i < maxGiocatori; i++) {
              for (int j = 0; j < 4; j++) {                
                mano[i][j] = mazzo.pescaCarta();
            }
        }

        // Guardare la carta

        for (int i = 0; i < maxGiocatori; i++) {
            if(giocatori[i] instanceof Giocatore){
                
                System.out.println("Giocatore: " + giocatori[i].getNome() + " Scegli quale carta vuoi vedere ( 1-4 ):");
                int cartaScelta = scan.nextInt();   
                System.out.println("Carta: " + mano[i][cartaScelta-1].toString());
            
            }else {
                
                int cartaScelta = random.nextInt(4);
                System.out.println("Bot: " + (i+1) + " ha scelto la carta " + (cartaScelta+1));
                System.out.println("Carta: " + mano[i][cartaScelta].toString());
            } 
        }
           
        //FINE PARTECIPANTI
        
        //distribuisci carte
        if(nTurni == 0){
            for(int i=0; i<5; i++){
            manoG1.add(mazzo.pescaCarta());
            manoG2.add(mazzo.pescaCarta());
            }
        }
        //fine distribuzione carte

        scan.close();
    */

    package src;

    import javafx.application.Application;
    import javafx.fxml.FXMLLoader;
    import javafx.scene.Parent;
    import javafx.scene.Scene;
    import javafx.stage.Stage;
    
    
    public class CactusMain extends Application {
    
        @Override
        public void start(Stage primaryStage) throws Exception {
            // Load FXML
            Parent root = FXMLLoader.load(getClass().getResource("/resources/AdminLogin.fxml"));
    
    
            // Config Scene
            Scene scene = new Scene(root, 600, 400);
    
            // Config primary stage
            primaryStage.setTitle("Cactus JavaFX");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    
        public static void main(String[] args) {
            launch(args);
        }
    }

    
