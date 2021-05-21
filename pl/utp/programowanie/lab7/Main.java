package pl.utp.programowanie.lab7;

import pl.utp.programowanie.lab7.Dog.DogBuilder;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        DogBuilder dogBuilder = DogBuilder.aDog();
        Dog Reksio = dogBuilder.withName("Reksio").withAge(2).withType("Cane Corso").build();
        Dog Lady = dogBuilder.withName("Lady").withAge(4).withToys(Arrays.asList("kaczka", "drapak")).build();

        System.out.println(Reksio);
        System.out.println(Lady);



        // 2
        ComputerGame Settlers = new ComputerGame("Settlers", ComputerGame.PegiAgeRating.P12, 20.0d, 1032,
                20, 2, 2, 1.2d);
        System.out.println("Name: " + Settlers.getTitle());
        System.out.println("TripleA: " + Settlers.isTripleAGame());
        System.out.println("Allowed age: " + Settlers.getPegiAllowedAge());
        System.out.println("Requirements: " + Settlers.getRequirements());


        // 3 singleton
        ZipCodeDecoderSingleton zipCodeDecoder1 = ZipCodeDecoderSingleton.getInstance();
        System.out.println(zipCodeDecoder1.decodeZipcode(02554));
        System.out.println(zipCodeDecoder1);

        ZipCodeDecoderSingleton zipCodeDecoder2 = ZipCodeDecoderSingleton.getInstance();
        System.out.println(zipCodeDecoder2);

    }
}

