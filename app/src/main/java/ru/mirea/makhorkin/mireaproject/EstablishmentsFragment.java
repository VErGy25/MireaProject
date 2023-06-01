package ru.mirea.makhorkin.mireaproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class EstablishmentsFragment extends Fragment implements View.OnClickListener {
    View view;
    private static final String TAG = "myLogs";

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //binding = FragmentEstablishmentsBinding.inflate(inflater, R.layout.fragment_establishments, container, false);
        //binding.buttonMap1.setOnClickListener(new View.OnClickListener() {

        view = inflater.inflate(R.layout.fragment_establishments, container, false);
        view.findViewById(R.id.buttonMap1).setOnClickListener(this);
        view.findViewById(R.id.buttonMap2).setOnClickListener(this);
        view.findViewById(R.id.buttonMap3).setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), MapActivity.class);
        switch (v.getId()) {
            case R.id.buttonMap1: Log.d(TAG, "111111111111");
                intent.putExtra("Establishment", ("КРЕМЛЬ"));
                startActivity(intent);
                break;
            case R.id.buttonMap2: Log.d(TAG, "2222222222222");
                intent.putExtra("Establishment", ("ВЕРНАДКА"));
                startActivity(intent);
                break;
            case R.id.buttonMap3: Log.d(TAG, "33333333");
                intent.putExtra("Establishment", ("СТРОМЫНКА"));
                startActivity(intent);
                break;
        }

    }
        //binding.buttonMap3.setOnClickListener(new View.OnClickListener() {

       // @Override
        //public void onClick(View v) {
          //  Intent intent = new Intent(getContext(), MapActivity.class);
         //   intent.putExtra("Establishment", ("3"));
       //     startActivity(intent);
      //  }
   // });
}
