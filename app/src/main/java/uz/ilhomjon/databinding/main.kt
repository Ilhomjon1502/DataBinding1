package uz.ilhomjon.databinding

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingConversion
import com.squareup.picasso.Picasso

@BindingAdapter("app.url") // xml da app:url bilan chaqirish mumkin
fun loadImage(view: ImageView, url: String) {
    Picasso.get().load(url).into(view)
}

@BindingConversion
fun getHobbies(list: List<String>):String{
    val stringBuilder = StringBuilder()
    list.forEach {
        stringBuilder.append(it)
    }
    return stringBuilder.toString()
}