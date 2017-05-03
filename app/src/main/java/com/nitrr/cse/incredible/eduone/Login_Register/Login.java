package com.nitrr.cse.incredible.eduone.Login_Register;
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
        import com.nitrr.cse.incredible.eduone.MainActivity;
        import com.nitrr.cse.incredible.eduone.R;

        import org.json.JSONException;
        import org.json.JSONObject;
        import java.util.HashMap;
        import java.util.Map;


public class Login extends AppCompatActivity {

    private EditText phone,password;
    private Button login;
    private Button register;
    private RequestQueue requestQueue;
    private static final String URL = "http://eduone.esy.es/user_controllogin.php";
    private StringRequest request;
    private Session session;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        session = new Session(this);
        phone = (EditText) findViewById(R.id.etphoneno);
        password = (EditText) findViewById(R.id.etpassword);
        login = (Button) findViewById(R.id.btLogin);
        register = (Button) findViewById(R.id.btRegister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Register.class));
                finish();
            }
        });
        if(session.loggedin()){
            startActivity(new Intent(Login.this,MainActivity.class));
            finish();
        }


        requestQueue = Volley.newRequestQueue(this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ProgressDialog loading;
                loading = ProgressDialog.show(Login.this, "Please Wait...",null,true,true);


                request = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {

                            JSONObject jsonObject = new JSONObject(response);
                            if(jsonObject.names().get(0).equals("success"))
                            {
                                loading.dismiss();

                                session.setLoggedin(true);
                                Toast.makeText(getApplicationContext(),"SUCCESS "+jsonObject.getString("success"),Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                                finish();

                            }else {
                                loading.dismiss();

                                Toast.makeText(getApplicationContext(), "Error" +jsonObject.getString("error"), Toast.LENGTH_SHORT).show();
                                password.setText("");

                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }){
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        HashMap<String,String> hashMap = new HashMap<String, String>();
                        hashMap.put("phone",phone.getText().toString());
                        hashMap.put("password",password.getText().toString());

                        return hashMap;
                    }
                };

                requestQueue.add(request);
            }
        });
    }
}






