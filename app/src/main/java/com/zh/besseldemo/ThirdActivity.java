package com.zh.besseldemo;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zh.besseldemo.databinding.ActivityThirdBinding;
import com.zh.besseldemo.view.ThirdBesselView;

public class ThirdActivity extends AppCompatActivity {

    private ActivityThirdBinding binding;
    public static void launch(Context context){
        context.startActivity(new Intent(context, ThirdActivity.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil. setContentView(this,R.layout.activity_third);
        binding.setPresenter(this);
    }


    public void onChangeModeOneClicked(){
        binding.besselView.setMode(0);
    }

    public void onChangeModeTwoClicked(){
        binding.besselView.setMode(1);
    }

}
