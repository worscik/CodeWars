import java.util.ArrayList;
import java.util.List;

public class TotalAmountOfPoints {

    public static void main(String[] args) {

        String[] listOfMatch = new String[]{"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"};

        points(listOfMatch);


    }



    public static int points(String[] games) {
        int points = 0;

        List<String> list = new ArrayList<>();

        for (String x : games){
            x.split(",");
            list.add(x);
        }

        for(String x : list){
            int X = x.charAt(0);
            int Y = x.charAt(2);

            if(X > Y ){
                points += 3;
            }

            if(X < Y){
                points += 0;
            }

            if(X == Y){
                points += 1;
            }

        }
        return points;

    }





}
