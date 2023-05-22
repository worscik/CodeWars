public class TrafficLights {

    public static void main(String[] args) {

        updateLight("red");
        updateLight("yellow");

    }


    public static String updateLight(String current) {

       switch (current){
           case "green" -> {
               return "yellow";
           }
           case "red" -> {
               return "green";
           }
           default  -> {
               return "red";
           }
       }
    }

}
