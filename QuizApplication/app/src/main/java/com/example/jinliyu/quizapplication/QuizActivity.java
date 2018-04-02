package com.example.jinliyu.quizapplication;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class QuizActivity extends AppCompatActivity implements MyInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Q1Fragment q1 = new Q1Fragment();
        getFragmentManager().beginTransaction().add(R.id.frameLayout, q1).addToBackStack(null).commit();
    }


    @Override
    public void myInterfaceMethod(String data, int questionNum) {

        if(questionNum == 1) {
            Q2Fragment q2Fragment = new Q2Fragment();
            Bundle bundle = new Bundle();
            bundle.putString("1", data);

            q2Fragment.setArguments(bundle);

            getFragmentManager().beginTransaction().replace(R.id.frameLayout, q2Fragment).addToBackStack(null).commit();
        }
        if(questionNum == 2)
        {
            Q3Fragment q3Fragment = new Q3Fragment();
            Bundle bundle = new Bundle();
            bundle.putString("2", data);

            q3Fragment.setArguments(bundle);

            getFragmentManager().beginTransaction().replace(R.id.frameLayout, q3Fragment).addToBackStack(null).commit();


        }
        if(questionNum == 3)
        {
            Q4Fragment q4Fragment = new Q4Fragment();
            Bundle bundle = new Bundle();
            bundle.putString("3", data);

            q4Fragment.setArguments(bundle);

            getFragmentManager().beginTransaction().replace(R.id.frameLayout, q4Fragment).addToBackStack(null).commit();
 //           ShowResFragment srf = new ShowResFragment();
//            Bundle bundle = new Bundle();
//            bundle.putString("3", data);
//
//            srf.setArguments(bundle);
//
//            getFragmentManager().beginTransaction().replace(R.id.frameLayout, srf).addToBackStack(null).commit();

        }
        if(questionNum == 4)
        {
            Q5Fragment q5Fragment = new Q5Fragment();
            Bundle bundle = new Bundle();
            bundle.putString("4", data);

            q5Fragment.setArguments(bundle);

            getFragmentManager().beginTransaction().replace(R.id.frameLayout, q5Fragment).addToBackStack(null).commit();



        }

        if(questionNum == 5)
        {
//            ShowResFragment srf = new ShowResFragment();
//            Bundle bundle = new Bundle();
//            bundle.putString("5", data);
//
//            srf.setArguments(bundle);
//
//            getFragmentManager().beginTransaction().replace(R.id.frameLayout, srf).addToBackStack(null).commit();

            Q6Fragment q6Fragment = new Q6Fragment();
            Bundle bundle = new Bundle();
            bundle.putString("5", data);

            q6Fragment.setArguments(bundle);

            getFragmentManager().beginTransaction().replace(R.id.frameLayout, q6Fragment).addToBackStack(null).commit();

        }
        if(questionNum == 6)
        {
            Q7Fragment q7Fragment = new Q7Fragment();
            Bundle bundle = new Bundle();
            bundle.putString("6", data);

            q7Fragment.setArguments(bundle);

            getFragmentManager().beginTransaction().replace(R.id.frameLayout, q7Fragment).addToBackStack(null).commit();


        }
        if(questionNum == 7)
        {
            Q8Fragment q8Fragment = new Q8Fragment();
            Bundle bundle = new Bundle();
            bundle.putString("7", data);

            q8Fragment.setArguments(bundle);

            getFragmentManager().beginTransaction().replace(R.id.frameLayout, q8Fragment).addToBackStack(null).commit();


        }
        if(questionNum == 8)
        {
            Q9Fragment q9Fragment = new Q9Fragment();
            Bundle bundle = new Bundle();
            bundle.putString("8", data);

            q9Fragment.setArguments(bundle);

            getFragmentManager().beginTransaction().replace(R.id.frameLayout, q9Fragment).addToBackStack(null).commit();


        }
        if(questionNum == 9)
        {
            Q10Fragment q10Fragment = new Q10Fragment();
            Bundle bundle = new Bundle();
            bundle.putString("9", data);

            q10Fragment.setArguments(bundle);

            getFragmentManager().beginTransaction().replace(R.id.frameLayout, q10Fragment).addToBackStack(null).commit();


        }
        else if(questionNum == 10)
        {
            ShowResFragment srf = new ShowResFragment();
            Bundle bundle = new Bundle();
            bundle.putString("10", data);

            srf.setArguments(bundle);

            getFragmentManager().beginTransaction().replace(R.id.frameLayout, srf).addToBackStack(null).commit();

        }
    }
}
