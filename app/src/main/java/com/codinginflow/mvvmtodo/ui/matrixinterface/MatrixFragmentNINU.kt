package com.codinginflow.mvvmtodo.ui.matrixinterface

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.codinginflow.mvvmtodo.R
import com.codinginflow.mvvmtodo.ui.MainActivity

import kotlinx.android.synthetic.main.fragment_not_important_not_urgent.*


class MatrixFragmentNINU : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_not_important_not_urgent)

        fab_add_task_NINU.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }


}