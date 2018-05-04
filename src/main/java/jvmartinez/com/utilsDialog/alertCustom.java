package jvmartinez.com.utilsDialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import jvmartinez.com.utilsDialog.Emun.TypeIco;
import jvmartinez.com.utilsDialog.Utils.Style;

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
    private LinearLayout containerBody;
    private LinearLayout containerTitle;
    private LinearLayout containerContents;
    private Button  btnOk;
    private Button  btnCancel;
    private Style style;

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

    public  alertCustom(AppCompatActivity activity, String title, String message, View.OnClickListener listenerOk,TypeIco typeIco,Style style){
        this.activity = activity;
        this.title = title;
        this.message = message;
        this.onClickListenerOk = listenerOk;
        this.typeIco = typeIco;
        this.typeDialog = 1;
        this.style = style;
    }

    public alertCustom(AppCompatActivity activity, String title, String message, View.OnClickListener listenerOk, View.OnClickListener listenerCancel, TypeIco typeIco,Style style){
        this.activity = activity;
        this.title = title;
        this.message = message;
        this.onClickListenerOk = listenerOk;
        this.onClickListenerCancel = listenerCancel;
        this.typeIco = typeIco;
        this.typeDialog = 0;
        this.style = style;
    }
    public void openDialogo () {
        DialogFragment newFragment = alertCustom.this;
        newFragment.show(this.activity.getSupportFragmentManager(), "");
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view;
        if(style.getLayoutWindows()!= 0){
            view = inflater.inflate(R.layout.custom_alert_style_2, null);
        }else{
            if(typeDialog==1){
                view = inflater.inflate(R.layout.custom_alert_one_button, null);
            }else{
                view = inflater.inflate(R.layout.custom_alert, null);
            }

        }

        this.containerBody = (LinearLayout) view.findViewById(R.id.containerBody);
        this.containerContents = (LinearLayout) view.findViewById(R.id.containerContents);
        this.containerTitle = (LinearLayout) view.findViewById(R.id.containerTitle);
        this.ico_alert = (ImageView) view.findViewById(R.id.image_ico_alert);
        this.lbl_message = (TextView) view.findViewById(R.id.lbl_message);
        this.lbl_title = (TextView) view.findViewById(R.id.lbl_title);
        this.lbl_title.setText(this.title);
        this.lbl_message.setText(this.message);
        this.btnOk = (Button) view.findViewById(R.id.buttonOK);
        this.btnCancel = (Button) view.findViewById(R.id.buttonCancel);

        builder.setView(view);
        this.setIcoNotification(this.typeIco);

        this.btnOk.setOnClickListener(this.onClickListenerOk);
        this.btnCancel.setOnClickListener(this.onClickListenerCancel);
        this.UpdateStyle();
        return builder.create();
    }

    @Nullable
    private void UpdateStyle(){
        if(this.style != null) {
            if(this.style.getBackgroundBody()>0){
                this.containerBody.setBackgroundColor(
                        activity.getResources().getColor(this.style.getBackgroundBody())
                );
            }else{
                this.containerBody.setBackgroundColor(
                        getContext().getResources().getColor(R.color.colorBodyBackground)
                );
            }
            if(this.style.getBackgroundContents()>0) {
                this.containerContents.setBackgroundColor(
                        activity.getResources().getColor(this.style.getBackgroundContents())
                );
            }else{
                this.containerContents.setBackgroundColor(
                        getContext().getResources().getColor(R.color.colorContentsBackground)
                );
            }
            if(this.style.getBackgroundTitle() > 0){
                this.containerTitle.setBackgroundColor(
                        activity.getResources().getColor(this.style.getBackgroundTitle())
                );
            }else{
                this.containerTitle.setBackgroundColor(
                        getContext().getResources().getColor(R.color.colorTitleBackground)
                );
            }
            if(this.style.getBtnOkColor()>0){
                this.btnOk.setBackgroundColor(
                        activity.getResources().getColor(this.style.getBtnOkColor())
                );
            }else{
                this.btnOk.setBackgroundColor(
                        getContext().getResources().getColor(R.color.colorButtonBackground)
                );
            }
            if(this.style.getBtnCancelColor()>0){
                this.btnCancel.setBackgroundColor(
                        activity.getResources().getColor(this.style.getBtnCancelColor())
                );
            }else{
                this.btnCancel.setBackgroundColor(
                        getContext().getResources().getColor(R.color.colorButtonBackground)
                );
            }
            if(this.style.getTextTitle()>0){
                this.lbl_title.setTextColor(
                        activity.getResources().getColor(this.style.getTextTitle())
                );
            }else{
                this.lbl_title.setTextColor(
                        getContext().getResources().getColor(R.color.colorTitleText)
                );
            }
            if(this.style.getTextBody()>0){
                this.lbl_message.setTextColor(
                        activity.getResources().getColor(this.style.getTextBody())
                );
            }else{
                this.lbl_message.setTextColor(
                        getContext().getResources().getColor(R.color.colorTextBody)
                );
            }
            if(this.style.getTextColorButton()>0){
                this.btnOk.setTextColor(
                        activity.getResources().getColor(this.style.getTextColorButton())
                );
                this.btnCancel.setTextColor(
                        activity.getResources().getColor(this.style.getTextColorButton())
                );
            }else{
                this.btnCancel.setTextColor(
                        getContext().getResources().getColor(R.color.colorTextBody)
                );
                this.btnOk.setTextColor(
                        getContext().getResources().getColor(R.color.colorTextBody)
                );
            }
        }
    }

    private void setIcoNotification(TypeIco typeIco){
        switch (typeIco.getTypeico()){
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
    }

    private int setLayout(){
        return R.layout.custom_alert;
    }
}
