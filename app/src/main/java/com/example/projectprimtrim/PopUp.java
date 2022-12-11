package com.example.projectprimtrim;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class PopUp extends AppCompatDialogFragment {


    /*
    PopUp de la info de la app
     */
    @Nullable
    @Override
    public android.app.Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Acerca de..")
                .setMessage("Esta aplicación ha sido creada en Android Studio programando en Java cómo proyecto final del primer trimestre de PGL.")
                .setPositiveButton("Aceptar", (d, i) -> {});
        return builder.create();
    }

    //TODO
/*
    public void todoCorrecto(Boolean validador){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        if (validador){
            builder.setTitle("Enviado con éxito")
                    .setMessage("Todos los campos estaban rellenos correctamente")
                    .setPositiveButton("Continuar", (dialogInterface, i) -> {});
        }else {
            builder.setTitle("Envío fracasado")
                    .setMessage("Algún campo no se rellenó correctamente")
                    .setPositiveButton("Volver", (dialogInterface, i) -> {});
        }
        builder.create();
    }

 */

}
