fun main() {
    var myPleace: Home = Home ("")
    myPleace.setHome("")
    var check: String = myPleace.getHome()
    println(check)

    var myTran : Transportation = Transportation ("")
    myTran.setTransportation ("Car")
    var check1: String = myTran.getTransportation ()
    println(check1)

    var myPro : Products = Products("")
    myPro.setProducts("Computer")
    var check2: String = myPro.getProducts()
    println(check2)

    var myAnimal : Animal = Animal("")
    myAnimal.setAnimal("Dog")
    var check3: String = myAnimal.getAnimal()
    println(check3)

    var myClass : ClassOfMobileApp2 = ClassOfMobileApp2("")
    myClass.setClassOfMobileApp2 ("")
    var check4: String = myClass.getClassOfMobileApp2()
    println(check 4)
}
class ClassOfMobileApp2 {
    var generation: String = ""
    var purpose: String = ""
    var size: String = ""
    var type: String = ""
    var usage: String = ""

    constructor(usage: String) {
        this.usage = usage
    }

    fun getClassOfMobileApp2(): String {
        return this.usage
    }

    fun classOfMobileApp2 (usage: String) {
        this.usage = usage
    }

}
class Menu {
    var placeName: String = ""
    var foodPrice: Int = 0
    var foodil: Boolean = False
    var foodId: Int = 0
    var foodDelivery: String = ""

    constructor(placeName: String) {
        this.placeName = placeName
    }

    fun getMenu(): String {
        return this.placeName
    }

    fun setMenu(placeName: String) {
        this.placeName = placeName
    }


}
class Transportation{
    var airways: String = ""
    var waterways: String = ""
    var subways: String = ""
    var landways: String = ""
    var submarine: String = ""

    constructor(landways: String) {
        this.landways = landways
    }

    fun getTransportation(): String {
        return this.landways
    }

    fun setTransportation(landways: String) {
        this.landways = landways
    }

}

class Products {
    var productsName: String = ""
    var productsWeight: Double = 0.0
    var productsId: Int = 0
    var productsPrice: Double = 0.0
    var productsStock: Boolean = True

    constructor(productsName: String) {
        this.productsName = productsName
    }

    fun getProduct(): String {
        return this.productsName
    }

    fun setProducts(productsName: String) {
        this.productsName = productsName
    }

}

class Animal {
    var name: String = ""
    var age: Int = 0
    var species: String = ""
    var color: String = ""
    var habitat: String = ""

    constructor(species: String) {
        this.species = species
    }

    fun getAnimal(): String {
        return this.species
    }

    fun setAnimal(species: String) {
        this.species = species
    }
}


