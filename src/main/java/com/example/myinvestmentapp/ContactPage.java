package com.example.myinvestmentapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ContactPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_page);


        populateList();
        findCallIntent();
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

        String[] mobileArray = {"Android", "IPhone", "WindowsMobile", "Blackberry",
                "WebOS", "Ubuntu", "Windows7", "Max OS X"};

        ArrayAdapter adapterList = new ArrayAdapter<String>(this, R.layout.contact_textview, mobileArray);
        ListView listView = (ListView) findViewById(R.id.contactListView);
        listView.setAdapter(adapterList);

    }
}