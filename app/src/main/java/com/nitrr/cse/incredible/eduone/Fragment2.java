package com.nitrr.cse.incredible.eduone;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.nitrr.cse.incredible.eduone.Courses.CourseReg;
import com.nitrr.cse.incredible.eduone.Cs.Ds.DsActivity;
import com.nitrr.cse.incredible.eduone.Login_Register.Login;
import com.nitrr.cse.incredible.eduone.Login_Register.Session;


public class Fragment2 extends Fragment {

    public Fragment2() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v;
        v = inflater.inflate(R.layout.fragment_fragment2, container, false);


        final Session session;

        session = new Session(getActivity());

        FloatingActionButton fab = (FloatingActionButton) v.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                session.setLoggedin(false);

                startActivity(new Intent(getContext(),Login.class));
                getActivity().finish();
            }
        });




        Button cs = (Button) v.findViewById(R.id.btcs);
        Button mech = (Button) v.findViewById(R.id.btmech);
        Button civil = (Button) v.findViewById(R.id.btcivil);

        Button elex = (Button) v.findViewById(R.id.btelex);
        Button electrical = (Button) v.findViewById(R.id.btelectrical);


        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ourintent = new Intent(getContext(), DsActivity.class);
                ourintent.putExtra("key","https://www.youtube.com/geeksforgeeksvideos");
                startActivity(ourintent);

                //getIntent().getExtras().get(key);


            }
        });

        mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ourintent=new Intent(getContext(),DsActivity.class);
                startActivity(ourintent);


            }
        });


        elex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ourintent=new Intent(getContext(),DsActivity.class);
                startActivity(ourintent);


            }
        });


        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ourintent=new Intent(getContext(),DsActivity.class);
                startActivity(ourintent);


            }
        });


        electrical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ourintent=new Intent(getContext(),DsActivity.class);
                startActivity(ourintent);


            }
        });




        return v;
    }


}
