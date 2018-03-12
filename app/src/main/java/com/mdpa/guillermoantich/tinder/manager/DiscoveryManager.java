package com.mdpa.guillermoantich.tinder.manager;

import android.content.res.Resources;

import com.mdpa.guillermoantich.tinder.model.User;

import java.util.List;

/**
 * Created by master on 12/2/18.
 */

public class DiscoveryManager {

    private User profile;
    private List<User> recommendations;

    private Resources resources;

    public DiscoveryManager() {
        //fillProfileFromFile();
        //fillUserListFromFile();
    }

    public User getProfile() {
        return profile;
    }

    /*public List<User> getUserList() {
        return recommendations;
    }*/

    public void setResources(Resources resources) {
        this.resources = resources;
        //fillProfileFromFile();
        //fillUserListFromFile();
    }

    /*private void fillProfileFromFile() {
        try {
            String jsonContent = readJsonFile(R.raw.profile);
            if(jsonContent.isEmpty()) {
                return;
            }

            JSONObject jsonObject = new JSONObject(jsonContent);
            String id = jsonObject.getString("id");
            String name = jsonObject.getString("name");;
            String lastname = jsonObject.getString("lastname");;
            int age = jsonObject.getInt("age");;
            User.Gender gender = User.Gender.valueOf(jsonObject.getString("gender"));

            JSONArray jsonArray = jsonObject.getJSONArray("images");
            String[] images = new String[jsonArray.length()];
            for(int index = 0; index < jsonArray.length(); ++index)
            {
                images[index] = jsonArray.getString(index);
            }

            String description = jsonObject.getString("description");
            String job = jsonObject.getString("job");
            String studies = jsonObject.getString("studies");
            String song = jsonObject.getString("song");
            User.Gender preference = User.Gender.valueOf(jsonObject.getString("preference"));
            double latitude = jsonObject.getInt("latitude");
            double longitude = jsonObject.getInt("longitude");
            int distance_min = jsonObject.getInt("distance_min");
            int distance_max = jsonObject.getInt("distance_max");
            int range_min = jsonObject.getInt("range_min");
            int range_max = jsonObject.getInt("range_max");
            boolean visibility = jsonObject.getBoolean("visibility");

            profile = new User(id, name, lastname, age, gender, images, description, job, studies, song, preference, latitude, longitude, distance_min, distance_max, range_min, range_max, visibility);
        }
        catch (Exception e) {
            Log.e(this.getClass().getName(), e.getMessage());
        }
    }*/

    /*private void fillUserListFromFile() {
        try {
            String jsonContent = readJsonFile(R.raw.recommendations);
            if(jsonContent.isEmpty()) {
                return;
            }

            tvShowList = new ArrayList<TvShow>();
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
    }*/

    /*private String readJsonFile(int file) {
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
