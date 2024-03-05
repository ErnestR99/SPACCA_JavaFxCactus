package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

//classe che crea un mazzo da 54 carte francesi
public class Mazzo {
    ArrayList<Carta> carte;

    // creazione carte
    public Mazzo() {
        carte = new ArrayList<>();

        int numeroSemi = Carta.Seme.values().length;
        Carta.Seme[] semi = Carta.Seme.values();
        String[] nomeCarta = { "Asso", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Regina", "Re" };
        int[] valore = new int[13];
        boolean effetto;

        // crea 13 carte per ogni seme con i relativi valori ed effetti se presenti
        for (int i = 0; i < numeroSemi; i++) {
            for (int j = 0; j < 13; j++) {
                effetto = false;
                if (nomeCarta[j].equals("6") || nomeCarta[j].equals("7")) {
                    effetto = true;
                    valore[j] = Integer.parseInt(nomeCarta[j]);
                } else if (nomeCarta[j].equals("Asso")) {
                    valore[j] = 1;
                } else if (nomeCarta[j].equals("Jack")) {
                    effetto = true;
                    valore[j] = 11;
                } else if (nomeCarta[j].equals("Regina")) {
                    effetto = true;
                    valore[j] = 12;
                } else if (nomeCarta[j].equals("Re")
                        && (semi[i].equals(Carta.Seme.CUORI) || semi[i].equals(Carta.Seme.QUADRI))) {
                    valore[j] = 0;
                } else if (nomeCarta[j].equals("Re")
                        && (semi[i].equals(Carta.Seme.PICCHE) || semi[i].equals(Carta.Seme.FIORI))) {
                    valore[j] = 20;
                } else {
                    valore[j] = Integer.parseInt(nomeCarta[j]);
                }
                carte.add(new Carta(semi[i], nomeCarta[j], valore[j], effetto));
            }
        }
        // Si aggiungono al mazzo i due jolly
        carte.add(new Carta(Carta.Colore.NERO));
        carte.add(new Carta(Carta.Colore.ROSSO));
    }

    // metodo mescola mazzo
    public void mescola() {
        Collections.shuffle(carte);
    }

    // pesca la prima carta del mazzo
    public void pesca() {
        if (carte.isEmpty()) {
            throw new NoSuchElementException("Il mazzo di carte è finito!");
        } else {
            Carta cartaPescata = carte.remove(0);
            if (cartaPescata.nomeCarta.equals("Regina")) {
                System.out.println("Hai pescato una " + cartaPescata.toString());
            } else {
                System.out.println("Hai pescato un " + cartaPescata.toString());
            }
        }
    }

    //stampa il mazzo in modo da verificare che si sia creato correttamente
    public String toString() {
        String ris = "Mazzo [\n";

        for (Carta carta : carte) {
            ris += "   " + carta.toString() + "\n";
        }

        ris += "]";

        return ris;
    }
}
