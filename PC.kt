abstract class PC ():interf{
    abstract var processor_name:String
    abstract var frequency_processor:Double
    abstract var operativka: Int
    abstract fun Q():Double
    abstract fun Qp():Double

    override fun info(){
        println("Наименование процессора: $processor_name," +
                " частота обновления: $frequency_processor (МГц)," +
                " объем оперативной памяти: $operativka (Мб)," +
                " Q="+Q())
    }

}