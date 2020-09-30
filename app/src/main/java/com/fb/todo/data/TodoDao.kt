package com.fb.todo.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TodoDao {

    @Query("SELECT * FROM to_do")
    fun getAll(): LiveData<List<Todo>>

    @Query("SELECT * FROM to_do WHERE id =:id")
    fun getTaskById(id: Int): LiveData<Todo>

    @Query("SELECT * FROM to_do WHERE isDone=1")
    fun getFinishedTasks(): LiveData<List<Todo>>

    @Insert
    fun insert(list: List<Todo>)

    @Delete
    fun delete()
}