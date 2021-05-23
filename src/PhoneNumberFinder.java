import java.util.HashMap;
import java.util.Map;

public class PhoneNumberFinder {

    private static PhoneNumberFinder INSTANCE = new PhoneNumberFinder();

    private Map<Integer, String> PhoneNumbersMap;

    private PhoneNumberFinder(){
        PhoneNumbersMap = NumbersDB();
    }

    public static PhoneNumberFinder getInstance() {
        return INSTANCE;
    }

    public String FindNumber(Integer number){
        return PhoneNumbersMap.get(number);
    }

    private Map<Integer, String> NumbersDB() {


        return new HashMap<Integer, String>() {{
            put(727247452, "Adamiak Adam");
            put(663774923, "Rywal Damian");
            put(987329127, "Borysewicz Borys");
            put(632801222, "Piekna Ola");
            put(312142322, "Dorodna Agata");
            put(888321032, "Zdrowa Ania");
            put(888210432, "Zdun Piotr");
            put(623341322, "Kawiorski Jan");

        }};
    }
}