//Q14
fun main()
{
    fun all_prime(a:Int)
    {
        for(i in 1..a)
        {var c=0
            for(j in 1..i)
            {
                if(i%j==0)
                {c++}
            }
            if(c==2)
            {println(i)}
        }
    }
    all_prime(10)
}
