package com.example.crud;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;

public class OnLongClickListenerStudentRecord implements View.OnLongClickListener {
    Context context;
    String id;
    @Override
    public boolean onLongClick(View view) {
        context = view.getContext();
        id = view.getTag().toString();
        final CharSequence[] items = { "Edit", "Delete" };
        new AlertDialog.Builder(context).setTitle("Student Record")
                .setItems(items, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {
                        dialog.dismiss();
                    }
                }).show();
        return false;
    }
}