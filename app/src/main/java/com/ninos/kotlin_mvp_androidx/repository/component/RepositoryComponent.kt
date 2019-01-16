package com.ninos.kotlin_mvp_androidx.repository.component

import com.ninos.kotlin_mvp_androidx.repository.api.ApiService
import com.ninos.kotlin_mvp_androidx.repository.okhttp.OkHttpService

/**
 * Created by ninos on 2019/1/8.
 */
object RepositoryComponent {
    /**
     *获取ApiService
     */
    val api: ApiService by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        OkHttpService.getService()
    }
}
