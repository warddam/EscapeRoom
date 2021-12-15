import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;


public class MyTimer {

    public void countdown() {

        int i=5;
        int time;

        while (i>0) {
            time=i*1;
            System.out.println("The game will stop in:" + time + " seconds");

            i=i-1;

            try {
                TimeUnit.SECONDS.sleep(2);
            }
            catch(InterruptedException ex) {
                System.out.println("Self Destructed");

            }
            if (i==0) System.out.println("GAME OVER!");
        }


        System.exit(0);
    }


    }








