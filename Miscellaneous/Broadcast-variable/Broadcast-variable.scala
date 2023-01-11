// Import Data
val raw =  scala.io.Source.fromURL("https://raw.githubusercontent.com/fermat01/Data-analytics-using-spark-scala/master/Movielens/users.dat").mkString

val list = raw.split("\n").filter(_ != "")

val rdd = sc.parallelize(list)

// Define Broadcast variable

val BroadcastVar = sc.broadcast(rdd.collect())

// Print the value

BroadcastVar.value
