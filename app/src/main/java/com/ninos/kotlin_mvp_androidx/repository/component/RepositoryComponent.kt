package com.ninos.kotlin_mvp_androidx.repository.component

import androidx.room.Room
import com.ninos.kotlin_mvp_androidx.repository.api.ApiService
import com.ninos.kotlin_mvp_androidx.repository.localdb.LocalDB
import com.ninos.kotlin_mvp_androidx.repository.okhttp.OkHttpService
import com.ninos.kotlin_mvp_androidx.Application

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

    /**
     * ### 获取本地数据库
     */
    val localDB: LocalDB by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        Room.databaseBuilder(Application.instance, LocalDB::class.java, "AndroidX.db")
            .allowMainThreadQueries().build()
    }
}
