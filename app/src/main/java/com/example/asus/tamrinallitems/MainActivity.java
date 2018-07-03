package com.example.asus.tamrinallitems;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextView tvresult;
    EditText fname, lname, pass, email, number;
    CheckBox shownumber;
    Switch showemail;
    RadioButton male, female;
    Button showinfo;
    ToggleButton beprivate;
    RatingBar rate;
    String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname = (EditText) findViewById(R.id.editTextFirstname);
        lname = (EditText) findViewById(R.id.editTextLastname);
        pass = (EditText) findViewById(R.id.passwordPass);
        email = (EditText) findViewById(R.id.editTextEmail);
        number = (EditText) findViewById(R.id.editTextNu);
        shownumber = (CheckBox) findViewById(R.id.checkBox);
        showemail = (Switch) findViewById(R.id.Switch);
        male = (RadioButton) findViewById(R.id.radioButtonMale);
        female = (RadioButton) findViewById(R.id.radioButtonFemale);
        showinfo = (Button) findViewById(R.id.button);
        beprivate = (ToggleButton) findViewById(R.id.toggleButton);
        rate = (RatingBar) findViewById(R.id.ratingBar);
        tvresult = (TextView) findViewById(R.id.textViewResult);





        showinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (male.isChecked()){
                    gender = "Mr ";
                }else if (female.isChecked()){
                    gender = "Mrs ";
                }else{
                    gender = "Mr/Mrs";
                }

                    tvresult.setText(gender + fname.getText() + " " + lname.getText() + "\n");
                if (shownumber.isChecked()){
                    tvresult.append(number.getText() + "\n");
                }
                if (showemail.isChecked()) {
                    tvresult.append(email.getText() + "\n");
                }
            }
        });


    }
}
