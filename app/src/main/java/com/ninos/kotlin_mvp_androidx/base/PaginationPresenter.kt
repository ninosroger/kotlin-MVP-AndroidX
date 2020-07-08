package com.ninos.kotlin_mvp_androidx.base

/**
 * Created by ninos on 2019/1/8.
 */
abstract class PaginationPresenter<M : Any, V : LoadMoreView> : BasePresenter<M, V>() {

    /**
     * 获取数据
     * @param page
     * @param count
     */
    abstract fun getData(page: Int, count: Int)

    /**
     * 设置数据状态
     * @param size
     * @param count
     */
    fun hasMoreData(size: Int, count: Int) =
        if (size < count)
        //没有更多了
            view.noMore()
        else
        //还有更多
            view.hasMore()
}