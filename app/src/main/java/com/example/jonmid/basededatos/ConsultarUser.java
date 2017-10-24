package com.example.jonmid.basededatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConsultarUser extends AppCompatActivity {



    TextView textViewname;
    TextView textViewtelefono;
    TextView textViewemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_user);



        textViewname = (TextView) findViewById(R.id.id_tv_name);
        textViewtelefono = (TextView) findViewById(R.id.id_tv_phone);
        textViewemail = (TextView) findViewById(R.id.id_tv_email);

        textViewname.setText("nombre");
        textViewtelefono.setText("telefono");
        textViewemail.setText("email");

    }

}
