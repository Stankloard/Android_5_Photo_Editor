package com.stankloardindustries.photoeditor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.stankloardindustries.photoeditor.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {

    ActivityResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.Image.setImageURI(getIntent().getData());
    }
}