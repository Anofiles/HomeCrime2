package com.example.homecrime2;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.homecrime2.RecyclerFragment.CodexRecyclerFragment;
import com.example.homecrime2.RecyclerFragment.CrimeRecyclerFragment;
import com.example.homecrime2.RecyclerFragment.StatisticRecyclerFragment;
import com.example.homecrime2.RecyclerFragment.SuspectRecyclerFragment;

public abstract class SingleFragmentActivity  extends AppCompatActivity {

    protected abstract Fragment createFragment();

    public static final String DUO_ACTIVITY ="duo activity start info";

    int x;// число х сообщает какой был сделан выбор в первой актисности
    Fragment mFragment;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x= getIntent().getIntExtra(DUO_ACTIVITY,0);
        switch (x){
            case 1:
                mFragment= new CrimeRecyclerFragment();
                break;
            case 2:
                mFragment= new CodexRecyclerFragment();
                break;
            case 3:
                mFragment= new StatisticRecyclerFragment();
                break;
            case 4:
                mFragment= new SuspectRecyclerFragment();
                break;
        }

        try {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            if (getSupportFragmentManager().findFragmentById(R.id.fragment_container) == null) {
                ft.add(R.id.fragment_container, mFragment);
            } else {
                ft.replace(R.id.fragment_container, mFragment);
            }
            //ft.addToBackStack(null);// Добавить в стек
            ft.commit();
        } catch (Exception e) {
            e.printStackTrace();
            Toast toast=Toast.makeText(this,"Ошибка в определении фрагмента",Toast.LENGTH_SHORT);
            toast.show();
        }
    }


}
