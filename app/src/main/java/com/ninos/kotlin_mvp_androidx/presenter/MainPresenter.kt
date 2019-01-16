package com.ninos.kotlin_mvp_androidx.presenter

import com.ninos.kotlin_mvp_androidx.base.PaginationPresenter
import com.ninos.kotlin_mvp_androidx.contract.MainContract
import com.ninos.kotlin_mvp_androidx.repository.MainRepository

class MainPresenter : PaginationPresenter<MainContract.Repository, MainContract.View>() {
    override fun getData(page: Int, count: Int) {
    }

    override fun setRepository(): MainContract.Repository = MainRepository()
}