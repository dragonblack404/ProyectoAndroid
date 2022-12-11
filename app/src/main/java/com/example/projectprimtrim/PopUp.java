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
        builder.setTitle("Acerca de")
                .setMessage("Esta aplicación ha sido creada en Android Studio programando en Java y su autor es Dónovan Castro Fariña estudiante de 2º de DAM.")
                .setPositiveButton("Aceptar", (d, i) -> {});
        return builder.create();
    }
}
