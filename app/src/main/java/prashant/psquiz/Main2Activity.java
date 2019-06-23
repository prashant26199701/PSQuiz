package prashant.psquiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends Activity {
    RadioButton r1, r2;
    Button b;
    RadioGroup r;
    int a = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        r = (RadioGroup) findViewById(R.id.radioGroup);
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedId = r.getCheckedRadioButtonId();
                r1 = (RadioButton) findViewById(selectedId);
                r2 = (RadioButton) findViewById(R.id.radioButton2);
                if(r2==r1)
                {
                    a+=1;
                }

                if(r1!=null){
                    Toast.makeText(Main2Activity.this, "Your Ans "+ r1.getText()+ " is Sucessfully Saved", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Main2Activity.this, Main3Activity.class);
                    i.putExtra("Result",String.valueOf(a));
                    startActivity(i);
                    finish();}
                else
                    Toast.makeText(Main2Activity.this, "Please select One of the Option", Toast.LENGTH_SHORT).show();

            }


        });
    }}
