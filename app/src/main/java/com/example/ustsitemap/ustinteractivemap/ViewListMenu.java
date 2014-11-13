package com.example.ustsitemap.ustinteractivemap;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ustsitemap.ustinteractivemap.R;

public class ViewListMenu extends ActionBarActivity implements AdapterView.OnItemClickListener{
    ListView l;
    String[] data={"UST Main Building","UST Arch of the Centuries","Roque Ruano Building","Beato Angelico Building","Alfredo M. Velayo","St. Raymund de Peñafort Building", "Albertus Magnus Building"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_list_menu);
        l= (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        l.setAdapter(adapter);
        l.setOnItemClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.view_list_menu, menu);
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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView temp= (TextView) view;
        if(position==0){
            Intent listToMain = new Intent(this, MainBuilding.class);
            startActivity(listToMain);
        }
        else if(position==1){
            Intent listToArch = new Intent(this, ArchCenturies.class);
            startActivity(listToArch);
        }
        else if(position==2){
            Intent listToEngg = new Intent(this, engg_building.class);
            startActivity(listToEngg);
        }
        else if(position==3){
            Intent listToArki = new Intent(this, arki.class);
            startActivity(listToArki);
        }
        else if(position==4){
            Intent listToAcc = new Intent(this, acc.class);
            startActivity(listToAcc);
        }
        else if(position==5){
            Intent listToCom = new Intent(this, com.class);
            startActivity(listToCom);
        }
        else if(position==6){
            Intent listToEduc = new Intent(this, educ.class);
            startActivity(listToEduc);
        }
    }
}
