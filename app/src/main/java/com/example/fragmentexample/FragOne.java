package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class FragOne extends Fragment {

    View view;
    LinearLayout fragOne;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.activity_frag_one, container, false);
        fragOne = (LinearLayout) view.findViewById(R.id.fragOne);
        fragOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               fragOne.setBackgroundColor(Color.parseColor("#8F00FF"));
            }
        });
        return view;
    }
}
