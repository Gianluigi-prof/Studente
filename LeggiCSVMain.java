import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeggiCSV {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("studenti.csv"))) {
            String linea;
            reader.readLine(); // salta intestazione
            while ((linea = reader.readLine()) != null) {
                String[] campi = linea.split(",");
                System.out.println("Nome: " + campi[0] +
                                   ", Cognome: " + campi[1] +
                                   ", Età: " + campi[2]);
            }
        } catch (IOException e) {
            System.err.println("Errore nella lettura del file: " + e.getMessage());
        }
    }
}
