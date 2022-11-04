package Pertemuan1
    fun main(){

        // Tipe data String
        val nama : String = " Adi"
        val namabelakang : String = " Sucipto"
        val umur : Int = 18

        println("Nama Saya " + nama + namabelakang + " umur saya " + umur)
        val result = "Nama saya $nama $namabelakang umur saya $umur"
        println(result)

        // Tipe data int
        val byte : Byte = 100
        val short : Short = 10000
        val long = 100
        println()

        //Bilangan Pecahan
        val float : Float = 15.500F
        val double : Double = 25.2442

        //tipe data char
        var char = 'A'
        char = 'B'

        val biodata = """
          Assalamualaikum
          Nama saya Adi Sucipto
          
        """.trimIndent()

        println()
        println()

        //Tipe data boolean
        val nilaiBenar = true
        val nilaiSalah = false



    }
