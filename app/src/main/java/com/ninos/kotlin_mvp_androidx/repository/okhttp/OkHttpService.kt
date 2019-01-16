package com.ninos.kotlin_mvp_androidx.repository.okhttp

import com.ninos.kotlin_mvp_androidx.repository.api.ApiService
import com.ninos.kotlin_mvp_androidx.utils.Constants
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

/**
 * Created by ninos on 2019/1/8.
 * 线程安全的懒加载单例模式
 */
class OkHttpService {
    companion object {
        fun getService(): ApiService = Holder.retrofit.create(ApiService::class.java)
    }

    private object Holder {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(
                OkHttpClient()
                    .newBuilder()
                    .readTimeout(100, TimeUnit.SECONDS)
                    .writeTimeout(100, TimeUnit.SECONDS)
                    .connectTimeout(100, TimeUnit.SECONDS)
                    .build()
            )
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .build()
    }
}