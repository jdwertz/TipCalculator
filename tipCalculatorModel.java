package edu.harding.tipcalculatornew;

/**
 * Created by Josh on 9/5/2017.
 */

public class tipCalculatorModel {

    private float Bill;
    private float Percent;
    private float Tip;
    private float Total;


    public float getBill() {
        return Bill;
    }

    public void setBill(float bill) {
        Bill = bill;
    }

    public float getPercent() {
        return Percent;
    }

    public void setPercent(float percent) {
        Percent = percent;
    }

    public float getTip() {
        Tip = Bill * Percent * 0.01f;
        return Tip;
    }

    public void setTip(float tip) {
        Tip = tip;
    }

    public float getTotal() {
        Total = Tip + Bill;
        return Total;
    }

    public void setTotal(float total) {
        Total = total;
    }


}
