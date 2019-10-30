package co.com.k4soft.verificacinred.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import co.com.k4soft.verificacinred.R;

public class Dialog {


    public static void offlineToast(final Activity activity){
        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup) activity.findViewById(R.id.toast_layout_root));
        ImageView image = layout.findViewById(R.id.image);
        image.setImageResource(R.drawable.ic_signal_wifi_off_black_24dp);
        TextView text =  layout.findViewById(R.id.text);
        text.setText(activity.getString(R.string.working_offline));
        Toast toast = new Toast(activity);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }


    public static void okToast(final Activity activity){
        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup) activity.findViewById(R.id.toast_layout_root));
        ImageView image = layout.findViewById(R.id.image);
        image.setImageResource(R.drawable.ic_check_black_24dp);
        TextView text =  layout.findViewById(R.id.text);
        text.setText(activity.getString(R.string.connected_successful));
        Toast toast = new Toast(activity);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }


    public static void offLineDialog(final Activity activity) {
        AlertDialog alertDialog = new AlertDialog.Builder(activity).create();
        alertDialog.setTitle(activity.getString(R.string.message_alert));
        alertDialog.setMessage(activity.getString(R.string.export_error));
        alertDialog.setIcon(R.drawable.ic_signal_wifi_off_black_24dp);
        alertDialog.setCancelable(false);
        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, activity.getString(R.string.value_button_close),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }



}
