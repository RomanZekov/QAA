package main;

import static main.utils.TestManager.getDriver;

/**
 * Created by User on 03.11.2015.
 */
public class ResultPage {

    public boolean isPresent(String parameter) {
        String result = getDriver().getTitle();
        while(result.equals("Google")){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            result = getDriver().getTitle();
        }
        return result.contains(parameter);
    }
}
