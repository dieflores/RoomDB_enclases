package com.crisspian.roomdb_class_18_08.presenter

import com.crisspian.roomdb_class_18_08.model.Task

interface IPresenter {

   suspend fun insertTask(task : Task)
    fun getAlltask()
}