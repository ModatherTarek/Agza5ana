package com.example.agza5ana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class Offers extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offers);

        listView = findViewById(R.id.lv_medicine);

        ArrayList<Medicine> medicineArrayList = new ArrayList<>();

        Medicine medicine1 =new Medicine();
        medicine1.setName("Panadol");
        medicine1.setPrice(25.50);
        medicine1.setImage(R.drawable.pills);
        medicineArrayList.add(medicine1);


        Medicine medicine2 = new Medicine();
        medicine2.setName("Panadol Extra");
        medicine2.setPrice(30.00);
        medicine2.setImage(R.drawable.medicine2);
        medicineArrayList.add(medicine2);


        Medicine medicine3 = new Medicine();
        medicine3.setName("Night & Day");
        medicine3.setPrice(10.00);
        medicine3.setImage(R.drawable.medicine1);
        medicineArrayList.add(medicine3);


        MedicineAdapter medicineAdapter = new MedicineAdapter(Offers.this,R.layout.medicine_list,medicineArrayList);
        listView.setAdapter(medicineAdapter);


    }

}
