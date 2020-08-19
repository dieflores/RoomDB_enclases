package com.crisspian.roomdb_class_18_08.presenter

import android.app.Application
import androidx.lifecycle.LiveData
import com.crisspian.roomdb_class_18_08.database.TaskDataBase
import com.crisspian.roomdb_class_18_08.model.Task
import com.crisspian.roomdb_class_18_08.model.TaskRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class TaskPresenter(application: Application, val iView: IView): IPresenter, CoroutineScope {
    private val mRepository: TaskRepository
    private val allLiveDataTask : LiveData<List<Task>>
    private val job = Job()

    override val coroutineContext: CoroutineContext = job + Dispatchers.IO
      //  get() = TODO("Not yet implemented") ((ya no vá))


    init{
        val taskDao = TaskDataBase.getDatabase(application).getTaskDao()
        mRepository = TaskRepository(taskDao)
        allLiveDataTask = mRepository.mAllTaks
    }

    override suspend fun insertTask(task: Task): Job {
        return launch { mRepository.insertTask(task)
            iView.showToastMessage("Guardando")
        }

        TODO("Not yet implemented")
    }

    override fun getAlltask() {
        iView.showAllTask(allLiveDataTask)

        TODO("Not yet implemented")
    }


}