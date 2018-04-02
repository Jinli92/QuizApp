package com.example.jinliyu.quizapplication;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by jinliyu on 4/1/18.
 */

public class Q3Fragment extends Fragment {
Button btn;
View view;
TextView testTxt;
RadioGroup rg;
RadioButton rb;
MyInterface myInterface;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.q3_layout, container, false);
        btn = view.findViewById(R.id.button3);

//        String test = getActivity().getIntent().getExtras().getString("key");
//        testTxt = v.findViewById(R.id.testTxt);
//        testTxt.setText(test);

btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        rg = (RadioGroup) view.findViewById(R.id.question1);
        int answer = rg.getCheckedRadioButtonId();

        String ans2 = getArguments().getString("2");

        rb = rg.findViewById(answer);
        int index = rg.indexOfChild(rb);


        myInterface.myInterfaceMethod(ans2+ String.valueOf(index),3);

    }
});


        return view;



    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        myInterface = (MyInterface)getActivity();
    }
}
