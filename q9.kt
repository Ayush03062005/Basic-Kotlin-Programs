
//Q9
fun main()
{
    fun table(a:Int)
    { var res:Int
        for(i in 1..10)
        {
            res=a*i
            println("$a X $i = $res")
        }
    }
    println(table(9))
}
