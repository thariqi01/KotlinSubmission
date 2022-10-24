package id.infinitelearning.KotlinSubmission.exercise2

fun main() {
    println("---Latihan 1---")
    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    var bilGenap: List<Int>? = listOf()
    for (i in 1..100) {
        if (i % 2 == 0) {                 //Jika i modulo 2 hasilnya 0 maka
            bilGenap = bilGenap?.plus(i)  //Masukkan ke dalam list
        }
    }
    println("Bilangan genap 1 higga 100 : \n$bilGenap")

    println("\n---Latihan 2---")
    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...

    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    val months = mapOf<String,String>(
        "Jan" to "January",
        "Feb" to "February",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sept" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "December"
    )
    months.forEach { (keys, values) -> println("$keys -> $values") }
    println("\nIt's ${months["Oct"]} now, I was born in ${months["Dec"]}")
}