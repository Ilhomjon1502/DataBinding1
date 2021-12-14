package uz.ilhomjon.databinding

import android.view.View
import android.widget.Toast

class MyHandler {
    
    fun delete(view:View){
        Toast.makeText(view.context, "Click", Toast.LENGTH_SHORT).show()
    }
}