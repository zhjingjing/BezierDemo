package com.zh.besseldemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zh.besseldemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil. setContentView(this,R.layout.activity_main);
        binding.setPresenter(this);
    }



    public void onSecondBesselClicked(){
        SecondActivity.launch(this);
    }

    public void onThirdBesselClicked(){
        ThirdActivity.launch(this);
    }

    public void onWaveViewClicked(){
        WaveActivity.launch(this);
    }

}
