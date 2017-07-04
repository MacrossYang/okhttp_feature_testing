package com.inforich.okhttp_feature_testing;

/**
 * Created by dared on 2017/6/19.
 *
 * Remember the token would be expired and you need to query a new token maybe come from Postman or CURL command.
 *
 * The java who implement s Listener is using to find the answer.
 * Until you find the answer you have to use the Callback to tell the User who need the answer.
 */
import android.util.Log;
import java.io.IOException;

import okhttp3.Authenticator;
import okhttp3.Call;

import okhttp3.Callback;
import okhttp3.Credentials;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;


public class queryTesting  {



    public void queryStatusCode(String hyperlink ){

        String _token_ = "Bearer ";
        hyperlink = "http://192.168.11.41/sdk/v1/users";
        OkHttpClient client = new OkHttpClient();


        Request response = new Request.Builder()
                .url(hyperlink)
                .header("Authorization", _token_)
                .build();



        Call call = client.newCall(response);


        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                int Code = response.code();
                String Message = response.body().string();
                Log.d("Response", "StatusCode: " + Code + "Message: " + Message);
                Log.d("Debug", "Pause Point");

            }
        });


       /*

            try {
                int statuscode = call.execute().code();
                Log.d("Resposne ", "Status Code: " + statuscode);
                Log.d("Message","Response Body: " + response.body().toString());
                Log.d("Resposne ", "Pause");
            } catch (IOException e) {
                e.printStackTrace();
            }
*/



    }


    public void tellmeStatusCode(int statsCode){
        System.out.print("The statuscode is: " + statsCode);
    }

}
