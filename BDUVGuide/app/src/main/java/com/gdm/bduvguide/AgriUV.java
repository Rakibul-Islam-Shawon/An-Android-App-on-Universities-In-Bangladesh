package com.gdm.bduvguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.gdm.bduvguide.AgriUniversity.BAU;
import com.gdm.bduvguide.AgriUniversity.BSMRAU;
import com.gdm.bduvguide.AgriUniversity.SAU;
import com.gdm.bduvguide.AgriUniversity.SAUV;
import com.gdm.bduvguide.GeneralUniversity.DU;

public class AgriUV extends AppCompatActivity {


    private TextView tv,tv1;
    private ListView listView;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public_uvcategory);

        listView = (ListView) findViewById(R.id.list);

       //For the implementation of back button

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        tv=(TextView)findViewById(R.id.tv1);
        tv1=(TextView)findViewById(R.id.tv2);
        tv.setText("Please Select Your Desired University ");
        tv1.setText(null);


        // Defined Array values to show in ListView
        String[] values = new String[] {
                " Bangladesh Agriculture University",
                " Bangabandhu Sheikh Mujibur Rahman Agricultural University (BSMRAU)",
                " Sher-e-Bangla Agricultural University",
                " Sylhet Agricultural University"

        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
//                Toast.makeText(getApplicationContext(),
//                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
//                        .show();
                if (position==0) {
                    Intent i = new Intent(AgriUV.this, BAU.class);
                    startActivity(i);


                }

                if (position==1) {
                    Intent i = new Intent(AgriUV.this, BSMRAU.class);
                    startActivity(i);


                }


                if (position==2) {
                    Intent i = new Intent(AgriUV.this, SAU.class);
                    startActivity(i);


                }


                if (position==3) {
                    Intent i = new Intent(AgriUV.this, SAUV.class);
                    startActivity(i);


                }


            }

        });

    }


  //back button method
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
