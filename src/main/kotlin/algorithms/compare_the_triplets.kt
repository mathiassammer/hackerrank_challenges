package algorithms

fun main() {
    compareTriplets(arrayOf(1,2,3), arrayOf(3,2,1)).contentToString() // retorno [1, 1]
}


fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var pointsEarnedMaria: Int = 0
    var pointsEarnedJoao: Int = 0

    for (i in 0..2) {
        if (a.get(i) > b.get(i)) ++ pointsEarnedMaria
        else if (a.get(i) < b.get(i)) ++ pointsEarnedJoao
    }

    return arrayOf(pointsEarnedMaria, pointsEarnedJoao)
}