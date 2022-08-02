package com.example.aplikasiinputsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.aplikasiinputsederhana.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        binding.btnTampil.setOnClickListener(s -> binding.tvNama.setText("Nama Anda: " + binding.inputNama.getText().toString()));
    }
}