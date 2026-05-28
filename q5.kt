
//Q5
fun main()
{
    val a=565
       var rev=0
        var d:Int
        var num=a
        while(num!=0)
        {
            d=num%10
            rev=rev*10+d
            num=num/10
        }
        
        if(a==rev)
    {
        println("Palindrome!")
    }
    
else
    {
        println("Not Palindrome!")
    }
}
