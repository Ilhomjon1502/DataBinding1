package uz.ilhomjon.databinding.models

import androidx.databinding.ObservableField

class Employee {
    var id:Int? = null
    var name:ObservableField<String>? = ObservableField()
    var address:String? = null

    var salary:Double? = null

    var hobbies:List<String>? = null

    var avatar:String? = null

    constructor(
        id: Int?,
        name: ObservableField<String>?,
        address: String?,
        salary: Double?,
        hobbies: List<String>?
    ) {
        this.id = id
        this.name = name
        this.address = address
        this.salary = salary
        this.hobbies = hobbies
    }
}