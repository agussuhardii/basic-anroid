package com.example.agussuhardi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnMin, btnPlus, btnOrder;
    TextView txtQty, txtTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMin = (Button) findViewById(R.id.btn_min);
        btnPlus = (Button) findViewById(R.id.btn_plus);
        btnOrder = (Button) findViewById(R.id.btn_order);

        txtQty = (TextView) findViewById(R.id.txt_ty);
        txtTotal = (TextView) findViewById(R.id.txt_total);
        // aksi untuk klick tombol plus
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtQty.setText(tambah());
            }
        });

        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtQty.setText(kurang());
            }
        });

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil();
            }
        });
    }

    //fungsi untuk tambah
    String tambah() {
        int nilai = Integer.parseInt(txtQty.getText().toString());//ubah ke angka
        int hasil = nilai + 1;
        return String.valueOf(hasil); //ubah ke text
    }

    String kurang() {
        int nilai = Integer.parseInt(txtQty.getText().toString());//ubah ke angka
        int hasil = 0;
        if(nilai<=0){
            Toast.makeText(this, "Disini pesan error", Toast.LENGTH_LONG).show();
        }else {
            hasil = nilai - 1;
        }
            return String.valueOf(hasil); //ubah ke text
    }


    void hasil(){
        int nilai  = Integer.parseInt(txtQty.getText().toString());
        int hasilOrder = nilai * 5;
        txtTotal.setText(String.valueOf(hasilOrder));
    }


}
