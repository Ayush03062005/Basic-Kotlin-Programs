//Q15
fun main()
{
    var a=0
    var b=1
    val n=10
    var c:Int
    println(a)
    println(b)
    for(i in 1..n-2)
    {
        c=a+b
        println(c)
        a=b
        b=c
    }
}
