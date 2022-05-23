import java.security.KeyStore.TrustedCertificateEntry

fun main() {
  var name:String="Mellisa Wanjiru"
    println(name)
    var age:Int=23
    println(age)
    var phonenumber:String="07584563726"
    println(phonenumber)
    var weight:Int=45
    println(weight)
    var citizen:Boolean=true
    println(citizen)

    hello("Esther")
    var division=remainder(9,2)
    println(division)

    var add=sum(3,10,5,20)
    println(add)

    interesting("dancing")
    institute()

    var state=statement("Esther Mellisa", 24)
    println(state)

    var length=string("Lark")
    println(length)

    var word=string("Mellisa Esther")
    println(word)

    var r=loop("Mellisa")
    println(r)

    string()

    var module=remainder1(20,6)
    println(module)

    var id=myself("Esther", 20)
    println(id)

    var find=len("Wanjiru")
    println(find.length)

    take("Mellisa","Esther","Lark","Wanjiru")

    twoword()

    array()
    var na=threenames(arrayOf("Mellisa", "Esther", "Wanjiru"))
    var names=name
    println(na.contentToString())
}
fun hello(names:String){
    var h=("Hello ${names}")
    println(h)
}
fun remainder(number1:Int, number2:Int):Int{
    var division=number1%number2
    return (division)
}
fun sum(num3:Int,num4:Int,num5:Int,num6:Int):Int{
    var add=num3+num4+num5+num6
    return add
}
fun interesting(word:String){
    var fact=("My name is Mellisa Esther and i love $word.")
    println(fact)
}

//Given a string “akirachix”. Write a function that prints out a string composed of
//the first, third and fourth characters of the string

fun institute(){
    var place="Akirachix"
    var count=(place[1].toString()+place[3]+place[4])
    println(count)
}
//Write a function that takes in 2 parameters, name and age and returns a
//String with this structure “Hi, my name is x and I am y years old.” Where x and
//y are the provided name and age respectively.
fun statement(name:String, age:Int):String{
    var state="Hi, my name is $name and i am $age years old."
    return state
}
//Write a function that takes in a String and returns its length
fun string(word:String):Int{
    return word.length
}
//Write a function that takes in a name and prints out “That’s me!” when your
//name is passed to it, otherwise it prints out “I don’t know who that is”
fun loop(name:String){
   if(name=="Mellisa"){
       println("That's me")
   }
    else{
        println("I don't know who that is")
   }
}
//Given a string “codeHive”. Write a function that prints out a string composed
//of the fifth, sixth, seventh and eighth  characters of the string
fun string(){
    var name="codeHive"
    println(name[5].toString()+name[6]+name[7])
}
//Create and invoke a function that given two numbers returns the
//remainder of their division

fun remainder1(a:Int,b:Int):Int{
    var module=a%b
    return module
}
//Write a function that takes in two parameters, name and age and returns a
//String with this structure “Hi, my name is p and I am z years old.” Where p
//and  z are your  name and age respectively.
fun myself(name:String,age:Int):String{
    var id=("Hi, my name is $name nd I am $age years old.")
    return id
}
//Write a function that takes in a string and returns its length
fun len(iword:String):String{
    var find=iword
    return find
}
//Create a function that takes in 4 strings  and creates an array out of them then
//prints out the array
fun take(nam:String,nam2:String,nam3:String,nam4:String){
    var it=arrayOf(nam,nam2,nam3,nam4)
    println(it.contentToString())
}
//Create a function that given an array below:
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.


fun twoword(){
    var cities= arrayOf("harare", "mumbai","dodoma","jakarta")
   cities.forEach {cities->
       println(cities.capitalize())
   }
}
//Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements
//ii) prints out the index of 158
//(iii) prints out the elements in ascending order
 fun array(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var add=numbers[2]+numbers[5]
    println(add)

    var sort=numbers.indexOf(158)
    println(sort)

    var ascend=numbers.sortedArray()
    println(ascend.contentToString())
 }
//Create a function that takes in 3 names and returns a string array containing
//all 3 names
fun threenames(name:Array<String>):Array<String>{
    return(name)

}