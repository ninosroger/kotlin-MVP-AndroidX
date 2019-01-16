package com.ninos.kotlin_mvp_androidx.base

/**
 * Created by ninos on 2019/1/8.
 */
abstract class BasePresenter<M : Any, V : BaseView> {
    protected lateinit var view: V
    protected lateinit var repository: M

    /**
     *初始化Repository
     */
    fun attachView(view: BaseView) {
        this.view = view as V
        repository = setRepository()
    }

    abstract fun setRepository(): M
}
