
package com.example.comida_lista

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.text.Selection
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.NestedScrollingParent
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var lvComida:ListView?= null
    private var tvseleccion:TextView?=null
    private val Comidas=arrayOf("Comida1","Comida2","Comida3","Comida4","Comida5","Comida6","Comida7","Comida8","Comida9","Comida10")
    private val Descripcion= arrayOf("Descripcion", "1","2","3","4","5","6","7","8","9","10")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        lvComida=findViewById(R.id.listView)
        tvseleccion=findViewById(R.id.Asignacion)
        var adaptador:ArrayAdapter<String>  = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Comidas)
        lvComida?.adapter=adaptador
        lvComida?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tvseleccion?.text="Descripcion de ${lvComida?.getItemIdAtPosition(position)}  esta  ${Descripcion[position]}"            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }
}