package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    try {
        val result = 100/0
        print(result)
    } catch (x: ArithmeticException) {
        print("Some error caught : $x \n")
    } finally {
        print("This is a finally block (finally block always executed)")
    }

}