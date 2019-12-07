package com.shagi.tablelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3;
    Button b1;
    TextView t1;
    String number1,number2,result;
    int n1,n2,n3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText)findViewById(R.id.e1);
        ed2=(EditText)findViewById(R.id.e2);
        b1=(Button)findViewById(R.id.b1);
        ed3=(EditText)findViewById(R.id.e3);
        t1=(TextView)findViewById(R.id.t1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number1=ed1.getText().toString();
                number2=ed2.getText().toString();

                n1=Integer.parseInt(number1);
                n2=Integer.parseInt(number2);
                n3=n1+n2;
                result=String.valueOf(n3);

                t1.setVisibility(View.VISIBLE);
                ed3.setText(result);



            }
        });


    }
}
