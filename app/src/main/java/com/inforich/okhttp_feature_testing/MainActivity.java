package com.inforich.okhttp_feature_testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






       //restful api = new restful(); // already new a restful in the queryTesting  guess it's no used.


        new Thread(new Runnable() {
            @Override
            public void run() {
                queryTesting qT = new queryTesting();
                String str = "https://github.com/hongyangAndroid";
                qT.queryStatusCode(str);
            }
        }).start();



        /*        feature one        */
//        new Thread(new Runnable(){
//            @Override
//            public void run() {
//                OkHttpClient client = new OkHttpClient();
//                String url = "http://localhost:8080/CrunchifyRESTJerseyExample/crunchify/ftocservice/";
//                Request request = new Request.Builder()	.url(url).build();
//                try{
//                    Response response = client.newCall(request).execute();
//                    Log.d("test", response.body().string());
//                }catch(IOException e){
//                    Log.d("test", "Error");
//                }
//            }
//        }).start();

        Log.d("GoAhead","Ongoing");
    }




}
