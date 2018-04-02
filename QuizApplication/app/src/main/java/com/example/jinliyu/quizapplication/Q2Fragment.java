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

/**
 * Created by jinliyu on 4/1/18.
 */

public class Q2Fragment extends Fragment {
MyInterface myInterface;
Button btn;
View view;
RadioButton rb;
RadioGroup rg;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       view = inflater.inflate(R.layout.q2_layout,container,false);
      btn = view.findViewById(R.id.button2);


      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              rg = (RadioGroup) view.findViewById(R.id.question1);
              int answer = rg.getCheckedRadioButtonId();

              rb = rg.findViewById(answer);

               int index = rg.indexOfChild(rb);
              Log.i("question2:",String.valueOf(index));

              String ans1 = getArguments().getString("1");
              myInterface.myInterfaceMethod(ans1+ String.valueOf(index),2);

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
