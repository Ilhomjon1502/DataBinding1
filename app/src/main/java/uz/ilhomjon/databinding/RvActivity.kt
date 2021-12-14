package uz.ilhomjon.databinding

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import uz.ilhomjon.Adapter.ContactAdapter
import uz.ilhomjon.databinding.databinding.ActivityRvBinding
import uz.ilhomjon.databinding.models.Contact

class RvActivity : AppCompatActivity() {
    lateinit var binding:ActivityRvBinding
    lateinit var list:ArrayList<Contact>

    lateinit var contactAdapter:ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadContacts()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_rv)

        contactAdapter = ContactAdapter(list)
        binding.rv.adapter = contactAdapter
    }

    private fun loadContacts() {
        list = ArrayList()
        for (i in 0..100){
            list.add(Contact("Ilhomjon $i", "+998991233456$i"))
        }
    }
}