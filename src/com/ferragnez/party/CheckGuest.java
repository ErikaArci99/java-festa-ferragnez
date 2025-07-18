//State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito è di assicurarvi che accedano alla festa solo gli invitati presenti sulla lista (in fondo al post)

//Creare un progetto java-festa-ferragnez con il package com.ferragnez.party, a cui aggiungere la classe CheckGuest

//Nel programma occorre:
//- creare e inizializzare l’array contenente i nomi degli invitati
//- chiedere all’utente come si chiama
//- verificare che il nome sia presente nella lista
//- lasciarlo entrare o rispedirlo cortesemente da dove è venuto :occhiali_da_sole: 

//Bonus
//se avete usato il ciclo for per cercare il nome nella lista nella consegna base, implementare lo stesso programma usando il ciclo while, e viceversa

//Lista invitati: 
//Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic

package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

    public static void main(String[] args) {
        String[] guest = {
                "Dua Lipa",
                "Paris Hilton",
                "Manuel Agnelli",
                "J-Ax",
                "Francesco Totti",
                "Ilary Blasi",
                "Bebe Vio",
                "Luis",
                "Pardis Zarei",
                "Martina Maccherone",
                "Rachel Zeilic"
        };
        // scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // chiedere il nome all'utente
        System.out.print("Inserisci il tuo nome: ");

        // leggere il nome inserito dall'utente
        String name = scanner.nextLine();

        // chiudo scanner
        scanner.close();

        // variabile per tenere traccia se il nome è stato trovato
        boolean found = false;

        // variabile per tenere traccia l'indice del nome corrente
        int index = 0;

        // ciclo while per cercare il nome nella lista degli invitati
        while (!found && index < guest.length) {
            // se il nome corrente corrisponde a quello inserito dall'utente
            if (guest[index] == name) {
                found = true; // segna come trovato
                break; // esce dal ciclo
            } else {
                // se il nome non corrisponde, continua a cercare
                index++;
            }
        }
    }
}
