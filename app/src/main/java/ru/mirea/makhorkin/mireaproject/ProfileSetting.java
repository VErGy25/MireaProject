package ru.mirea.makhorkin.mireaproject;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class ProfileSetting extends AppCompatActivity {
    private final String TAG = getClass().getSimpleName();
    String name;
    String mail;
    String number;

    public ProfileSetting(){
        super(R.layout.activity_profile);
    }
    SharedPreferences sharedPref;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Button btn_save = findViewById(R.id.buttonSave);
        EditText edit_name = findViewById(R.id.editTextName);
        EditText edit_number = findViewById(R.id.editTextPhone);
        EditText edit_Mail = findViewById(R.id.editTextMail);

        sharedPref = getSharedPreferences("MIREA_settings", Context.MODE_PRIVATE);

        edit_name.setText(sharedPref.getString("NAME", "Имя"));
        edit_number.setText(sharedPref.getString("MAIL", "Почта"));
        edit_Mail.setText(sharedPref.getString("NUMBER", "Номер"));

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPref = getSharedPreferences("MIREA_settings", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPref.edit();

                name = edit_name.getText().toString();
                number = edit_number.getText().toString();
                mail = edit_Mail.getText().toString();

                editor.putString("NAME", String.valueOf(name));
                editor.putString("MAIL", String.valueOf(number));
                editor.putString("NUMBER", String.valueOf(mail));

                editor.apply();

                Log.d(TAG, sharedPref.getString("NAME", "no inf"));
                Log.d(TAG, sharedPref.getString("MAIL", "no inf"));
                Log.d(TAG, sharedPref.getString("NUMBER", "no inf"));
            }
        });
    }
}
