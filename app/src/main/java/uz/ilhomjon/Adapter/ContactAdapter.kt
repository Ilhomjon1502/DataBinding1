package uz.ilhomjon.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import uz.ilhomjon.databinding.R
import uz.ilhomjon.databinding.databinding.ItemRvBinding
import uz.ilhomjon.databinding.models.Contact

class ContactAdapter(val list: List<Contact>) : RecyclerView.Adapter<ContactAdapter.Vh>() {

    inner class Vh(var itemRv: ItemRvBinding) : RecyclerView.ViewHolder(itemRv.root) {
        fun onBind(contact : Contact) {
            itemRv.contact = contact
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        val itemRvBinding = DataBindingUtil.inflate<ItemRvBinding>(LayoutInflater.from(parent.context), R.layout.item_rv, parent, false)
        return Vh(itemRvBinding)
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}