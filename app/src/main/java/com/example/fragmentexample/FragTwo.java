package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class FragTwo extends Fragment {

    View view;
    LinearLayout fragTwo;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.activity_frag_two, container, false);
        fragTwo = (LinearLayout) view.findViewById(R.id.fragTwo);
        fragTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragTwo.setBackgroundColor(Color.parseColor("#FF0000"));
            }
        });
        return view;
    }
}
