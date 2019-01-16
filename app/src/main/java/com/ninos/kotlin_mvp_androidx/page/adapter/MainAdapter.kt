package com.ninos.kotlin_mvp_androidx.page.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ninos.kotlin_mvp_androidx.R
import com.ninos.kotlin_mvp_androidx.base.BaseAdapter
import com.ninos.kotlin_mvp_androidx.presenter.MainPresenter

/**
 * Created by Administrator on 2018/3/31.
 */
class MainAdapter(context: Context) : BaseAdapter<MainAdapter.VHolder, String, MainPresenter>(context) {
    override fun provideItemLayoutId() = R.layout.adapter_main

    override fun createVH(parent: ViewGroup, viewType: Int, view: View): VHolder = VHolder(view)

    override fun bindData(holder: VHolder, position: Int) {
        var item = data[position]
    }

    inner class VHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tvTitle: TextView = view.findViewById(R.id.tv_title)
    }
}