package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class FragThree extends Fragment {

    View view;
    LinearLayout fragThree;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.activity_frag_three, container, false);
        fragThree = (LinearLayout) view.findViewById(R.id.fragThree);
        fragThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragThree.setBackgroundColor(Color.parseColor("#FFFFFF"));
            }
        });
        return view;
    }
}
