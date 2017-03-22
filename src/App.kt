/**
 * Created by tdub86 on 3/22/17.
 * doll delivery version Tracey Wright
 */

class Edge (var startingLocation: String, var endLocation: String, var distance:Int ) {
    //val edges = mapOf<String, Edge>()

//val  edge = mapOf< String, Int>()

    fun dijkstra(startingLocation: String, endLocation: String, edges: List<Map<String, Any>>): Map<String, Any> {
        //get vertices and edges
        return mapOf<String, Int>()


    }

}



fun main(args: Array<String>) {

    val edges = listOf(
            mapOf("startLocation" to "Kruthika's abode",
                    "endLocation" to "Mark's crib", "distance" to 9),
            mapOf("startLocation" to "Kruthika's abode",
                    "endLocation" to "Greg's casa", "distance" to 4),
            mapOf("startLocation" to "Kruthika's abode",
                    "endLocation" to "Matt's Pad", "distance" to 18),
            mapOf("startLocation" to "Kruthika's abode",
                    "endLocation" to "Brian's apartment", "distance" to 8),
            mapOf("startLocation" to "Brian's apartment",
                    "endLocation" to "Wesley's condo", "distance" to 7),
            mapOf("startLocation" to "Brian's apartment",
                    "endLocation" to "Cam's dwelling condo", "distance" to 17),
            mapOf("startLocation" to "Greg's casa",
                    "endLocation" to "Cam's dwelling condo", "distance" to 13),
            mapOf("startLocation" to "Greg's casa",
                    "endLocation" to "Mike's digs", "distance" to 19),
            mapOf("startLocation" to "Greg's's casa",
                    "endLocation" to "Matt's pad", "distance" to 14),
            mapOf("startLocation" to "Wesley's condo",
                    "endLocation" to "Kirks's farm", "distance" to 10),
            mapOf("startLocation" to "Wesley's condo",
                    "endLocation" to "Nathan's flat", "distance" to 11),
            mapOf("startLocation" to "Wesley's condo",
                    "endLocation" to "Bryce's den", "distance" to 6),
            mapOf("startLocation" to "Matt's'pad",
                    "endLocation" to "Mark's crib", "distance" to 19),
            mapOf("startLocation" to "Matt's'pad",
                    "endLocation" to "Nathan's flat", "distance" to 15),
            mapOf("startLocation" to "Matt's'pad",
                    "endLocation" to "Craig's haunt", "distance" to 14),
            mapOf("startLocation" to "Mark's crib",
                    "endLocation" to "Kirk's farm", "distance" to 9),
            mapOf("startLocation" to "Mark's crib",
                    "endLocation" to "Nathan's flat", "distance" to 12),
            mapOf("startLocation" to "Bryce's'den",
                    "endLocation" to "Mike's digs", "distance" to 9),
            mapOf("startLocation" to "Mike's digs",
                    "endLocation" to "Cam's dwellings", "distance" to 20),
            mapOf("startLocation" to "Mike's digs",
                    "endLocation" to "Nathan's flat", "distance" to 12),
            mapOf("startLocation" to "Cam's dwellings",
                    "endLocation" to "Craig's haunt", "distance" to 18),
            mapOf("startLocation" to "Nathan's flat",
                    "endLocation" to "Kirk's farm", "distance" to 3))

    //dijkstra("Kruthika's abode", "craig's haunt", edges:List<Map<String, Any>>)

    println ("Welcome to Doll Delivery, Fast and Fun!")
    println ("Distance =")
}


