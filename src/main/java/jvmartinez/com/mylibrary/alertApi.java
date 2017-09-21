package jvmartinez.com.mylibrary;

import android.app.AlertDialog;
import android.content.Context;

/**
 * Created by Juan Martinez on 21/09/17.
 */

public class alertApi {

    public void alert(String title, String message, Context context){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
        alertDialog.setTitle(title);
        alertDialog.setMessage(message);
        alertDialog.setNeutralButton(context.getText(R.string.btn_ok), null);
        alertDialog.show();
    }
}
