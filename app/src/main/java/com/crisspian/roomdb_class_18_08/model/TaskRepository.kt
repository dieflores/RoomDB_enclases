package com.crisspian.roomdb_class_18_08.model

import androidx.lifecycle.LiveData
import com.crisspian.roomdb_class_18_08.database.TaskDao

class TaskRepository(private val mTaskDao: TaskDao) {

    //1. Este value va a contener todos los task desde la base de datos
    val mAllTaks: LiveData<Task> = mTaskDao.getAllTask()

    //2. Esta función va a comunicarse con el DAO y va a insertar la base de datos
    suspend fun insertTask(task: Task) {
        mTaskDao.insertTask(task)
    }


}