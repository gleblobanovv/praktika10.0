class Frequency_Vinchester(var P:Double,var Q:Double,var Qp:Double) : Computer() {

    override fun Qp():Double{
        println("Введите объем винчестера (Гб)")
        P= readLine()!!.toDouble()
        Qp=0.0
        Qp=Q+(0.5*P)
        return  Qp
    }

}