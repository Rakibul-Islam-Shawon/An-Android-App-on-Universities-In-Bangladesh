package com.gdm.bduvguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.gdm.bduvguide.GeneralUniversity.DU;
import com.gdm.bduvguide.PrivateUniversity.AIUB;
import com.gdm.bduvguide.PrivateUniversity.AUST;
import com.gdm.bduvguide.PrivateUniversity.BRACU;
import com.gdm.bduvguide.PrivateUniversity.BTUB;
import com.gdm.bduvguide.PrivateUniversity.BUBT;
import com.gdm.bduvguide.PrivateUniversity.DIU;
import com.gdm.bduvguide.PrivateUniversity.EDU;
import com.gdm.bduvguide.PrivateUniversity.EWU;
import com.gdm.bduvguide.PrivateUniversity.IIUC;
import com.gdm.bduvguide.PrivateUniversity.IUB;
import com.gdm.bduvguide.PrivateUniversity.IUBA;
import com.gdm.bduvguide.PrivateUniversity.MIST;
import com.gdm.bduvguide.PrivateUniversity.NSU;
import com.gdm.bduvguide.PrivateUniversity.PU;
import com.gdm.bduvguide.PrivateUniversity.UAP;
import com.gdm.bduvguide.PrivateUniversity.UIU;
import com.gdm.bduvguide.PrivateUniversity.ULAB;

public class PrivateUVList extends AppCompatActivity {
    private  ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_uvlist);

        //For the implementation of back button

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        listView = (ListView) findViewById(R.id.list);

        // Defined Array values to show in ListView
        String[] values = new String[] {
                " BRAC University (BRACU)",
                " North South University (NSU)",
                " Independent University Bangladesh (IUB)",
                " Ahsanullah University of Science and Technology (AUST)",
                " Military Institute of Science and Technology (MIST)",
                " East West University (EWU)",
                " United International University (UIU)",
                " University of Asia Pacific (UAP)",
                " American International University-Bangladesh (AIUB)",
                " University of Liberal Arts Bangladesh (ULAB)",
                " Daffodil International University (DIU)",
                " International University of Business Agriculture and Technology (IUBAT)",
                " International Islamic University Chittagong (IIUC)",
                " Bangladesh University of Business and Technology (BUBT)",
//                " BGC Trust University Bangladesh",
//                " East Delta University (EDU)",
//                " Premier University (PU)",


















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
//                        "Here the university info will display..." +itemValue , Toast.LENGTH_LONG)
//                        .show();



                if (position==0)
                {
                    Intent i=new Intent(PrivateUVList.this,BRACU.class);
                    startActivity(i);


                }
                if (position==1)
                {
                    Intent i=new Intent(PrivateUVList.this,NSU.class);
                    startActivity(i);


                }

                if (position==2)
                {
                    Intent i=new Intent(PrivateUVList.this,IUB.class);
                    startActivity(i);


                }

                if (position==3)
                {
                    Intent i=new Intent(PrivateUVList.this,AUST.class);
                    startActivity(i);


                }

                if (position==4)
                {
                    Intent i=new Intent(PrivateUVList.this,MIST.class);
                    startActivity(i);


                }

                if (position==5)
                {
                    Intent i=new Intent(PrivateUVList.this,EWU.class);
                    startActivity(i);


                }

                if (position==6)
                {
                    Intent i=new Intent(PrivateUVList.this,UIU.class);
                    startActivity(i);


                }

                if (position==7)
                {
                    Intent i=new Intent(PrivateUVList.this,UAP.class);
                    startActivity(i);


                }

                if (position==8)
                {
                    Intent i=new Intent(PrivateUVList.this,AIUB.class);
                    startActivity(i);


                }

                if (position==9)
                {
                    Intent i=new Intent(PrivateUVList.this,ULAB.class);
                    startActivity(i);


                }

                if (position==10)
                {
                    Intent i=new Intent(PrivateUVList.this,DIU.class);
                    startActivity(i);


                }

                if (position==11)
                {
                    Intent i=new Intent(PrivateUVList.this,IUBA.class);
                    startActivity(i);


                }

                if (position==12)
                {
                    Intent i=new Intent(PrivateUVList.this,IIUC.class);
                    startActivity(i);


                }

                if (position==13)
                {
                    Intent i=new Intent(PrivateUVList.this,BUBT.class);
                    startActivity(i);


                }

//                if (position==14)
//                {
//                    Intent i=new Intent(PrivateUVList.this,BTUB.class);
//                    startActivity(i);
//
//
//                }
//                if (position==14)
//                {
//                    Intent i=new Intent(PrivateUVList.this,EDU.class);
//                    startActivity(i);
//
//
//                }
//
//                if (position==15)
//                {
//                    Intent i=new Intent(PrivateUVList.this,PU.class);
//                    startActivity(i);
//
//
//                }




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
