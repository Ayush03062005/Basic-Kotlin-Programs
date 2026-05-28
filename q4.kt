
//Q3
fun main()
{
    fun reverse(a:Int):Int{
       var rev=0
        var d:Int
        var num=a
        while(num!=0)
        {
            d=num%10
            rev=rev*10+d
            num=num/10
        }
        return rev
    }
    println(reverse(365))
}
