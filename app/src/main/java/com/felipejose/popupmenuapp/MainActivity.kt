package com.felipejose.popupmenuapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupMenu

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = findViewById<Button>(R.id.botao) as Button
        val fundo = findViewById<LinearLayout>(R.id.fundo) as LinearLayout

        botao.setOnClickListener {
            val popMenu = PopupMenu(this@MainActivity, botao)
            popMenu.menuInflater.inflate(R.menu.menu_pop,popMenu.menu)
            popMenu.setOnMenuItemClickListener(object : PopupMenu.OnMenuItemClickListener{
                override fun onMenuItemClick(item: MenuItem?): Boolean {
                    when(item!!.itemId){
                        R.id.corVermelho -> fundo.setBackgroundColor(Color.parseColor("#FF0000"))

                        R.id.corPreto -> fundo.setBackgroundColor(Color.parseColor("#000000"))

                        R.id.corOuro -> fundo.setBackgroundColor(Color.parseColor("#FFD700"))
                    }
                    return true
                }
            })
            popMenu.show()
        }
    }
}
