package asan.example.androidhomework_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button click;
    TextView result;
    EditText firstEdit;
    EditText placeEdit;
    EditText secondEdit;


    String S;
    double one, two, equals;

    private static final String FIRST = "FIRST";
    private static final String RESULT = "RESULT";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click = findViewById(R.id.button);
        result = findViewById(R.id.tvResult);
        firstEdit = findViewById(R.id.etNum1);
        placeEdit = findViewById(R.id.etNum2);
        secondEdit = findViewById(R.id.etNum3);


        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 = firstEdit.getText().toString();
                String s2 = secondEdit.getText().toString();

                one = Double.parseDouble(s1);
                two = Double.parseDouble(s2);

                equals = one + two;
                equals = one - two;
                equals = one * two;
                equals = one / two;

                S = Double.toString(equals);


                result.setText(S);


            }
        });


    }


    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        if (savedInstanceState != null) {

            S = savedInstanceState.getString(RESULT);
            one=savedInstanceState.getDouble(FIRST);

            result.setText(S);


        }


    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);


        if (S != null) {
            outState.putString(RESULT, S);
        }
    }

}
