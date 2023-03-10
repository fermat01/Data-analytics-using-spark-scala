val raw =  scala.io.Source.fromURL("https://raw.githubusercontent.com/fermat01/Data-analytics-using-spark-scala/master/Movielens/users.dat").mkString

val list = raw.split("\n").filter(_ != "")

val rdd = sc.parallelize(list)

// Define Accumulator

val genderCount = sc.longAccumulator("Gender Accumulator")

// Compute Accumulator

rdd.foreach( x => if(x.contains("F")){genderCount.add(1L)})

// Print the value

println(genderCount.value)
