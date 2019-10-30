package co.com.k4soft.verificacinred;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import co.com.k4soft.verificacinred.dialog.Dialog;
import co.com.k4soft.verificacinred.util.NetworkUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (NetworkUtil.checkInternetConnection(this)) {
            Dialog.okToast(this);
        } else {
            Dialog.offLineDialog(this);
        }

    }
}
