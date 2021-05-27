// public class Interface {
// }

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = true;
        System.out.println();
        System.out.println("*************************** WITAJ W KULTOWEJ GRZE OCZKO ********************************");
        System.out.println("******************** NA POCZĄTEK POROSZĘ ABYŚ PODAŁ ILOŚC GRACZY ( 2 - 4 ) **************");
        System.out.println();
        while (gameOver) {
            System.out.println("                           1. * Black Jack * ");
            System.out.println("                           2. Ilość graczy: 2");
            System.out.println("                           3. Ilość graczy: 3");
            System.out.println("                           4. Ilość graczy: 4 ");
            System.out.println("                           5. Wyjście z programu ");
            System.out.println("Twój wybór: ");
            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1 -> System.out.println("Prosta gra karciana - BlackJack\n" +
                        "Przepływ programu:\n" +
                        "1. Gra pyta o liczbę graczy (maksymalnie 4. graczy) - dodatkowo można zapytać o imię graczy.\n" +
                        "2. Gra przygotowuje standardową talię kart ułożoną losowo (potasowaną)\n" +
                        "3. Gra wyciąga pierwszą kartę dla gracza nr 1. i pyta, czy dobierać dalej:\n" +
                        "    - jeśli gracz wpisze słówko \"next\", gracz otrzymuje kartę\n" +
                        "    - jeśli gracz wpisze słówko \"pass\", rezygnuje z dobierania dalszych kart\n" +
                        "4. W zależności jeśli gracz zrezygnuje z dobierania lub przebije sumę 21, gra przechodzi do następnego gracza.\n" +
                        "5. Krok 3 powtarza się dla wszystkich graczy.\n" +
                        "6. Na końcu karty dobiera komputer.\n" +
                        "7. W zależności od wyniku program drukuje informację o zwycięzcy:\n" +
                        "    - wygrywa ten, kto był najbliżej wyniku 21, ale go nie przekroczył\n" +
                        "        - wyjątek: perskie BlackJack dające wynik 22\n" +
                        "    - jeśli kilkoro graczy ma ten sam wynik, należy wydrukować informację o remisie, kto zremisował i z jakim wynikiem\n" +
                        "8. W zależności od różnych wyników wygrywa ten, czyja kombinacja ma większy priorytet:\n" +
                        "    - perskie BlackJack (może być remis jeśli dwóch graczy będzie je mieć),\n" +
                        "    - standardowe BlackJack,\n" +
                        "    - suma najbliższa 21.\n" +
                        "9. Na zakończenie gry po informacji kto wygrał gra proponuje czy zagrać jeszcze raz " +
                        "                                                                                          ");
                case 2 -> System.out.println("Lczba graczy: 2");
                case 3 -> System.out.println("Lczba graczy: 3");
                case 4 -> System.out.println("Lczba graczy: 4");
                case 5 -> gameOver = false;
            }
        }
    }
}

