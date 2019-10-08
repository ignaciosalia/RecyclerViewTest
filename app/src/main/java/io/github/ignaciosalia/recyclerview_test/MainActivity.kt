package io.github.ignaciosalia.recyclerview_test

import android.bluetooth.BluetoothAdapter
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.bluetoothfragment.*


//Se extiende la clase FragmentActivity para llamar al fragment y este se infle
class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Al extender la Clase FragmentActivity se llama directo el nombre del fragmento XML
        setContentView(R.layout.bluetoothfragment)

        val button = findViewById<Button>(R.id.soporta)
        button.setOnClickListener{
           soportaBluetooth()
        }


    }

    fun soportaBluetooth(){
        val bluetoothAdapter: BluetoothAdapter?= BluetoothAdapter.getDefaultAdapter()
        //mensaje que imprime si el dispositvo soporte Bluetooth
        Toast.makeText(this,bluetoothAdapter.toString(),Toast.LENGTH_SHORT).show()
    }

}


