fun main() {
    sentence("Barnie bakes brown bagels and buns")
  sumCountAverage(arrayOf(10,20,30))
    println(volume(14,3.24159))


}
fun sentence(words:String){
    println(words)

}
fun sumCountAverage(calculation:Array<Int>){
    println(calculation.sum())
    println(calculation.count())
    println(calculation.average())
}
fun volume(r:Int, t:Double){
    var v=4/3*r*r*r*3.14159
    println(v)
}






