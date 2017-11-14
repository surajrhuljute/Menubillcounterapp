package com.project.surajhuljute.menucounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int total=0;
    int intedchk1,intedchk2,intedchk3,intedchk4,intedchk5;
CheckBox chk1,chk2,chk3,chk4,chk5;
    TextView t1;
    EditText edchk1,edchk2,edchk3,edchk4,edchk5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chk1=(CheckBox)findViewById(R.id.chk1);
        chk2=(CheckBox)findViewById(R.id.chk2);
        chk3=(CheckBox)findViewById(R.id.chk3);
        chk4=(CheckBox)findViewById(R.id.chk4);
        chk5=(CheckBox)findViewById(R.id.chk5);

        edchk1=(EditText)findViewById(R.id.edchk1);
        edchk2=(EditText)findViewById(R.id.edchk2);
        edchk3=(EditText)findViewById(R.id.edchk3);
        edchk4=(EditText)findViewById(R.id.edchk4);
        edchk5=(EditText)findViewById(R.id.edchk5);

        t1=(TextView)findViewById(R.id.txtbill);

    }
    public void billCount(View view){


        if(chk1.isChecked())
        {  String e1=edchk1.getText().toString();
            intedchk1=Integer.parseInt(e1);
            total=total+250*intedchk1;
        }
         if(chk2.isChecked())
        {  String e2=edchk2.getText().toString();
            intedchk2=Integer.parseInt(e2);
            total=total+100*intedchk2;
        }
         if(chk3.isChecked())
        {  String e3=edchk3.getText().toString();
            intedchk3=Integer.parseInt(e3);
            total=total+150*intedchk3;
        }
        if(chk4.isChecked())
        {  String e4=edchk4.getText().toString();
            intedchk4=Integer.parseInt(e4);
            total=total+75*intedchk4;
        }
         if(chk5.isChecked())
        {  String e5=edchk5.getText().toString();
            intedchk5=Integer.parseInt(e5);
            total=total+80*intedchk5;
        }
       // else{
         //   Toast.makeText(this,"Please select your items",Toast.LENGTH_LONG).show();
      //  }
        String total1=String.valueOf(total);
        Toast.makeText(this,"Your Bill"+total,Toast.LENGTH_SHORT).show();
        t1.setText(total1);
        total=0;

    }
}
