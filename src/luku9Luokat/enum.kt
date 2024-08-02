fun main() {
    for (i in Priority.entries) {
        println("${i.ordinal} : ${i.name}")
    }
}
//Test
enum class Priority {
    LOW,
    MEDIUM,
    HIGH
}