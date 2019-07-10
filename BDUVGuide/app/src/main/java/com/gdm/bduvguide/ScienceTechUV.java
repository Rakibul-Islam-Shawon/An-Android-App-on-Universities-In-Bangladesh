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

import com.gdm.bduvguide.GeneralUniversity.DU;
import com.gdm.bduvguide.PrivateUniversity.NSU;
import com.gdm.bduvguide.ScienceTech.BSTU;
import com.gdm.bduvguide.ScienceTech.HSTU;
import com.gdm.bduvguide.ScienceTech.MBSTU;
import com.gdm.bduvguide.ScienceTech.NSTU;
import com.gdm.bduvguide.ScienceTech.PSTU;
import com.gdm.bduvguide.ScienceTech.SUST;

public class ScienceTechUV extends AppCompatActivity {


    private TextView tv,tv1;
    private ListView listView;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public_uvcategory);

        listView = (ListView) findViewById(R.id.list);

        tv=(TextView)findViewById(R.id.tv1);
        tv1=(TextView)findViewById(R.id.tv2);
        tv.setText("Please Select Your Desired University ");
        tv1.setText(null);


        //For the implementation of back button

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);


        // Defined Array values to show in ListView
        String[] values = new String[] {
                " Mawlana Bhasani Science & Technology University",
                " Hajee Mohammad Danesh Science & Technology University",
                " Noakhali Science and Technology University",
                " Patuakhali Science & Technology University",
                " Shahjalal University of Science and Technology",
                " Bangobandhhu Sheikh Mujibur Rahman Science and Technology University",













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


                if (position==0)
                {
                    Intent i=new Intent(ScienceTechUV.this,MBSTU.class);
                    startActivity(i);


                }

                if (position==1)
                {
                    Intent i=new Intent(ScienceTechUV.this,HSTU.class);
                    startActivity(i);


                }

                if (position==2)
                {
                    Intent i=new Intent(ScienceTechUV.this,NSTU.class);
                    startActivity(i);


                }

                if (position==3)
                {
                    Intent i=new Intent(ScienceTechUV.this,PSTU.class);
                    startActivity(i);


                }

                if (position==4)
                {
                    Intent i=new Intent(ScienceTechUV.this,SUST.class);
                    startActivity(i);


                }

                if (position==5)
                {
                    Intent i=new Intent(ScienceTechUV.this,BSTU.class);
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
