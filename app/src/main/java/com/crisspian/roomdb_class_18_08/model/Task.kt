package com.crisspian.roomdb_class_18_08.model

import androidx.annotation.NonNull
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter

@Entity(tableName = "task_table")
data class Task(@PrimaryKey(autoGenerate = true) @NonNull val idTask: Int,
                val task:String,
                val creationDate:String,
                val finishDate:String
                )