package com.nitrr.cse.incredible.eduone.Sub;


        import android.app.ProgressDialog;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;
        import com.android.volley.AuthFailureError;
        import com.android.volley.Request;
        import com.android.volley.RequestQueue;
        import com.android.volley.Response;
        import com.android.volley.VolleyError;
        import com.android.volley.toolbox.StringRequest;
        import com.android.volley.toolbox.Volley;
        import com.nitrr.cse.incredible.eduone.Cs.Ds.DsActivity;
        import com.nitrr.cse.incredible.eduone.R;

        import org.json.JSONException;
        import org.json.JSONObject;
        import java.util.HashMap;
        import java.util.Map;


public class Cs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs);


        Button ds = (Button) findViewById(R.id.btds);
        Button Sql = (Button) findViewById(R.id.btSql);
        Button algo = (Button) findViewById(R.id.btalgo);

        Button cpp = (Button) findViewById(R.id.btcpp);
        Button c = (Button) findViewById(R.id.btc);

        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ourintent = new Intent(Cs.this, DsActivity.class);
                ourintent.putExtra("key","http://www.geeksforgeeks.org/data-structures/");
                startActivity(ourintent);

                //getIntent().getExtras().get(key);


            }
        });

        Sql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ourintent = new Intent(Cs.this, DsActivity.class);
                ourintent.putExtra("key","http://www.w3schools.com/sql/default.asp");
                startActivity(ourintent);

                //getIntent().getExtras().get(key);


            }
        });

        algo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ourintent = new Intent(Cs.this, DsActivity.class);
                ourintent.putExtra("key","http://www.geeksforgeeks.org/fundamentals-of-algorithms/");
                startActivity(ourintent);

                //getIntent().getExtras().get(key);


            }
        });

        cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ourintent = new Intent(Cs.this, DsActivity.class);
                ourintent.putExtra("key","http://www.geeksforgeeks.org/c-plus-plus/");
                startActivity(ourintent);

                //getIntent().getExtras().get(key);


            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ourintent = new Intent(Cs.this, DsActivity.class);
                ourintent.putExtra("key","http://www.geeksforgeeks.org/c/");
                startActivity(ourintent);

                //getIntent().getExtras().get(key);


            }
        });


    }
}
