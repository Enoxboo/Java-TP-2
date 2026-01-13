package isp.src;

import java.util.Scanner;

public class MainIsp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Imprimer");
            System.out.println("2. Scanner");
            System.out.println("3. Faxer");
            System.out.println("0. Quitter");
            System.out.print("Choix fonctionnalité : ");

            int fonction = lireEntier(scanner);
            if (fonction == 0) break;

            System.out.println("\nChoisir la machine :");
            System.out.println("1. Imprimante simple");
            System.out.println("2. Imprimante multifonction");
            System.out.print("Choix machine : ");

            int machineChoisie = lireEntier(scanner);

            Object machine;
            if (machineChoisie == 2) {
                machine = new ImprimanteMultifonction();
            } else {
                machine = new ImprimanteSimple();
            }

            executerFonction(machine, fonction);
        }

        scanner.close();
    }

    private static void executerFonction(Object machine, int fonction) {
        switch (fonction) {
            case 1:
                if (machine instanceof Imprimable) {
                    ((Imprimable) machine).print();
                } else {
                    System.out.println("Fonctionnalité non supportée par cette machine");
                }
                break;
            case 2:
                if (machine instanceof Scannable) {
                    ((Scannable) machine).scan();
                } else {
                    System.out.println("Fonctionnalité non supportée par cette machine");
                }
                break;
            case 3:
                if (machine instanceof Faxable) {
                    ((Faxable) machine).fax();
                } else {
                    System.out.println("Fonctionnalité non supportée par cette machine");
                }
                break;
            default:
                System.out.println("Fonction inconnue");
        }
    }

    private static int lireEntier(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrée invalide : ");
            }
        }
    }
}
