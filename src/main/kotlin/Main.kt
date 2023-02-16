fun main(){
   hello("Ann",25)
    schoolName()
  cut("I love sweets")
vary("JOY")

}
fun schoolName():String{
    var name = "Akirachix"
    var full=(name[0].toString() +name[2] +name[3])
    return full


}
fun hello(name :String,Ages  :Int):String{
    var printout="Hi my name is $name and i am $Ages years old"
    return printout


}
fun cut(name: String):Int{
    val result=( name.length)
    return result
}
fun vary(name :String){
    val x="JOY"
    if(x.equals(name))
        println("That's me")
    else
        println("I don't know who that is")

}

