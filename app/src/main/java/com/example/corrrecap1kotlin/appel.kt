package com.example.corrrecap1kotlin

fun main()
{
    val o1 = Ordinateur("oo1","LeNovo",32,"ssd","i5")
    o1.prixLoc=500.0
    val o2 = Ordinateur("oo2","Acer",16,"ide","i7")
    o2.prixLoc=500.0
    val o3 = Ordinateur("oo3","LeNovo",8,"ssd","i5")
    o3.prixLoc=500.0
    val org=Organisme("ofppt","edu")
    val loc1=Location(org,5)
    loc1.addOrdinateur(o1)
    val loc2=Location(org,5)
    loc2.addOrdinateur(o1)
    loc2.addOrdinateur(o2)
  //  loc2.addOrdinateur(o3)
    println("id loc1 : ${loc1.id}")
    println("id loc2 : ${loc2.id}")
    println("Liste des ordinateurs")
for (x  in loc2.getLstOrdinateurs())
{
    println(x.toString())
}
    println("Liste des ordinateurs lenovo")
    for (x  in loc2.lstLeNovo())
    {
        println(x.toString())
    }
    println("Nombre de lenovo")
    println("nombre est :${loc2.nbrLeNovo()}" )
    println("l'ordinateur le plus cher :${loc2.plusCher()}" )
    println("Le montant est :${loc2.montantLocation()}" )


}