package com.fb.todo.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "to_do")
data class Todo(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val content: String,
    val dateStart: Int,
    val dateEnd: Int,
    val isDone: Boolean
)