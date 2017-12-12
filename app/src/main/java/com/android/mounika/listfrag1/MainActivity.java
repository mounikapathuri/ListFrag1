package com.android.mounika.listfrag1;

import android.app.Activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity implements
        ListFrag.OnItemSelectedListener {
    FragmentManager fragmentmanager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
// TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onRssItemSelected(String link) {
        fragmentmanager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentmanager.beginTransaction();
        Layout1 layout1;
        if (link.equals("layout1")) {
            layout1 = new Layout1();
            fragmentTransaction.replace(R.id.detail, layout1);
            fragmentTransaction.commit();
        }

        /*else if (link.equals("layout2")) {
            layout2 = new Layout2();
            fragmentTransaction.replace(R.id.detailFragment, layout2);
            fragmentTransaction.commit();
        } else if (link.equals("layout3")) {
            layout3 = new Layout3();
            fragmentTransaction.replace(R.id.detailFragment, layout3);
            fragmentTransaction.commit();
        } else if (link.equals("layout4")) {
            layout4 = new Layout4();
            fragmentTransaction.replace(R.id.detailFragment, layout4);
            fragmentTransaction.commit();
        }*/
    }
}
