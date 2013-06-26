package com.stockes.opmobscan;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;


public class OpMobScan extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op_mob_scan);
        initControls();    
    }

    void initControls()
    {
    	final Button buttonScan = (Button)findViewById(R.id.Scan);
    	buttonScan.setOnClickListener(scan);
    	EditText [][] table = new EditText[R.integer.table_rows][R.integer.table_columns];
    	table[1][1] = (EditText) findViewById(R.id.Op1);
    	table[1][2] = (EditText) findViewById(R.id.Type1);
    	table[1][3] = (EditText) findViewById(R.id.Sig1);
    	table[2][1] = (EditText) findViewById(R.id.Op2);
    	table[2][2] = (EditText) findViewById(R.id.Type2);
    	table[2][3] = (EditText) findViewById(R.id.Sig2);
    	table[3][1] = (EditText) findViewById(R.id.Op3);
    	table[3][2] = (EditText) findViewById(R.id.Type3);
    	table[3][3] = (EditText) findViewById(R.id.Sig3);
    	table[4][1] = (EditText) findViewById(R.id.Op4);
    	table[4][2] = (EditText) findViewById(R.id.Type4);
    	table[4][3] = (EditText) findViewById(R.id.Sig4);
    	table[5][1] = (EditText) findViewById(R.id.Op5);
    	table[5][2] = (EditText) findViewById(R.id.Type5);
    	table[5][3] = (EditText) findViewById(R.id.Sig5);
    	
    }
    
    View.OnClickListener scan = new View.OnClickListener()
    {
        public void onClick(View v) 
        {
            // Perform action on click
        }
    };
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.op_mob_scan, menu);
        return true;
    }
    
    @Override
    protected void onStart() {//activity is started and visible to the user
    
     super.onStart();  
    }
    @Override
    protected void onResume() {//activity was resumed and is visible again
    
     super.onResume();
      
    }
    @Override
    protected void onPause() { //device goes to sleep or another activity appears
     super.onPause();
      
    }
    @Override
    protected void onStop() { //the activity is not visible anymore
    
     super.onStop();
      
    }
    @Override
    protected void onDestroy() {//android has killed this activity
      super.onDestroy();
    }
    
}
