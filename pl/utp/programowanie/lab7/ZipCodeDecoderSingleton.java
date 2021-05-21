package pl.utp.programowanie.lab7;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeDecoderSingleton {

    private static ZipCodeDecoderSingleton INSTANCE = new ZipCodeDecoderSingleton();

    private Map<Integer, String> zipCodesMap;

    private ZipCodeDecoderSingleton(){
        zipCodesMap = downloadAllZipCodesFromDB();
    }

    public static ZipCodeDecoderSingleton getInstance() {
        return INSTANCE;
    }

    public String decodeZipcode(Integer zipcode){
        return zipCodesMap.get(zipcode);
    }

    private Map<Integer, String> downloadAllZipCodesFromDB() {


        return new HashMap<Integer, String>() {{
            put(25100, "Kielce");
            put(81050, "Gdynia");
            put(51015, "Wrocław");
            put(70001, "Szczecin");
            //.... many, many codes
            put(02554, "Pruszków");
        }};
    }
}
