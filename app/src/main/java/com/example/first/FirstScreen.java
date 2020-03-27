package com.example.first;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class FirstScreen extends AppCompatActivity {

    EditText input_username, input_matkhau;
    Button button_dangnhap, button_dangki, button_Quenmatkhau,button_thoat;
    String ten,sdt,dc,email,mk,nhaplaimk,cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        Anhxa();
        ControlButton();
    }

    private void ControlButton() {
        button_thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(FirstScreen.this, android.R.style.Theme_DeviceDefault_Light_Dialog);
                builder.setTitle("Bạn có chắc muốn thoát khỏi app");
                builder.setMessage("Hãy lựa chọn bên dưới để xác nhận");
                builder.setIcon(android.R.drawable.ic_dialog_alert);
                builder.setPositiveButton("Có", new  DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        onBackPressed();
                    }
                });
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.show();
            }
        });
        button_dangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               final Dialog dialog = new Dialog(FirstScreen.this);
               dialog.setCancelable(false);
               dialog.setContentView(R.layout.activity_register);
               final EditText input_fullName = (EditText)dialog.findViewById(R.id.input_fullName);
               final EditText inputMobile = (EditText)dialog.findViewById(R.id.inputMobile);
               final EditText inputAddress = (EditText)dialog.findViewById(R.id.inputAddress);
               final EditText input_userEmail = (EditText)dialog.findViewById(R.id.input_userEmail);
               final EditText input_password = (EditText)dialog.findViewById(R.id.input_password);
               final EditText input_password_confirm = (EditText)dialog.findViewById(R.id.input_password_confirm);
               Button button_register = (Button)dialog.findViewById(R.id.button_register);
               Button button_Huy = (Button)dialog.findViewById(R.id.button_huy);
               final CheckBox checkbox = (CheckBox)dialog.findViewById(R.id.checkbox);



               button_register.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                      /* ten = input_fullName.getText().toString().trim();
                       sdt = inputMobile.getText().toString().trim();
                       dc  = inputAddress.getText().toString().trim();
                       email = input_userEmail.getText().toString().trim();
                       mk = input_password.getText().toString().trim();
                       nhaplaimk = input_password_confirm.getText().toString().trim();
                       cb= checkbox.getText().toString().trim();


                       input_username.setText(ten);
                       input_username.setText(sdt);
                       input_username.setText(email);
                       input_username.setText(mk);
                       input_username.setText(nhaplaimk);
                       input_username.setText(cb);

                       input_matkhau.setText(ten);
                       input_matkhau.setText(sdt);
                       input_matkhau.setText(email);
                       input_matkhau.setText(mk);
                       input_matkhau.setText(nhaplaimk);
                       input_matkhau.setText(cb);

*/
                       dialog.cancel();

                   }
               });
               button_Huy.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       dialog.cancel();
                   }
               });
               dialog.show();



            }
        });
    }

    private void Anhxa() {

        input_username = (EditText) findViewById(R.id.input_username);
        input_matkhau= (EditText) findViewById(R.id.input_matkhau);
        button_dangnhap = (Button) findViewById(R.id.button_dangnhap);
        button_dangki = (Button) findViewById(R.id.button_dangki);
        button_Quenmatkhau = (Button) findViewById(R.id.button_Quenmatkhau);
        button_thoat = (Button) findViewById(R.id.button_thoat);
    }
}


