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

public class Main4Activity extends Activity {

    Button b2;
    RadioGroup r2;
    RadioButton r21,r;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Bundle b=getIntent().getExtras();
        if(b!=null)
        {
            a=Integer.parseInt(b.getString("Result"));
        }
        r2=(RadioGroup)findViewById(R.id.radioGroup);
        b2=(Button)findViewById(R.id.button);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId=r2.getCheckedRadioButtonId();
                r21=(RadioButton)findViewById(selectedId);
                r =(RadioButton) findViewById(R.id.radioButton2);
                if(r21==r)
                {
                    a+=1;
                }


                if(r21!=null){
                    Toast.makeText(Main4Activity.this,"Your Ans "+r21.getText()+" is Sucessfully Saved",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(Main4Activity.this,Main5Activity.class);
                    i.putExtra("Result",String.valueOf(a));
                    startActivity(i);
                    finish();}
                else
                    Toast.makeText(Main4Activity.this, "Please select One of the Option", Toast.LENGTH_SHORT).show();

            }


        });
    }

}
