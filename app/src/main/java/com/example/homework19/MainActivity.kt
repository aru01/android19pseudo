package com.example.homework19

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var retrofit: Retrofit? = null
    var recyclerView: RecyclerView? = null
    var mAdapter: RandomUserAdapter? = null
    private var university:University = DaggerDaggerComponent.create().getUniversity()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //для логирования
        HttpLoggingInterceptor httpLoggingInterceptor = new
                HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                    @Override
                    public void log(@NonNull String message) {
                    }
                });

        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//роль клиент для ретрофита
        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .addInterceptor(httpLoggingInterceptor)
                .build();

        retrofit = new Retrofit.Builder() //для такой задаич где ндуны вывести рандомных студентов
                .client(okHttpClient)
                .baseUrl("")
                //надо будет изменить формат
                .build();

        ();
    }
    }
}