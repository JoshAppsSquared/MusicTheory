package com.appssquared.musictheory;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MusicTheory extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button cButton = (Button)findViewById(R.id.cmaj);
        cButton.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		setContentView(R.layout.cmaj);
        	}
        });
        
        
        Button dButton = (Button)findViewById(R.id.dmaj);
        dButton.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		setContentView(R.layout.dmaj);
        	}
        });
        
        
        Button eButton = (Button)findViewById(R.id.emaj);
        eButton.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		setContentView(R.layout.emaj);
        	}
        });
        
        
        Button fButton = (Button)findViewById(R.id.fmaj);
        fButton.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		setContentView(R.layout.fmaj);
        	}
        });
        
        
        Button gButton = (Button)findViewById(R.id.gmaj);
        gButton.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		setContentView(R.layout.gmaj);
        	}
        });
        
        
        Button aButton = (Button)findViewById(R.id.amaj);
        aButton.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		setContentView(R.layout.amaj);
        	}
        });
        
        
        Button bButton = (Button)findViewById(R.id.bmaj);
        bButton.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		setContentView(R.layout.bmaj);
        	}
        });
        
        
        Button goHomeButton = (Button)findViewById(R.id.hbutton);
        goHomeButton.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		setContentView(R.layout.main);
        	}
        });
        
        
    }
}