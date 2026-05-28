//Q10
fun main()
{
    fun check(c:Char):String
    {
        val ch = c.uppercaseChar()
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){return "Vowel"}
        else{return "consonant"}
    }
    println(check('W'))
}
