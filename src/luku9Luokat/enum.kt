fun main() {
    for (i in Priority.entries) {
        println("${i.ordinal} : ${i.name}")
    }
}

enum class Priority {
    LOW,
    MEDIUM,
    HIGH
}