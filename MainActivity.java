package korp.lovecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button res;
    EditText nme,pnme;
    TextView tvres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res = (Button) findViewById(R.id.result);
        nme = (EditText) findViewById(R.id.name);
        pnme = (EditText) findViewById(R.id.pname);
        tvres = (TextView) findViewById(R.id.textView);
    }

        public void result(View view)
    {
        String lname=nme.getText().toString();
        String lpname=pnme.getText().toString();
        int count=0;
        try {
            for (int i = 0; i < lname.length(); i++) {
                for (int j = 0; j < lpname.length(); i++) {
                    if (lname.charAt(i) == lpname.charAt(j)) {
                        count = count + 1;
                    }
                }
            }
        }catch (Exception e)
        {

        }
        int res=count*10;
        tvres.setText(String.valueOf(res+"%"));

    }

}
