fun main(){
    fruits()
   city()
    numerics()
   println(fancy("Pauline","Simiyu","Christine"))




 }
fun fruits(){
    var names= arrayOf("Papaya","Mango","Watermelon", "Orange")
    println(names.contentToString())


}
fun city(){
    val cities= arrayOf("harare", "mumbai","dodoma" ,"jakarta")
    for(city in cities)
        println(city.capitalize())



}
fun numerics() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    println(numbers[3]+numbers[6])
    println(numbers.indexOf(158))
   var numbersorted=numbers.sortedArray()
    println(numbersorted.contentToString())
}
fun fancy(name1: String,name2: String,name3:String) :String{
    var names= arrayOf(name1,name2,name3)
    return (names.contentToString())

}