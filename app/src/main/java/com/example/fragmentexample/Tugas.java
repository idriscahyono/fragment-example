package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class Tugas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas);

        loadFrag1(new FragOne());
        loadFrag2(new FragTwo());
        loadFrag3(new FragThree());
    }

    private void loadFrag1(Fragment fragment1) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.replace(R.id.frame1, fragment1);
        fragmentTransaction.commit();
    }
    private void loadFrag2(Fragment fragment2) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.replace(R.id.frame2, fragment2);
        fragmentTransaction.commit();
    }
    private void loadFrag3(Fragment fragment3){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.replace(R.id.frame3, fragment3);
        fragmentTransaction.commit();
    }
}
