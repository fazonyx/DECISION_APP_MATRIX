package com.codinginflow.mvvmtodo.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.codinginflow.mvvmtodo.di.ApplicationScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Provider

@Database(entities = [Task::class], version = 1)
abstract class TaskDatabase : RoomDatabase() {

    abstract fun taskDao(): TaskDao


    class Callback @Inject constructor(
        private val database: Provider<TaskDatabase>,
        @ApplicationScope private val applicationScope: CoroutineScope
    ) : RoomDatabase.Callback() {

        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)

            val dao = database.get().taskDao()

            applicationScope.launch {
                dao.insert(Task("ceci est une tâche"))
                dao.insert(Task("faire du sport", important = true))
                dao.insert(Task("faire les courses", important = true))
                dao.insert(Task("programmer son réveil", completed = true))
                dao.insert(Task("Appeler la famille"))
                dao.insert(Task("Changer les pneus", completed = true))
                dao.insert(Task("Reparer le velo", urgent = true))
                dao.insert(Task("Aller sur la Lune"))
            }
        }
    }
}