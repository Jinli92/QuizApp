package com.example.jinliyu.quizapplication;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jinliyu on 4/1/18.
 */

public class ShowResFragment extends Fragment {
View view;
TextView nameTxt, score, q1, q2, q3,q4, q5,q6, q7, q8,q9,q10;
int finalscore = 0;
MyInterface myInterface;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.showresult_layout, container, false);

        String username = getActivity().getIntent().getExtras().getString("key");
        nameTxt = view.findViewById(R.id.nameTxt);
        nameTxt.setText(username + ", Here's your score of this Quiz:");

        score = view.findViewById(R.id.scoreTxt);
        q1 = view.findViewById(R.id.num1Txt);
        q2 = view.findViewById(R.id.num2Txt);
        q3 = view.findViewById(R.id.num3Txt);
        q4 = view.findViewById(R.id.num4Txt);
        q5 = view.findViewById(R.id.num5Txt);
        q6 = view.findViewById(R.id.num6Txt);
        q7 = view.findViewById(R.id.num7Txt);
        q8 = view.findViewById(R.id.num8Txt);
        q9 = view.findViewById(R.id.num9Txt);
        q10 = view.findViewById(R.id.num10Txt);


        String results = getArguments().getString("10");

//char[] answers = {'0','1','1','0','3','0','1','1','0','3'};


    char res = results.charAt(0);


    if (res == '0') {
        finalscore += 10;
        q1.setText("1. Correct.");
        q1.setTextColor(getResources().getColor(R.color.correct));

    } else {
        q1.setText("1. Wrong.");
        q1.setTextColor(getResources().getColor(R.color.wrong));
    }



        char res2 = results.charAt(1);
        if(res2 == '0')
        {
            finalscore += 10;
            q2.setText("2. Correct.");
            q2.setTextColor(getResources().getColor(R.color.correct));

        }
        else {
            q2.setText("2. Wrong.");
            q2.setTextColor(getResources().getColor(R.color.wrong));
        }

        char res3 = results.charAt(2);
        if(res3 == '1')
        {
            finalscore += 10;
            q3.setText("3. Correct.");
            q3.setTextColor(getResources().getColor(R.color.correct));

        }
        else {
            q3.setText("3. Wrong.");
            q3.setTextColor(getResources().getColor(R.color.wrong));
        }

        char res4 = results.charAt(3);
        Log.i("question1:",String.valueOf(res4));

        if(res4 == '0')
        {
            finalscore += 10;
            q4.setText("4. Correct.");
            q4.setTextColor(getResources().getColor(R.color.correct));

        }
        else {
            q4.setText("4. Wrong.");
            q4.setTextColor(getResources().getColor(R.color.wrong));
        }

        char res5 = results.charAt(4);

        if(res5 == '0')
        {
            finalscore += 10;
            q5.setText("5. Correct.");
            q5.setTextColor(getResources().getColor(R.color.correct));

        }
        else {
            q5.setText("5. Wrong.");
            q5.setTextColor(getResources().getColor(R.color.wrong));
        }


        char res6 = results.charAt(5);

        if(res6 == '0')
        {
            finalscore += 10;
            q6.setText("6. Correct.");
            q6.setTextColor(getResources().getColor(R.color.correct));

        }
        else {
            q6.setText("6. Wrong.");
            q6.setTextColor(getResources().getColor(R.color.wrong));
        }

        char res7 = results.charAt(6);
        if(res7 == '0')
        {
            finalscore += 10;
            q7.setText("7. Correct.");
            q7.setTextColor(getResources().getColor(R.color.correct));

        }
        else {
            q7.setText("7. Wrong.");
            q7.setTextColor(getResources().getColor(R.color.wrong));
        }


        char res8 = results.charAt(7);
        if(res8 == '0')
        {
            finalscore += 10;
            q8.setText("8. Correct.");
            q8.setTextColor(getResources().getColor(R.color.correct));

        }
        else {
            q8.setText("8. Wrong.");
            q8.setTextColor(getResources().getColor(R.color.wrong));
        }
        char res9 = results.charAt(8);
        if(res9 == '0')
        {
            finalscore += 10;
            q9.setText("9. Correct.");
            q9.setTextColor(getResources().getColor(R.color.correct));

        }
        else {
            q9.setText("9. Wrong.");
            q9.setTextColor(getResources().getColor(R.color.wrong));
        }

        char res10 = results.charAt(9);
        if(res10 == '0')
        {
            finalscore += 10;
            q10.setText("10. Correct.");
            q10.setTextColor(getResources().getColor(R.color.correct));

        }
        else {
            q10.setText("10. Wrong.");
            q10.setTextColor(getResources().getColor(R.color.wrong));
        }

        score.setText(String.valueOf(finalscore));



        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        myInterface = (MyInterface)getActivity();
    }


}
