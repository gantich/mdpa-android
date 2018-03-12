package com.mdpa.guillermoantich.tinder.view;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;

import com.mdpa.guillermoantich.tinder.view.adapter.ProfileImagesAdapter;
import com.mdpa.guillermoantich.tinder.view.model.DiscoveryViewModel;

import com.mdpa.guillermoantich.tinder.R;
import com.mdpa.guillermoantich.tinder.view.model.SettingsViewModel;

public class EditProfileActivity extends AppCompatActivity {

    private SettingsViewModel settingsViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        settingsViewModel = ViewModelProviders.of(this).get(SettingsViewModel.class);
        //libraryViewModel.setResources(getResources());


        GridView gridView = (GridView) findViewById(R.id.image_gridview);
        gridView.setAdapter(new ProfileImagesAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View v, int position, long id) {
                Toast.makeText(getBaseContext(), "Grid Item " + (position + 1) + " Selected", Toast.LENGTH_LONG).show();
            }
        });

        EditText description = (EditText) findViewById(R.id.description);
        EditText job = (EditText) findViewById(R.id.job);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.gender_radiogroup);
        RadioButton radioButtonMale = (RadioButton) findViewById(R.id.gender_radio_male);
        RadioButton radioButtonFemale = (RadioButton) findViewById(R.id.gender_radio_female);
        EditText school = (EditText) findViewById(R.id.school);
        EditText song = (EditText) findViewById(R.id.song);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.edit_profile_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.e("TEST", "indexIs= " + item.getItemId() + " And should be= " +android.R.id.home);
        switch(item.getItemId()) {
            case R.id.ic_check:
                if(settingsViewModel.setPreferences()) {
                    //SEND DATA TO VIEWMODEL
                    Toast.makeText(this, this.getResources().getString(R.string.edit_profile_saved), Toast.LENGTH_SHORT).show();
                    finish();
                }else {
                    Toast.makeText(this, this.getResources().getString(R.string.edit_profile_not_saved), Toast.LENGTH_SHORT).show();
                }
                break;
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
