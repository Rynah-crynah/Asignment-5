fun main(){
   var myLove = Human("Suhaila", 23, 62)
    myLove.eat(2)
    println(myLove.weight)
    myLove.speak("Arabic")
    myLove.birthday()
    var myFavourite = Human("Suheil",19,72)
    myFavourite.eat(2)
    println(myFavourite.weight)
    myFavourite.speak("Italian")
    myFavourite.birthday()

    var myKihandhrii = User("Shamun","Yusuf","shamunyusufshamun@gmail.com","0700874576","Hakan1205")
    println(myKihandhrii.firstName)
    println(myKihandhrii.phoneNumber)



}
// 1.Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//-eat(foodWeight: Int) :Prints “I am eating {foodWeight}kgs of food”
//and increments the human’s weight by the weight of the food eaten
//-speak(speech: String) :Prints the string passed to it
//Create an instance of this human class and invoke all its functions

class Human (var name: String, var age: Int, var weight: Int) {
    fun eat(foodWeight: Int) {
        weight += foodWeight
        println("I am eating $foodWeight kgs of food")

    }

    fun speak(speech: String) {
        println(speech)

    }

    fun birthday() {
        age += 1
        println(age)
    }
}
//Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User  and print out any 2
//attributes

data class User(var firstName: String, var lastName: String, var email: String, var phoneNumber: String, var password: String)

