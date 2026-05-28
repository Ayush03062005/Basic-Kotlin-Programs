
//Q7
fun main()
{
    fun largest(a:Int, b:Int, c:Int):Int
    {
        if(a>=b && a>=c){return a}
        else if(b>=a && b>=c){return b}
        else{return c}
    }
    println(largest(2,4,5))
}
