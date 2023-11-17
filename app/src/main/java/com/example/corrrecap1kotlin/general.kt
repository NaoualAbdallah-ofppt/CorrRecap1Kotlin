package com.example.corrrecap1kotlin

abstract  class Materiel (var ref:String,var marque: String)
{
    var prixLoc:Double=0.0
    override fun toString(): String {
        return "Materiel(ref='$ref', marque='$marque', prixLoc=$prixLoc)"
    }

}
interface  IEquip{
    fun getCaracteristiques():String
}


class Ordinateur(ref:String,marque:String, var ram:Int)
    :Materiel(ref,marque), IEquip {
    var dd: String = ""
    var p: String = ""

    constructor(ref: String, marque: String, ram: Int, dd: String, p: String)
            : this(ref, marque, ram) {
        this.dd = dd
        this.p = p
    }

    public override fun getCaracteristiques(): String {
        if (dd.equals("ssd") && ram > 8) {
            return "performant"
        } else {
            return "lourd"
        }

    }

    public fun getCaracteristiques2() =

    when{
        dd.equals("ssd") && ram > 8 -> "performant"
        else ->"lourd"
    }

    override fun toString(): String {
        return "Ordinateur :" +super.toString() + "(ram=$ram, dd='$dd', p='$p')"
    }
    /*  when (dd.equals("ssd") && ram > 8) {

          true -> "performant"
          else -> "lourd"
      }
      */


}
data class Organisme(var nom:String, var categorie: String){
    companion object{
        var lstOrganisme= arrayListOf<Organisme>()
    }
}

class Location(var organisme:Organisme, var dureeLoc:Int)
{
    var id:Int=0
    private var lstOrdinateur= arrayListOf<Ordinateur>()
    companion object{
        var numStatic :Int=0
        fun test(){

        }
    }
    init{
        numStatic++
        id= numStatic
    }

fun addOrdinateur(ord:Ordinateur)
{
    if (lstOrdinateur.size>2)
        throw Exception("Max 3")
    lstOrdinateur.add(ord)
}
    fun getLstOrdinateurs()=lstOrdinateur
    fun montantLocation()=lstOrdinateur.sumOf{it.prixLoc}*dureeLoc
    fun plusCher()=lstOrdinateur.maxBy{it.prixLoc}
    fun lstLeNovo()=lstOrdinateur.filter{it.marque.uppercase().equals("LENOVO")}
    fun nbrLeNovo()=lstLeNovo().size



}