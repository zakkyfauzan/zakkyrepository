package com.example.zakky.mohammadzakkyfauzan_1202150099_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView porsi, tempat, menu, harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        String tempatMakan = intent.getStringExtra("tempat");
        String menuMakan = intent.getStringExtra("menu");
        String jumlahPorsi = intent.getStringExtra("jumlah");
        String HasilHarga = intent.getStringExtra("Harga");

        int TotalHarga = Integer.valueOf(HasilHarga) * Integer.valueOf(jumlahPorsi);

        tempat = (TextView) findViewById(R.id.tvTempat);
        tempat.setText(tempatMakan);

        menu = (TextView) findViewById(R.id.tvMenuNasi);
        menu.setText(menuMakan);

        porsi = (TextView) findViewById(R.id.tvJumlah);
        porsi.setText(jumlahPorsi);

        harga = (TextView) findViewById(R.id.tvJumlahHarga);
        harga.setText(String.valueOf(TotalHarga));

        if (TotalHarga > 65000) {
            Toast toast1 = Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG);
            toast1.show();
        } else {
            Toast toast1 = Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG);
            toast1.show();
        }
    }
}
