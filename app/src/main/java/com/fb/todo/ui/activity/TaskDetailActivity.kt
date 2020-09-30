package com.fb.todo.ui.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.fb.todo.R
import com.fb.todo.viewmodel.TaskDetailViewModel

class TaskDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_detail)

        val model: TaskDetailViewModel by viewModels()

    }
}