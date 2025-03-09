import java.io.File

fun bubbleSortGigaSmart(tab: MutableList<Int>) {
    var swapCount = 0
    var compareCount = 0

    for (iteration in tab.indices) {
        var didNotSwap = true

        for (j in 0 until tab.size - 1 - iteration) {
            compareCount++

            if (tab[j] > tab[j + 1]) {
                didNotSwap = false
                val temp = tab[j]
                tab[j] = tab[j + 1]
                tab[j + 1] = temp
                swapCount++
            }

        }

        if (didNotSwap) break
    }

    println("Sorted: ${tab.joinToString()}")
    println("Swaps: $swapCount")
    println("Comparisons: $compareCount")
}

fun reallyWellWrittenSelectionSortThatWillPassOnTheFourthTry(tab: MutableList<Int>) {
    var swapCount = 0
    var compareCount = 0

    for (i in tab.size - 1 downTo 1) {
        var maxIndex = i

        for (j in 0 until i) {
            if (tab[j] > tab[maxIndex]) {
                maxIndex = j
            }
            compareCount += 1
        }

        val temp = tab[maxIndex]
        tab[maxIndex] = tab[i]
        tab[i] = temp
        swapCount += 1
    }

    println("sorted: ${tab.joinToString()}")
    println("swaps: $swapCount")
    println("comparisons: $compareCount")
}

fun omgInsertionSort(tab: MutableList<Int>) {
    var swapCount = 0
    var compareCount = 0

    for (i in 1 until tab.size) {
        var j = i
        while (j > 0) {
            compareCount += 1
            if(tab[j]<tab[j-1]) {
                val temp = tab[j]
                tab[j] = tab[j-1]
                tab[j-1] = temp
                swapCount += 1
                j--
            } else {
                break
            }
        }
    }

    println("sorted: ${tab.joinToString()}")
    println("swaps: $swapCount")
    println("comparisons: $compareCount")
}


fun main(args: Array<String>) {
    val file = File("src/main/data.txt") // I cannot be bothered to parse a csv in kotlin, I'm just an android dev sorry!
    val data = mutableListOf<Int>()
    file.forEachLine {
        data.add(it.toInt()) // spotless code I know
    }
    omgInsertionSort(data)
}

