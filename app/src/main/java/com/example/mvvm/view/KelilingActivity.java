package com.example.mvvm.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import com.example.mvvm.R;
import com.example.mvvm.databinding.ActivityKelilingBinding;
import com.example.mvvm.utils.view;
import com.example.mvvm.viewmodel.MainViewModel;

public class KelilingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityKelilingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_keliling);
        MainViewModel mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        binding.setViewmodel(mainViewModel);
        binding.setLifecycleOwner(this);

        mainViewModel.getSegitiga().observe(this, segitiga->{
            if (segitiga.getHasil() != null) {
                view.toast(this, segitiga.getHasil().toString());
            }
        });
    }
}