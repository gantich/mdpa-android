package com.mdpa.guillermoantich.tinder.manager;

import android.content.res.Resources;
import android.util.Log;

import com.mdpa.guillermoantich.tinder.model.Match;
import com.mdpa.guillermoantich.tinder.model.User;

import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

/**
 * Created by Guillermo on 06/03/2018.
 */

public class MessagingManager {

    private List<Match> matchesList;

    private Resources resources;

    public MessagingManager() {

    }

    public void setResources(Resources resources) {
        this.resources = resources;
        //fillUserListFromFile();
    }

    /*private void fillUserListFromFile() {
        try {
            String jsonContent = readJsonFile(R.raw.recommendations);
            if(jsonContent.isEmpty()) {
                return;
            }

            matchesList = new ArrayList<Match>();
            JSONArray jsonArray = new JSONArray(jsonContent);
            for(int index = 0; index < jsonArray.length(); ++index)
            {
                JSONObject jsonObject = jsonArray.getJSONObject(index);
                String title = jsonObject.getString("title");
                boolean ended = jsonObject.getBoolean("ended");
                int seasons = jsonObject.getInt("seasons");

                tvShowList.add(new TvShow(title, ended, seasons));
            }
        }
        catch (Exception e) {
            Log.e(this.getClass().getName(), e.getMessage());
        }
    }

    private String readJsonFile(int file) {
        InputStream is = resources.openRawResource(file);
        Writer writer = new StringWriter();
        char[] buffer = new char[1024];
        try {
            Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            int n;
            while ((n = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, n);
            }
        }
        catch (Exception e) {
            Log.e(this.getClass().getName(), e.getMessage());
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                Log.e(this.getClass().getName(), e.getMessage());
            }
        }

        String jsonString = writer.toString();
        return jsonString;
    }*/
}
