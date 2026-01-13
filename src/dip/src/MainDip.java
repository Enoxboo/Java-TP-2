package dip.src;

import java.util.Scanner;

public class MainDip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Envoyer un email");
            System.out.println("2. Envoyer un SMS");
            System.out.println("3. Envoyer une notification push");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");

            int choix = lireEntier(scanner);
            if (choix == 0) break;

            System.out.print("Message : ");
            String message = scanner.nextLine();

            MessageSender sender = getSender(choix);
            if (sender != null) {
                NotificationService service = new NotificationService(sender);
                service.envoyer(message);
            }
        }

        scanner.close();
    }

    private static MessageSender getSender(int choix) {
        return switch (choix) {
            case 1 -> new EmailSender();
            case 2 -> new SmsSender();
            case 3 -> new PushNotificationSender();
            default -> null;
        };
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
