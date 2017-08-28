package cl.mind.mvpdayexample;

/**
 * Created by Gabriel on 28-08-2017.
 */

public class DayEvaluator {

    private NumberCallBack callBack;

    public DayEvaluator(NumberCallBack callBack) {
        this.callBack = callBack;
    }

    public void isEven(String value) {

        if (value.trim().length() > 0) {

            int auxNumber = Integer.parseInt(value);
            value = String.valueOf(auxNumber %2 == 0);
            callBack.even(value);


        } else {

            callBack.blackInput();

        }
    }
}
