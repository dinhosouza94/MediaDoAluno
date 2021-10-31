fun main(args: Array<String>) {

    var nota= 0.0
    var nota1 = 0.0
    var nota2 = 0.0
    var nota3 = 0.0

    println("digite a nota 1: ")
    nota = readLine()!!.toDouble()
    println("digite a nota 2: ")
    nota1 = readLine()!!.toDouble()
    println("digite a nota 3: ")
    nota2 = readLine()!!.toDouble()
    println("digite a nota 4: ")
    nota3 = readLine()!!.toDouble()

    var média = (nota + nota1 + nota2 + nota3)/4

    if(média >= 0 &&  média <= 4 ){
        println("sua média é $média , REPROVADO.")
    }else if(média > 4 &&  média <= 7 ){
        println("sua média é $média , APROVADO.")
    }else if(média >= 7 &&  média <=10 ){
        println("sua média é $média , PARABÉNS, APROVADO.")
    }else{
        println("numero inválido.")
    }



}