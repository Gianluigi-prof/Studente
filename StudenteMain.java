import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScriviCSV {
    public static void main(String[] args) {
        List<Studente> studenti = new ArrayList<>();
        studenti.add(new Studente("Marco", "Rossi", 18));
        studenti.add(new Studente("Luca", "Bianchi", 19));
        studenti.add(new Studente("Anna", "Verdi", 17));

        try (FileWriter writer = new FileWriter("studenti.csv")) {
            // intestazione
            writer.write("Nome,Cognome,Età\n");

            // scrittura dati
            for (Studente s : studenti) {
                writer.write(s.toCSV() + "\n");
            }

            System.out.println("File CSV creato correttamente!");
        } catch (IOException e) {
            System.err.println("Errore nella scrittura del file: " + e.getMessage());
        }
    }
}
