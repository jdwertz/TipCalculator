package edu.harding.tipcalculatornew;

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    private EditText mBillEditText;
    private EditText mTipPercentEditText;
    private TextView mTipAmount;
    private TextView mTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Assign the widgets to class variables
        mBillEditText = (EditText) findViewById(R.id.bill);
        mTipPercentEditText = (EditText) findViewById((R.id.tipPercent));
        mTipAmount = (TextView) findViewById((R.id.answerTipAmount));
        mTotal = (TextView) findViewById(R.id.answerTotalAmount);
    }

    public void calculateClick(View view){
        tipCalculatorModel tipCalc = new tipCalculatorModel();
        try {
            String billStr = mBillEditText.getText().toString();
            tipCalc.setBill(Float.parseFloat(billStr));
            String percentStr = mTipPercentEditText.getText().toString();
            tipCalc.setPercent(Float.parseFloat(percentStr));

            NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
            String tipAmount = moneyFormat.format(tipCalc.getTip());
            String totalAmount = moneyFormat.format(tipCalc.getTotal());
            mTipAmount.setText(tipAmount);
            mTotal.setText(totalAmount);
        }
        catch (Exception a){
            Toast.makeText(this, getResources().getString(R.string.ErrorMsg), Toast.LENGTH_SHORT).show();
            mTipAmount.setText("");
            mTotal.setText("");
        }


    }
}

