package com.example.projectprimtrim;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class FormularioActivity extends AppCompatActivity {

    private String name, email, asunto, mensaje;
    private boolean val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }

    @Override
    protected void onResume() {
        super.onResume();

        EditText nameField = (EditText) findViewById(R.id.EditTextName);
        name = nameField.getText().toString();

        EditText emailField = (EditText) findViewById(R.id.EditTextEmail);
        email = emailField.getText().toString();

        EditText asuntoField = (EditText) findViewById(R.id.EditTextAsunto);
        asunto = asuntoField.getText().toString();

        EditText mensajeField = (EditText) findViewById(R.id.EditTextMensaje);
        mensaje = mensajeField.getText().toString();

        ImageButton enviarButton = findViewById(R.id.enviarButton);
        CheckBox terminosCheck = findViewById(R.id.checkForm);

        enviarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fullFormmulario() && terminosCheck.isChecked()){
                    PopUp pop = new PopUp();
                    pop.todoCorrecto(true);
                    pop.show(getSupportFragmentManager(),"");
                }else {
                    PopUp pop = new PopUp();
                    pop.todoCorrecto(false);
                    pop.show(getSupportFragmentManager(),"");
                }

            }
        });

    }

    private Boolean fullFormmulario() {
        Boolean validador = false;
        if (name.length() != 0 && email.length() != 0 && asunto.length() != 0 && mensaje.length() != 0)
            validador = true;
        return validador;
    }

    ;

    /*
            Barra menu con el icono para volver al inicio
            */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.items_menu, menu);
        return true;
    }

    /*
    solo tenemos un icono de menu, con lo cual el método se queda muy corto con respecto
    al princpial
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent cambiarActividad;
        cambiarActividad = new Intent(this, MainActivity.class);
        switch (item.getItemId()) {
            case R.id.homeItem:
                startActivity(cambiarActividad);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

