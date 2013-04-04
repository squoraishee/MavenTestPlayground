package com.example.maventestplayground;


import com.example.mavetestplayround.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MavenTestProjectActvitiy extends Activity {

	TextView resultText;
	Button oneButton;
	Button twoButton;
	Button threeButton;
	Button fourButton;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maven_test_project);
    
        resultText = (TextView)findViewById(R.id.result_text);
        
        oneButton = (Button)findViewById(R.id.one_button);
        oneButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int what = Integer.parseInt(resultText.getText().toString()) + 1;
				resultText.setText(String.valueOf(what));
			}
		});
        twoButton = (Button)findViewById(R.id.two_button);
        twoButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int what = Integer.parseInt(resultText.getText().toString()) + 2;
				resultText.setText(String.valueOf(what));
			}
		});
        threeButton = (Button)findViewById(R.id.three_button);
        threeButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int what = Integer.parseInt(resultText.getText().toString()) + 3;
				resultText.setText(String.valueOf(what));
			}
		});
        fourButton = (Button)findViewById(R.id.four_button);
        fourButton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int what = Integer.parseInt(resultText.getText().toString()) + 4;
				resultText.setText(String.valueOf(what));
			}
		});
        
    
    }

}
