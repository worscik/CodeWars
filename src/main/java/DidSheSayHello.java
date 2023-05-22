import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class DidSheSayHello {

    public static void main(String[] args) {
        validateHello("ciao bella");

    }


    public static boolean validateHello(String greetings) {

        List<String> listOfElements = new ArrayList<>();
        listOfElements.add("hello");
        listOfElements.add("ciao");
        listOfElements.add("salut");
        listOfElements.add("hallo");
        listOfElements.add("hola");
        listOfElements.add("ahoj");
        listOfElements.add("czesc");

        for(String x : listOfElements){
            if(listOfElements.contains(greetings.toLowerCase())){
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }
}