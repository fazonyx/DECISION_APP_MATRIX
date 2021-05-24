package com.codinginflow.mvvmtodo.matrix

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate
import com.codinginflow.mvvmtodo.R
import kotlinx.android.synthetic.main.activity_main_matrix.*
import kotlinx.android.synthetic.main.activity_settings.*
import kotlin.system.exitProcess

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        button_set_red_yellow_green_white.setOnClickListener {
            btn_urgent_important.setBackgroundColor(Color.RED)
            btn_n_urgent_important.setBackgroundColor(Color.YELLOW)
            btn_urgent_n_important.setBackgroundColor(Color.GREEN)
            btn_n_urgent_n_important.setBackgroundColor(Color.WHITE)
        }

        button_set_red_pink_teal_white.setOnClickListener {
            btn_urgent_important.setBackgroundColor(Color.RED)
            btn_n_urgent_important.setBackgroundColor(Color.CYAN)
            btn_urgent_n_important.setBackgroundColor(Color.MAGENTA)
            btn_n_urgent_n_important.setBackgroundColor(Color.WHITE)
        }
        button_set_red_red_light_green_white.setOnClickListener {
            btn_urgent_important.setBackgroundColor(Color.RED)
            btn_n_urgent_important.setBackgroundColor(Color.GREEN)
            btn_urgent_n_important.setBackgroundColor(Color.MAGENTA)
            btn_n_urgent_n_important.setBackgroundColor(Color.WHITE)
        }
        button_self_destruct.setOnClickListener{
            exitProcess(-1)
        }
        switch_dark_mode.setOnCheckedChangeListener{_, isChecked ->
            if(isChecked){
                switch_dark_mode.text = "Night Mode ON"
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                delegate.applyDayNight()

            }
            else {
                switch_dark_mode.text = "Light Mode ON"
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

            }
        }
        button_learn_more_matrix.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://en.wikipedia.org/wiki/Time_management")
            startActivity(intent)
        }

    }


}