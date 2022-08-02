package com.example.listviewsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.listviewsederhana.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final String[] namaNegara = new String[] { "Indonesia", "Malaysia", "Singapore", "Italia", "Inggris", "Belanda", "Argentina", "China", "Mesir", "Uganda" };
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.adapter_negara, R.id.negara, namaNegara);
        binding.listNegara.setAdapter(adapter);
        binding.listNegara.setOnItemClickListener((parent, view, position, id) -> Toast.makeText(this, "Memilih : " + namaNegara[position], Toast.LENGTH_SHORT).show());
    }
}