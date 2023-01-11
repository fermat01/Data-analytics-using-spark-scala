
val raw =  scala.io.Source.fromURL("https://raw.githubusercontent.com/fermat01/Data-analytics-using-spark-scala/master/Movielens/users.dat").mkString

val list = raw.split("\n").filter(_ != "")

val rdd = sc.parallelize(list)

val Data = rdd.toDF

Data.head()



