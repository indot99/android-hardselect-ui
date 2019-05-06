package org.richcode.hardselect;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText EditId;
    EditText EditPw;
    EditText EditPwCheck;
    EditText EditEmailId;
    EditText EditEmailaddress;
    EditText EditNickName;

    Button RegisterButton;
    Button PrivacyButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditId = (EditText)findViewById(R.id.edit_register_id);
        EditPw = (EditText)findViewById(R.id.edit_register_pw);
        EditPwCheck = (EditText)findViewById(R.id.edit_register_pwcheck);
        EditEmailId = (EditText)findViewById(R.id.edit_register_email_id);
        EditEmailaddress = (EditText)findViewById(R.id.edit_register_email_address);
        EditNickName = (EditText)findViewById(R.id.edit_register_nickname);

        RegisterButton = (Button)findViewById(R.id.button_register_complete);
        PrivacyButton = (Button)findViewById(R.id.button_register_privacy);

        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        PrivacyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://syard.co.kr/index.php/hardselect/user_protocol"));
                startActivity(intent);
            }
        });

    }
}
