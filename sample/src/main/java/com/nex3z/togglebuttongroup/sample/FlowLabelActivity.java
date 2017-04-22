package com.nex3z.togglebuttongroup.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.nex3z.togglebuttongroup.MultiSelectToggleGroup;

public class FlowLabelActivity extends AppCompatActivity {
    private static final String LOG_TAG = FlowLabelActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flow_label);
        init();
    }

    private void init() {
        MultiSelectToggleGroup multi = (MultiSelectToggleGroup) findViewById(R.id.group_weekdays);
        multi.setOnCheckedChangeListener(new MultiSelectToggleGroup.OnCheckedStateChangeListener() {
            @Override
            public void onCheckedStateChanged(MultiSelectToggleGroup group, int checkedId, boolean isChecked) {
                Log.v(LOG_TAG, "onCheckedStateChanged(): group.getCheckedIds() = " + group.getCheckedIds());
            }
        });
    }
}
