package com.example.homecrime2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.homecrime2.RecyclerFragment.CodexRecyclerFragment;
import com.example.homecrime2.RecyclerFragment.CrimeRecyclerFragment;
import com.example.homecrime2.RecyclerFragment.StatisticRecyclerFragment;
import com.example.homecrime2.RecyclerFragment.SuspectRecyclerFragment;

public class DuoActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return mFragment;
    }
  @Override
    protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_duo);


  }

}
