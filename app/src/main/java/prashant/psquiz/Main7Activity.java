package prashant.psquiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main7Activity extends Activity {

    int a;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        TextView t=(TextView) findViewById(R.id.textView6);
        ImageView i=(ImageView)findViewById(R.id.imageView2);
        b=(Button)findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i=new Intent();
                finish();
            }
        });
        Bundle b=getIntent().getExtras();
        if(b!=null)
        {
            a=Integer.parseInt(b.getString("Result"));
        }
        if(a==5){
            //Toast.makeText(this,"Hey Man ! Ur all answers are correct and Ur score "+a+" Ur winner",Toast.LENGTH_LONG).show();
            t.setText("Hey Man ! Your all answers are correct and Your score is :"+a+" Congratulation you are winner");
            //rawable d=getResources().getDrawable(R.drawable.pic2);
            i.setImageResource(R.drawable.s);
        }
        else if(a==4)
        {
            // Toast.makeText(this,"Hey Man ! Ur all answers are correct and Ur score: "+a,Toast.LENGTH_LONG).show();
            t.setText("Hey Man !Your some answers are correct and your score is : "+a);
            //rawable d=getResources().getDrawable(R.drawable.pic);// etImageResource(R.drawable.pic2)// ;
            i.setImageResource(R.drawable.ss);    }
        else if(a==3)
        {
            // Toast.makeText(this,"Hey Man ! Ur all answers are correct and Ur score: "+a,Toast.LENGTH_LONG).show();
            t.setText("Hey Man !Your some answers are correct and your score is : "+a);
            i.setImageResource(R.drawable.sss);
        }
        else if(a==2)
        {
            //Toast.makeText(this,"Hey Man ! Ur all answers are correct and Ur score: "+a,Toast.LENGTH_LONG).show();
            t.setText("Hey Man !Your some answers are correct and your score is : "+a);
            i.setImageResource(R.drawable.ssss);     }
        else if(a==1)
        {
            // Toast.makeText(this,"Hey Man ! Ur all answers are correct and Ur score: "+a,Toast.LENGTH_LONG).show();
            t.setText("Hey Man ! Your only one answer is correct and Yourr score is: "+a);
            i.setImageResource(R.drawable.sssss);      }
        else if(a==0)
        {
            //Toast.makeText(this,"Chutiya sala .. Ur score is: "+a,Toast.LENGTH_LONG).show();
            t.setText("Chutiya sala .. Your score is: "+a);
            i.setImageResource(R.drawable.download);    }

    }

}
