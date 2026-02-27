import java.util.Scanner;

public class Moyenne {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur les trois notes
        System.out.print("Entrez la première note : ");
        double note1 = scanner.nextDouble();

        System.out.print("Entrez la deuxième note : ");
        double note2 = scanner.nextDouble();

        System.out.print("Entrez la troisième note : ");
        double note3 = scanner.nextDouble();

        // Calculer la moyenne
        double moyenne = (note1 + note2 + note3) / 3;

        // Afficher la moyenne
        System.out.println("La moyenne est : " + moyenne);

        // Déterminer si la moyenne est suffisante
        if (moyenne >= 10) {
            System.out.println("Vous êtes admis.");
        } else {
            System.out.println("Vous êtes recalé.");
        }

        // Fermer l'objet Scanner
        scanner.close();
    }
}