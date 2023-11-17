package com.example.corrrecap1kotlin

abstract  class Materiel2 (){
    var ref:String=""
    var marque: String=""
    var prixLoc:Float=0f
    constructor(ref:String,marque:String,prixLoc:Float):this(){
        this.ref=ref
        this.marque=marque
        this.prixLoc=prixLoc
    }
}
class Ordinateur2(var DD:String, var ram:Int, var P: String)
    :Materiel2() {
    constructor(
        DD: String, ram: Int, P: String,
        ref: String, marque: String, prixLoc: Float
    )
            : this(DD, ram, P) {
                this.marque=marque
                this.ram =ram
                this.prixLoc=prixLoc

    }
}


