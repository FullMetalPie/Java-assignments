/*
Esercizio Java - OOP - Concessionaria
Con delle classi e delle classi astratte, modellare al meglio le seguenti entità:
- mezzo di trasporto
- veicolo (a motore)
- automobile
- motociclo

All’interno delle entità (decidere in modo opportuno in quali) vanno inseriti i seguenti
attributi:
- marca
- modello
- velocità (media)
- potenza
- quantità di ruote motrici
- tipo di motore (benzina, diesel)
- litri di carburante consumato per percorrere 100 km (per un percorso misto a velocità media)

All’interno delle entità (decidere in modo opportuno in quali) vanno inseriti i seguenti metodi:
- calcola costo del carburante al km
- calcola la potenza per singola ruota motrice

Scrivere un main che:
- crei un oggetto per ogni tipo di classe concreta
- chieda e faccia inserire all’utente i prezzi al litro di benzina e gasolio
- chieda all’utente il modello e poi stampi a standard output: i dati del relativo oggetto, il
costo del carburante per ogni km percorso, la potenza per singola ruota motrice

Pietri Andrea 4AI
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Automobile auto = new Automobile();
        Motociclo moto = new Motociclo();

        Scanner input = new Scanner(System.in);

        double prezzoGasolio;
        double prezzoBenzina;

        do {
            System.out.println("Prezzo al litro del gasolio: ");
            prezzoGasolio = input.nextDouble();
        } while (prezzoGasolio <= 0);

        do {
            System.out.println("Prezzo al litro della benzina: ");
            prezzoBenzina = input.nextDouble();
        } while (prezzoBenzina <= 0);

        System.out.println("Inserisci modello auto: ");
        auto.modello = input.next();

        System.out.println("Inserisci modello moto: ");
        moto.modello = input.next();

        input.close();
    }
}