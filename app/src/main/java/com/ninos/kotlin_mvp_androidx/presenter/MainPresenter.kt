package com.ninos.kotlin_mvp_androidx.presenter

import com.ninos.kotlin_mvp_androidx.base.PaginationPresenter
import com.ninos.kotlin_mvp_androidx.contract.MainContract
import com.ninos.kotlin_mvp_androidx.repository.MainRepository
import com.ninos.kotlin_mvp_androidx.repository.component.RepositoryComponent
import com.ninos.kotlin_mvp_androidx.repository.localdb.entity.MainEntity

class MainPresenter : PaginationPresenter<MainContract.Repository, MainContract.View>() {
    override fun getData(page: Int, count: Int) {
        RepositoryComponent.localDB.mainDao().insertMain(MainEntity("this is a test message data $page"))
        view.hasMore()
    }

    override fun setRepository(): MainContract.Repository = MainRepository()

    fun getMainList(): List<MainEntity> {
        return RepositoryComponent.localDB.mainDao().getMainList()
    }
}