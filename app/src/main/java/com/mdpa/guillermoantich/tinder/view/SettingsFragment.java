package com.mdpa.guillermoantich.tinder.view;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarChangeListener;
import com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarFinalValueListener;
import com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar;
import com.mdpa.guillermoantich.tinder.R;

/**
 * Created by master on 12/2/18.
 */

public class SettingsFragment extends Fragment {

    public static SettingsFragment newInstance() {
        SettingsFragment fragment = new SettingsFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.settings_fragment, container, false);

        //View elements
        LinearLayout editProfile = (LinearLayout) view.findViewById(R.id.edit_profile);
        SeekBar distance = (SeekBar) view.findViewById(R.id.distance_seekbar);
        final TextView distanceHint = (TextView) view.findViewById(R.id.distance_hint);
        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.gender_radiogroup);
        RadioButton radioButtonMale = (RadioButton) view.findViewById(R.id.gender_radio_male);
        RadioButton radioButtonFemale = (RadioButton) view.findViewById(R.id.gender_radio_female);
        final CrystalRangeSeekbar rangeSeekbar = (CrystalRangeSeekbar) view.findViewById(R.id.rangeSeekbar1);
        final TextView tvMin = (TextView) view.findViewById(R.id.textMin1);
        final TextView tvMax = (TextView) view.findViewById(R.id.textMax1);
        Switch visibility = (Switch) view.findViewById(R.id.visibility_switch);
        Switch newMatch = (Switch) view.findViewById(R.id.new_match_switch);
        Switch vibration = (Switch) view.findViewById(R.id.vibration_switch);
        Switch sounds = (Switch) view.findViewById(R.id.sound_switch);
        LinearLayout privacy = (LinearLayout) view.findViewById(R.id.privacy);
        LinearLayout terms = (LinearLayout) view.findViewById(R.id.terms);
        LinearLayout share = (LinearLayout) view.findViewById(R.id.share);
        LinearLayout logout = (LinearLayout) view.findViewById(R.id.logout);
        LinearLayout delete = (LinearLayout) view.findViewById(R.id.delete);
        LinearLayout version = (LinearLayout) view.findViewById(R.id.version);


        //View elements interaction
        privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), R.string.not_available_yet, Toast.LENGTH_SHORT).show();
            }
        });

        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), R.string.not_available_yet, Toast.LENGTH_SHORT).show();
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), R.string.not_available_yet, Toast.LENGTH_SHORT).show();
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), R.string.not_available_yet, Toast.LENGTH_SHORT).show();
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), R.string.not_available_yet, Toast.LENGTH_SHORT).show();
            }
        });

        version.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), R.string.preferences_item_other_version_summary, Toast.LENGTH_SHORT).show();
            }
        });

        rangeSeekbar.setOnRangeSeekbarChangeListener(new OnRangeSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue, Number maxValue) {
                tvMin.setText(String.valueOf(minValue));
                tvMax.setText(String.valueOf(maxValue));
            }
        });

        rangeSeekbar.setOnRangeSeekbarFinalValueListener(new OnRangeSeekbarFinalValueListener() {
            @Override
            public void finalValue(Number minValue, Number maxValue) {
                Log.d("CRS=>", String.valueOf(minValue) + " : " + String.valueOf(maxValue));
            }
        });


        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), EditProfileActivity.class);
                startActivity(intent);
            }
        });

        distance.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
                progress = progresValue;
                distanceHint.setText(progress + " Km");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                distanceHint.setText(progress + " Km");
            }
        });
        return view;
    }
}

