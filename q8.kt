
//Q8
fun main()
{
    fun digits(a:Int):Int
    {
        var d=0
        var n=a
        while(n!=0)
        {
            d++
            n=n/10

        }
        return d
    }
    println(digits(3546))
}
