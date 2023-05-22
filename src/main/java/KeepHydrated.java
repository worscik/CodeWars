public class KeepHydrated {

    public int Liters(double time)  {

      if(time > 0){
          int howMany = (int) (time * 0.5);
         return howMany;
      }

        return -1;

    }

    public static void main(String[] args) {

        KeepHydrated keepHydrated = new KeepHydrated();
        keepHydrated.Liters(6.7);

    }


}
