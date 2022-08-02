package com.example.aplikasikalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etAngkaPertama;
    EditText etAngkaKedua;
    Button btnTambah;
    Button btnKurang;
    Button btnKali;
    Button btnBagi;
    Button btnBersihkan;
    TextView tvHasil;

    Double angkaPertama;
    Double angkaKedua;
    Double hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAngkaPertama = findViewById(R.id.et_angka_pertama);
        etAngkaKedua = findViewById(R.id.et_angka_kedua);
        btnTambah = findViewById(R.id.btn_tambah);
        btnKurang = findViewById(R.id.btn_kurang);
        btnKali = findViewById(R.id.btn_kali);
        btnBagi = findViewById(R.id.btn_bagi);
        btnBersihkan = findViewById(R.id.btn_bersihkan);
        tvHasil = findViewById(R.id.tv_hasil);

        btnTambah.setOnClickListener(this);
        btnKurang.setOnClickListener(this);
        btnKali.setOnClickListener(this);
        btnBagi.setOnClickListener(this);
        btnBersihkan.setOnClickListener(this);

    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_tambah:
                if (etAngkaPertama.getText().toString().length() != 0 && etAngkaPertama.getText().toString().length() != 0) {
                    angkaPertama = Double.valueOf(etAngkaPertama.getText().toString());
                    angkaKedua = Double.valueOf(etAngkaKedua.getText().toString());

                    hasil = angkaPertama + angkaKedua;
                    tvHasil.setText(hasil.toString());
                } else {
                    Toast.makeText(this, "Mohon masukkan Angka Pertama & Kedua", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn_kurang:
                if (etAngkaPertama.getText().toString().length() != 0 && etAngkaPertama.getText().toString().length() != 0) {
                    angkaPertama = Double.valueOf(etAngkaPertama.getText().toString());
                    angkaKedua = Double.valueOf(etAngkaKedua.getText().toString());

                    hasil = angkaPertama - angkaKedua;
                    tvHasil.setText(hasil.toString());
                } else {
                    Toast.makeText(this, "Mohon masukkan Angka Pertama & Kedua", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn_kali:
                if (etAngkaPertama.getText().toString().length() != 0 && etAngkaPertama.getText().toString().length() != 0) {
                    angkaPertama = Double.valueOf(etAngkaPertama.getText().toString());
                    angkaKedua = Double.valueOf(etAngkaKedua.getText().toString());

                    hasil = angkaPertama * angkaKedua;
                    tvHasil.setText(hasil.toString());
                } else {
                    Toast.makeText(this, "Mohon masukkan Angka Pertama & Kedua", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn_bagi:
                if (etAngkaPertama.getText().toString().length() != 0 && etAngkaPertama.getText().toString().length() != 0) {
                    angkaPertama = Double.valueOf(etAngkaPertama.getText().toString());
                    angkaKedua = Double.valueOf(etAngkaKedua.getText().toString());

                    hasil = angkaPertama / angkaKedua;
                    tvHasil.setText(hasil.toString());
                } else {
                    Toast.makeText(this, "Mohon masukkan Angka Pertama & Kedua", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn_bersihkan:
                tvHasil.setText("0");
                break;
        }
    }
}