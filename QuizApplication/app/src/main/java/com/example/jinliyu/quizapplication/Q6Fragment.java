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

public class Q6Fragment extends Fragment {
    View view;
    Button btn;
    RadioButton rb;
    RadioGroup rg;
    MyInterface myInterface;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.q6_layout, container, false);
        btn= view.findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rg = view.findViewById(R.id.question1);
                int answer = rg.getCheckedRadioButtonId();

                String ans5 = getArguments().getString("5");

                rb = rg.findViewById(answer);
                int index = rg.indexOfChild(rb);


                myInterface.myInterfaceMethod(ans5+ String.valueOf(index),6);
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
