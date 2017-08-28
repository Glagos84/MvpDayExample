package cl.mind.mvpdayexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.value;


public class MainActivity extends AppCompatActivity implements NumberCallBack {

    private EditText editText;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = (EditText) findViewById(R.id.valueEt);
        textView = (TextView) findViewById(R.id.responseTv);

        button = (Button) findViewById(R.id.resultBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String value  = editText.getText().toString();
                new DayEvaluator(MainActivity.this).isEven(value);

            }
        });


    }


    @Override
    public void even(String values) {


            textView.setText(values);




    }

    @Override
    public void blackInput() {
        textView.setText("Ingreso un Número");

    }
}
