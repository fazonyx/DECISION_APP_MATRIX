package com.codinginflow.mvvmtodo.matrix

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.codinginflow.mvvmtodo.R
import com.codinginflow.mvvmtodo.ui.MainActivity
import com.codinginflow.mvvmtodo.ui.matrixinterface.MatrixFragmentINU
import com.codinginflow.mvvmtodo.ui.matrixinterface.MatrixFragmentIU
import com.codinginflow.mvvmtodo.ui.matrixinterface.MatrixFragmentNINU
import com.codinginflow.mvvmtodo.ui.matrixinterface.MatrixFragmentNIU
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main_matrix.*
import kotlinx.android.synthetic.main.fragment_important_urgent.*


class MainMatrix : AppCompatActivity() {
    lateinit var drawer: DrawerLayout
    lateinit var toggle: ActionBarDrawerToggle
    lateinit var navView: NavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_matrix)

        drawer = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.nav_view)

        floatingActionButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btn_urgent_important.setOnClickListener {
            val intent = Intent(this, MatrixFragmentIU::class.java)
            startActivity(intent)
        }
        btn_urgent_n_important.setOnClickListener {
            val intent = Intent(this, MatrixFragmentNIU::class.java)
            startActivity(intent)
        }
        btn_n_urgent_important.setOnClickListener {
            val intent = Intent(this, MatrixFragmentINU::class.java)
            startActivity(intent)
        }
        btn_n_urgent_n_important.setOnClickListener {
            val intent = Intent(this, MatrixFragmentNINU::class.java)
            startActivity(intent)
        }
        floatingActionButtonSettings.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }

        fun onNavigationItemSelected(item: MenuItem): Boolean {
            when (item.itemId) {
                R.id.nav_parameter -> {
                    Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, Settings::class.java)
                    startActivity(intent)
                }
                R.id.nav_explanations -> {
                    Toast.makeText(this, "Not important and not urgent clicked", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_NINU -> {
                    Toast.makeText(this, "Explanations clicked", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MatrixFragmentNINU::class.java)
                    startActivity(intent)
                }
                R.id.nav_NIU -> {
                    Toast.makeText(this, "Not important and urgent clicked", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MatrixFragmentNIU::class.java)
                    startActivity(intent)
                }
                R.id.nav_IU -> {
                    Toast.makeText(this, "Important and urgent clicked", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MatrixFragmentIU::class.java)
                    startActivity(intent)
                }
                R.id.nav_INU -> {
                    Toast.makeText(this, "Important and Not urgent clicked", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MatrixFragmentINU::class.java)
                    startActivity(intent)

                }
            }
            drawer.closeDrawer(GravityCompat.START)
            return true
        }

    }










}