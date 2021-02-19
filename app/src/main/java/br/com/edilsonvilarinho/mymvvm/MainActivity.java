package br.com.edilsonvilarinho.mymvvm;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import br.com.edilsonvilarinho.mymvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding bind;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        mainViewModel.getCont().observe(this, integer -> bind.tvCont.setText(String.valueOf(integer)));
        bind.btAdd.setOnClickListener(v -> {
            mainViewModel.add();
        });

    }
}