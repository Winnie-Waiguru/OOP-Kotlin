fun main() {
    var person= Human("Miriam Atieno", 34, 65)
    person.eat(4)
    println(person.weight)
    person.speak("I am in a meeting ")
    person.birthday()

    var migrant= User("Louis","Dos","louisdos@gmail.com","+(1)324577898", "loui@898" )
    println(migrant.email)
    println(migrant.password)

}

class Human(var name:String, var age: Int, var weight:Int){

    fun eat(FoodWeight:Int):Int{
        weight+= FoodWeight
        println("I am eating $FoodWeight kgs of food")
        return weight
    }

    fun speak(speech:String){
        print(speech)

    }

    fun birthday(){
        age ++
        println(age)
    }
}

data class User(var firstName:String, var lastName:String, var email:String, var phoneNumber:String, var password:String){

}

