package xfinity.com.model.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by root on 1/20/18.
 */

public class APIClient {

    public static final String BASE_URL = "http://api.duckduckgo.com/";

    private static Retrofit retrofit = null;


    public static Retrofit getClient() {

        OkHttpClient client = new OkHttpClient.Builder()
                .build();

        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
