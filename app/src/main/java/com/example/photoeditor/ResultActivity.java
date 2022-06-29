package com.example.photoeditor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.photoeditor.databinding.ActivityMainBinding;

public class ResultActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}