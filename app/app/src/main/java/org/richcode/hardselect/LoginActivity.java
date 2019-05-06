package org.richcode.hardselect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText EditId;
    EditText EditPassword;

    Button ButtonLogin;
    Button ButtonRegister;
    Button ButtonFindId;
    Button ButtonGuestLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButtonLogin = (Button)findViewById(R.id.button_login);
        ButtonRegister = (Button)findViewById(R.id.button_register);
        ButtonFindId = (Button)findViewById(R.id.button_find_id);
        ButtonGuestLogin = (Button)findViewById(R.id.button_guest_login);

        EditId = (EditText)findViewById(R.id.edit_id);
        EditPassword = (EditText)findViewById(R.id.edit_password);

        ButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        ButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(intent);
            }
        });

    }
}
