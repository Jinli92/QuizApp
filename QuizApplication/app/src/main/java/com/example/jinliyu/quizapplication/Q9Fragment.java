package com.example.jinliyu.quizapplication;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by jinliyu on 4/1/18.
 */

public class Q9Fragment extends Fragment {
    View view;
    Button btn;
    RadioButton rb;
    RadioGroup rg;
    MyInterface myInterface;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.q9_layout, container, false);
        btn= view.findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rg = view.findViewById(R.id.question1);
                int answer = rg.getCheckedRadioButtonId();

                String ans8 = getArguments().getString("8");

                rb = rg.findViewById(answer);
                int index = rg.indexOfChild(rb);


                myInterface.myInterfaceMethod(ans8+ String.valueOf(index),9);
            }
        });

        return  view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        myInterface = (MyInterface)getActivity();
    }
}
