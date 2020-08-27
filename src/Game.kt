fun main(){
 // Enhancing the Aura
    var healthPoints = 70

    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()
    var playerState = when(karma){
    in 0..5 -> "red"
    in 6..10 -> "orange"
    in 11..15 -> "purple"
    in 16..20 -> "green"
        else->"  "

    }
    println(playerState)

}

