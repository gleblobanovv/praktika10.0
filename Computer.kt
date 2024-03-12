open class Computer(var frequency1:Double=3600.0,var operativka1:Int=8,var processor_name1:String="Intel"):PC() {
    override var frequency_processor=frequency1
    override var operativka=operativka1
    override var processor_name=processor_name1

    override fun Q():Double{
        var Q:Double=(0.1*frequency_processor)+operativka
        return Q
    }

    override fun Qp(): Double {
        return 0.0
    }
    fun Input(){
        println("Введите наименование процессора")
        processor_name= readLine()!!.toString()
        println("Введите частоту процессора")
        frequency_processor= readLine()!!.toDouble()
        println("Введите объем оперативной памяти")
        operativka= readLine()!!.toInt()
    }

}