//Q3
fun main()
{
    fun sum(n:Int):Int{
        var s=0
        for(i in 1..n)
        {
             s=s+i
        }
        return s
    }
    print(sum(5))
}
