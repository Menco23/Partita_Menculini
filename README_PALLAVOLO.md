# Progetto Partita Pallavolo

## Scopo del Progetto

Il progetto simula una partita di pallavolo utilizzando thread in Java. Ogni giocatore è rappresentato da un thread che incrementa il numero dei passaggi effettuati. L'obiettivo è studiare la gestione dei thread, la loro priorità, e la sincronizzazione tra loro.

## Metodi e Attributi della Classe Thread

- `setPriority(int newPriority)`: imposta la priorità del thread. Valori più alti indicano una priorità maggiore.
- `getPriority()`: restituisce la priorità del thread.
- `getName()`: restituisce il nome del thread.
- `start()`: avvia l'esecuzione del thread.
- `yield()`: suggerisce al thread scheduler di dare la possibilità ad altri thread di eseguire.

## Metodi e Attributi della Classe Object

Nel codice fornito non vengono utilizzati metodi specifici della classe `Object`, ma è importante ricordare che tutti gli oggetti in Java ereditano da `Object`. Metodi come `wait()`, `notify()`, e `notifyAll()` sono fondamentali per la gestione della sincronizzazione, anche se non direttamente usati qui.

## Importanza della Classe Arbitro/Giudice

La classe Arbitro/Giudice è cruciale per determinare il vincitore della partita. Poiché più thread potrebbero accedere contemporaneamente a questa risorsa condivisa.

## Commento dell'Esecuzione

Il progetto dimostra la creazione e gestione dei thread, assegnando priorità diverse e osservando il loro comportamento. L'utilizzo del metodo `yield()` mostra come i thread possono influenzare l'esecuzione degli altri thread. Tuttavia, manca la parte di sincronizzazione necessaria per la gestione delle risorse condivise.
