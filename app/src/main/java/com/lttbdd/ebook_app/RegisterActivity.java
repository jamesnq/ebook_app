package com.lttbdd.ebook_app;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    private EditText edusername,edpassword;
    private Button btnregister1;
    private FirebaseAuth Auth;
    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Auth=FirebaseAuth.getInstance();

        edusername=(EditText) findViewById(R.id.username);
        edpassword=(EditText) findViewById(R.id.password);
        btnregister1=(Button) findViewById(R.id.register);

       btnregister1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               register2();
           }
       });
    }

    private void register2() {
        String emailedit,passedit;
        emailedit=edusername.getText().toString();
        passedit=edpassword.getText().toString();
        if (TextUtils.isEmpty(emailedit)){
            Toast.makeText(this,"Vui long nhap email",Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(passedit)){
            Toast.makeText(this,"Vui long nhap pass",Toast.LENGTH_LONG).show();
            return;
        }
        Auth.createUserWithEmailAndPassword(emailedit,passedit).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(getApplicationContext(),"Dang ky thanh cong",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(RegisterActivity.this,MainActivity.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Dang ky that bai",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
