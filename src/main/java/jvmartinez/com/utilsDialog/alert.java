package jvmartinez.com.utilsDialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by Juan Martinez on 21/09/17.
 */

public class alert {
    public static void alert(String title, String message, Context context){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
        alertDialog.setTitle(title);
        alertDialog.setMessage(message);
        alertDialog.setNeutralButton(context.getText(R.string.btn_ok), null);
        alertDialog.show();
    }

    public static void alert(String title, String message, DialogInterface.OnClickListener listenerOk, Context context){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
        alertDialog.setTitle(title);
        alertDialog.setMessage(message);
        alertDialog.setPositiveButton(context.getText(R.string.btn_ok),listenerOk);
        alertDialog.show();
    }

    public static void alert(String title, String message, DialogInterface.OnClickListener listenerOk,DialogInterface.OnClickListener listenerCancel, Context context){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
        alertDialog.setTitle(title);
        alertDialog.setMessage(message);
        alertDialog.setPositiveButton(context.getText(R.string.btn_ok),listenerOk);
        alertDialog.setNegativeButton(context.getText(R.string.btn_cancel),listenerCancel);
        alertDialog.show();
    }
}
