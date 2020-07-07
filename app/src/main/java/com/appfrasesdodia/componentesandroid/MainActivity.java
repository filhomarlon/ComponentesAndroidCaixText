package com.appfrasesdodia.componentesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private EditText campoEmail;
    private TextView textResultado;
    private TextView textoResultemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textResultado = findViewById(R.id.textResultado);
        textoResultemail = findViewById(R.id.textEmail);

    }


    public void enviar(View view){

        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        textResultado.setText(nome);
        textoResultemail.setText(email);

    }

    public void limpar(View view){
        campoEmail.setText("");
        campoNome.setText("");
        textResultado.setText("Digite Novamente");
        textoResultemail.setText("Digite Novamente");
    }
}
