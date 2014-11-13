package com.example.ustsitemap.ustinteractivemap;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.ustsitemap.ustinteractivemap.R;

public class MapScreen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_screen);

    }

    public void mapToList(View view){
       Intent mapToList = new Intent(this, ViewListMenu.class);
       startActivity(mapToList);
    }

    public void buttonToMain(View view){
        Intent buttonToMain = new Intent(this, MainBuilding.class);
        startActivity(buttonToMain);
    }

    public void buttonToArch(View view){
        Intent buttonToArch = new Intent(this, ArchCenturies.class);
        startActivity(buttonToArch);
    }

    public void buttonToEngg(View view){
        Intent buttonToEngg = new Intent(this, engg_building.class);
        startActivity(buttonToEngg);
    }

    public void buttonToArki(View view){
        Intent buttonToArki = new Intent(this, arki.class);
        startActivity(buttonToArki);
    }

    public void buttonToAcc(View view){
        Intent buttonToAcc = new Intent(this, acc.class);
        startActivity(buttonToAcc);
    }

    public void buttonToCom(View view){
        Intent buttonToCom = new Intent(this, com.class);
        startActivity(buttonToCom);
    }
    public void buttonToEduc(View view){
        Intent buttonToEduc = new Intent(this, educ.class);
        startActivity(buttonToEduc);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.map_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
