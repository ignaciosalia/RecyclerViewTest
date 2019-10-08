package io.github.ignaciosalia.recyclerview_test

import android.bluetooth.BluetoothAdapter
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bluetoothfragment.view.*

class BluetoothInfoFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        //inflater del fragment
        return super.onCreateView(inflater, container, savedInstanceState)
    }


}



/**Validando si el dispositivo es compatible con Bluetooth
fun soportaBluetooth(view: View){
    val bluetoothAdapter: BluetoothAdapter?= BluetoothAdapter.getDefaultAdapter()
    //mensaje que imprime si el dispositvo soporte Bluetooth
    Toast.makeText(view.context,bluetoothAdapter.toString(),Toast.LENGTH_SHORT).show()

}*/