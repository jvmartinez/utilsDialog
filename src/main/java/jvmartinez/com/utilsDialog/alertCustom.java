package jvmartinez.com.utilsDialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import jvmartinez.com.utilsDialog.Emun.TypeIco;

/**
 * Created by Juan Martinez on 23/09/17.
 */

@SuppressLint("ValidFragment")
public class alertCustom extends DialogFragment {
    private AppCompatActivity activity;
    private String title;
    private String message;
    private View.OnClickListener onClickListenerOk;
    private View.OnClickListener onClickListenerCancel;
    private TextView lbl_message;
    private TextView lbl_title;
    private ImageView ico_alert;
    private TypeIco typeIco;
    private int  typeDialog;

    public alertCustom(AppCompatActivity activity, String title, String message, View.OnClickListener listenerOk, View.OnClickListener listenerCancel, TypeIco typeIco){
        this.activity = activity;
        this.title = title;
        this.message = message;
        this.onClickListenerOk = listenerOk;
        this.onClickListenerCancel = listenerCancel;
        this.typeIco = typeIco;
        this.typeDialog = 0;
    }

    public  alertCustom(AppCompatActivity activity, String title, String message, View.OnClickListener listenerOk,TypeIco typeIco){
        this.activity = activity;
        this.title = title;
        this.message = message;
        this.onClickListenerOk = listenerOk;
        this.typeIco = typeIco;
        this.typeDialog = 1;
    }

    public void openDialogo () {
        DialogFragment newFragment = alertCustom.this;
        newFragment.show(this.activity.getSupportFragmentManager(), "");
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view=inflater.inflate(R.layout.custom_alert, null);
        this.ico_alert = (ImageView) view.findViewById(R.id.image_ico_alert);
        this.lbl_message = (TextView) view.findViewById(R.id.lbl_message);
        this.lbl_title = (TextView) view.findViewById(R.id.lbl_title);
        this.lbl_title.setText(this.title);
        this.lbl_message.setText(this.message);
        builder.setView(view);
        Button botonOk = (Button) view.findViewById(R.id.buttonOK);
        Button botonCancel = (Button) view.findViewById(R.id.buttonCancel);
        switch (this.typeIco.getTypeico()){
            case 4:{
                this.ico_alert.setImageResource(R.drawable.forbidden);
                break;
            }
            case 1:{
                this.ico_alert.setImageResource(R.drawable.success);
                break;
            }
            case 2:{
                this.ico_alert.setImageResource(R.drawable.warning);
                break;
            }
            case 3:{
                this.ico_alert.setImageResource(R.drawable.minus);
                break;
            }
        }
        if(typeDialog==1){
            botonCancel.setVisibility(View.GONE);
        }
        botonOk.setOnClickListener(this.onClickListenerOk);
        botonCancel.setOnClickListener(this.onClickListenerCancel);
        return builder.create();
    }
}
