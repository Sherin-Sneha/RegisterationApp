package com.am.licetregister;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner sp;
    ArrayList arrayList;
    ArrayAdapter arrayAdapter;
    Spinner sp1;
    ArrayList arrayList1;
    ArrayAdapter arrayAdapter1;
    CheckBox checkBox;
    RadioGroup radioGroup;
    Button button;
    Button button2;
    EditText eddob;
    String s1;
    String s2;
    String s3;
    String s4;
    String s5;
    String s6;
    String s7;
    String s8;
    String ss;
    String s;
    EditText name;
    EditText mail;
    EditText mobile;
    EditText blood;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=findViewById(R.id.spinner);
        sp1=findViewById(R.id.spinner2);
        checkBox=findViewById(R.id.checkBox);
        eddob= findViewById(R.id.editTextTextPersonName4);
        name=findViewById(R.id.editTextTextPersonName);
        mail=findViewById(R.id.editTextTextPersonName2);
        mobile=findViewById(R.id.editTextTextPersonName3);
        blood=findViewById(R.id.editTextTextPersonName5);
        button=findViewById(R.id.button2);
        button2=findViewById(R.id.button3);
        radioGroup=findViewById(R.id.radioGroup);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent np= new Intent(MainActivity.this,MainActivity3.class);
                startActivity(np);
            }
        });



        arrayList=new ArrayList();
        arrayList1=new ArrayList();

        arrayList.add("Select Year"); arrayList.add("1"); arrayList.add("2"); arrayList.add("3"); arrayList.add("4");
        arrayList1.add("Select Dept"); arrayList1.add("IT"); arrayList1.add("EEE"); arrayList1.add("ECE"); arrayList1.add("MECH");

        arrayAdapter=
                new ArrayAdapter(MainActivity.this,
                        android.R.layout.simple_list_item_1,arrayList);
        sp.setAdapter(arrayAdapter);
        arrayAdapter1=
                new ArrayAdapter(MainActivity.this,
                        android.R.layout.simple_list_item_1,arrayList1);
        sp1.setAdapter(arrayAdapter1);


    }

    public void dat(View view) {
        DatePickerDialog datePickerDialog  = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                eddob.setText(i+"/"+i1+"/"+i2);
                eddob.setEnabled(false);
            }
        }, 1995, 0, 1);
        datePickerDialog.show();
    }

    public void sub(View view){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1= name.getText().toString();
                s2= mail.getText().toString();
                s3= mobile.getText().toString();
                s5= eddob.getText().toString();
                s7= blood.getText().toString();

                int r= radioGroup.getCheckedRadioButtonId();
                switch (r){
                    case R.id.radioButton:
                        ss="Male";
                        break;

                    case R.id.radioButton2:
                        ss="Female";
                        break;
                }
                s="Your gender:"+ ss;
                boolean check= checkBox.isChecked();
                if(check){
                    Intent np =new Intent(MainActivity.this,MainActivity2.class);
                    np.putExtra("xyz",s1);
                    np.putExtra("abc",s2);
                    np.putExtra("pqr",s3);
                    np.putExtra("ab",s5);
                    np.putExtra("x",s7);
                    np.putExtra("a",s8);
                    startActivity(np);
                }
                else{
                    final MediaPlayer mp =MediaPlayer.create(MainActivity.this,R.raw.abc);
                    mp.start();
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Alert!")
                            .setMessage("Agree the Terms & Conditions")
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    Intent obj = new Intent(MainActivity.this,MainActivity.class);
                                    startActivity(obj);
                                }
                            })
                            .show();
                }

            }
        });





    }


}