package com.fb.todo.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.fb.todo.R
import com.fb.todo.viewmodel.FinishedTaskViewModel

class FinishedTaskFragment : Fragment() {

    private lateinit var dashboardViewModel: FinishedTaskViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(FinishedTaskViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_finished_task, container, false)

        return root
    }
}