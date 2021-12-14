package uz.ilhomjon.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import uz.ilhomjon.databinding.databinding.ActivityMainBinding
import uz.ilhomjon.databinding.models.Employee

class MainActivity : AppCompatActivity() {

//    link documentation: https://startandroid.ru/ru/courses/architecture-components/27-course/architecture-components/552-urok-19-android-data-binding-vozmozhnosti.html

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        var list = ArrayList<String>()
        list.add("Play foodball")
        list.add("swimming")
        list.add("watch tv")

        val nameObj = ObservableField<String>()

        val employee = Employee(1, nameObj, "", 1500.0, list)

        employee.avatar = "https://storage.kun.uz/source/thumbnails/_medium/8/GvaVSxUB2L0sRA1iJ7n-j0DU5Lel3YSd_medium.jpg"

        binding.employee = employee

        val myHandler=MyHandler()
        binding.myHandler = myHandler

        //obektni yangilash
        binding.invalidateAll()
    }
}