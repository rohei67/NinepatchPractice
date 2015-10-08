package com.example.and0701.ninepatchpractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity  {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void buttonClick(View v) {
		Animation anim = AnimationUtils.loadAnimation(this, R.anim.my_anim);
		v.startAnimation(anim);
	}
}
