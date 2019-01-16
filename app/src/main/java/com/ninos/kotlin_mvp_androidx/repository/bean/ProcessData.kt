package com.ninos.kotlin_mvp_androidx.repository.bean

data class ProcessData<T>(
    var code: Int,
    var message: String,
    var content: T?
)