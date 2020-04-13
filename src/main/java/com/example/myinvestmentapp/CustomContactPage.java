/* Not in use */

package com.example.myinvestmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CustomContactPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_contact_page);

        findCallIntent();
        populateList();
    }

    protected void findCallIntent() {
        Bundle callExtras = getIntent().getExtras();

        if (callExtras != null) {
            String userName = callExtras.getString("UserName");
            int duration = Toast.LENGTH_LONG;
            Toast toastMessage = Toast.makeText(getApplicationContext(), userName,  duration);
            toastMessage.show();
        }
    }

    protected void populateList() {

        String[] mainTextArray ={
                "Title 1","Title 2",
                "Title 3","Title 4",
                "Title 5",
        };

        String[] subTextArray ={
                "Sub Title 1","Sub Title 2",
                "Sub Title 3","Sub Title 4",
                "Sub Title 5",
        };

        Integer[] imageIdArray={
                R.drawable.phone_call,R.drawable.gmail,
                R.drawable.linkedin,R.drawable.facebook,
                R.drawable.twitter,
        };


        CustomArrayAdapter adapterList = new CustomArrayAdapter(this, mainTextArray, subTextArray, imageIdArray);
        ListView listView = (ListView) findViewById(R.id.customContactListView);
        listView.setAdapter(adapterList);

    }
}
