import java.util.Arrays;

public class Main {

        public static void main(String[] args) {

            //Zad 1 Lab 7

            Dog.DogBuilder dogBuilder = Dog.DogBuilder.aDog();
            Dog Reksio = dogBuilder.withName("Reksio").withAge(2).withType("Cane Corso").build();
            Dog Lady = dogBuilder.withName("Lady").withAge(4).withToys(Arrays.asList("kaczka", "drapak")).build();

            System.out.println(Reksio);
            System.out.println(Lady);


            //Zad 2 Lab 7

            ComputerGame Settlers = new ComputerGame("Settlers", ComputerGame.PegiAgeRating.P12, 20.0d, 1032,
                    20, 2, 2, 1.2d);
            System.out.println("Name: " + Settlers.getTitle());
            System.out.println("TripleA: " + Settlers.isTripleAGame());
            System.out.println("Allowed age: " + Settlers.getPegiAllowedAge());
            System.out.println("Requirements: " + Settlers.getRequirements());


            //Zad 3 Lab 7 "Uzyty wzorzec - SINGLETON"

            PhoneNumberFinder PhoneFinder = PhoneNumberFinder.getInstance();
            System.out.println("Szukany posiadacz numeru  " + PhoneFinder.FindNumber(727247452));



        }
    }

