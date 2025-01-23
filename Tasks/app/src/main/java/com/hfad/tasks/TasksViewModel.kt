package com.hfad.tasks

import androidx.lifecycle.ViewModel

class TasksViewModel(val dao: TaskDao) : ViewModel() {
    var newTaskName = ""

    fun addTask() {
        val task = Task()
        task.taskName = newTaskName
        dao.insert(task)
    }
}