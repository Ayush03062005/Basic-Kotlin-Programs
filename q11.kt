//Q11
fun main()
{
    fun sum_digits(a:Int):Int
    {
        var n=a
        var d:Int
        var s=0
        while(n!=0)
        {
            d=n%10
            s=s+d
            n=n/10
        }
        return s
    }
    
    println(sum_digits(12))
}
