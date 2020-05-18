package com.example.blog;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.cSpinner);
        // create spinner itemlist for spinner
        ArrayList<Items> customList = new ArrayList<>();
        customList.add(new Items("Apple", R.drawable.apple));
        customList.add(new Items("Ball", R.drawable.ball));
        customList.add(new Items("Cat", R.drawable.cat));
        customList.add(new Items("Donkey", R.drawable.donkey));
        customList.add(new Items("Elephant", R.drawable.elephant));
        customList.add(new Items("Fish", R.drawable.fish));

        // create Adapter for spinner
        Adapter customAdapter = new Adapter(this, customList);

        if (spinner != null) {
            spinner.setAdapter(customAdapter);
            spinner.setOnItemSelectedListener(this);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        Items items = (Items) adapterView.getSelectedItem();
        Toast.makeText(this, items.getSpinnerText(), Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }
}

