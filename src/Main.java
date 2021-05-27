import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = true;
        System.out.println();
        System.out.println("*************************** Programowanie 2 IV sem EiT NS LAB 7 ********************************");
        System.out.println("****************************** MENU: masz do wyboru  ( 1 - 5 ) *********************************");
        System.out.println();
        while (gameOver) {
            System.out.println("                           1. Wymagania dla klasy Dog ");
            System.out.println("                           2. Wymagania dla adaptera klasy  \n" +
                    "                               ComputerGame i interfejsu PCGame ");
            System.out.println("                           3. Kod klasy PhoneNumberFinder ");
            System.out.println("                           4. * Autorzy programu * ");
            System.out.println("                           5. Wyjście z programu ");
            System.out.println("Twój wybór: ");
            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1 -> System.out.println("Stwórz builder dla klasy, która ma następujące pola: \n" +
                        "public class Dog { private String name; private String type; \n" +
                        "private Integer age; private List<String> toys; } \n" +
                        "Builder powinien zostać zdefiniowany wewnątrz klasy Dog\n" +
                        "i \tpowinien być jedynym sposobem stworzenia jej instancji.\n ");
                case 2 -> System.out.println("Stwórz adapter klasy ComputerGame do interfejsu PCGame. \n" +
                        "Uwagi: \n" +
                        "•\tliczba w nazwie wartości PegiAgeRating oznacza minimalny wiek gracza \n" +
                        "•\tpotraktuj grę jako TripleA jeżeli jej budżet przekracza 50 milionów \n" +
                        " \n" +
                        "@Data \n" +
                        "@AllArgsConstructor public class ComputerGame { private final String name; private final PegiAgeRating pegiAgeRating; private final Double budgetInMillionsOfDollars; private final Integer minimumGpuMemoryInMegabytes; private final Integer diskSpaceNeededInGB; private final Integer ramNeededInGb; private final Integer coresNeeded; private final Double coreSpeedInGhz; \n" +
                        "} \n" +
                        " \n" +
                        "public enum PegiAgeRating { \n" +
                        "  P3, P7, P12, P16, P18 \n" +
                        "} \n" +
                        " \n" +
                        "public class Requirements { private final Integer gpuGb;    private final Integer HDDGb;    private final Integer RAMGb;    private final Double cpuGhz;    private final Integer coresNum; \n" +
                        "} \n" +
                        " \n" +
                        "public interface PCGame { \n" +
                        "   String getTitle();    Integer getPegiAllowedAge();   boolean isTripleAGame(); \n" +
                        "   Requirements getRequirements(); \n" +
                        "} \n");
                case 3 -> System.out.println("import java.util.HashMap;\n" +
                        "import java.util.Map;\n" +
                        "\n" +
                        "public class PhoneNumberFinder {\n" +
                        "\n" +
                        "    private static PhoneNumberFinder INSTANCE = new PhoneNumberFinder();\n" +
                        "\n" +
                        "    private Map<Integer, String> PhoneNumbersMap;\n" +
                        "\n" +
                        "    private PhoneNumberFinder(){\n" +
                        "        PhoneNumbersMap = NumbersDB();\n" +
                        "    }\n" +
                        "\n" +
                        "    public static PhoneNumberFinder getInstance() {\n" +
                        "        return INSTANCE;\n" +
                        "    }\n" +
                        "\n" +
                        "    public String FindNumber(Integer number){\n" +
                        "        return PhoneNumbersMap.get(number);\n" +
                        "    }\n" +
                        "\n" +
                        "    private Map<Integer, String> NumbersDB() {\n" +
                        "\n" +
                        "\n" +
                        "        return new HashMap<Integer, String>() {{\n" +
                        "            put(727247452, \"Adamiak Adam\");\n" +
                        "            put(663774923, \"Rywal Damian\");\n" +
                        "            put(987329127, \"Borysewicz Borys\");\n" +
                        "            put(632801222, \"Piekna Ola\");\n" +
                        "            put(312142322, \"Dorodna Agata\");\n" +
                        "            put(888321032, \"Zdrowa Ania\");\n" +
                        "            put(888210432, \"Zdun Piotr\");\n" +
                        "            put(623341322, \"Kawiorski Jan\");\n" +
                        "\n" +
                        "        }};\n" +
                        "    }\n" +
                        "}");
                case 4 -> System.out.println("Maciej Klonowski nr albumu 115612 \n" +
                        "Bartosz Babiarz nr albumu 109627 \n");
                case 5 -> gameOver = false;
            }
        }
    }

 //   public static void main(String[] args) {

        //Zad 1 Lab 7

     //   Dog.DogBuilder dogBuilder = Dog.DogBuilder.aDog();
       // Dog Reksio = dogBuilder.withName("Reksio").withAge(2).withType("Cane Corso").build();
     //   Dog Lady = dogBuilder.withName("Lady").withAge(4).withToys(Arrays.asList("kaczka", "drapak")).build();
}
    //        System.out.println(Reksio);
   //         System.out.println(Lady);


            //Zad 2 Lab 7

//           ComputerGame Settlers = new ComputerGame("Settlers", ComputerGame.PegiAgeRating.P12, 20.0d, 1032,
          //          20, 2, 2, 1.2d);
  //         System.out.println("Name: " + Settlers.getTitle());
    //       System.out.println("TripleA: " + Settlers.isTripleAGame());
      //     System.out.println("Allowed age: " + Settlers.getPegiAllowedAge());
        //  System.out.println("Requirements: " + Settlers.getRequirements());


            //Zad 3 Lab 7 "Uzyty wzorzec - SINGLETON"

      //   PhoneNumberFinder PhoneFinder = PhoneNumberFinder.getInstance()
     //    System.out.println("Szukany posiadacz numeru  " + PhoneFinder.FindNumber(727247452));




