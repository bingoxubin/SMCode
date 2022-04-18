package com.bingoabin.spark

import org.apache.spark.{SparkConf, SparkContext}

object WordCount {
	def main(args: Array[String]): Unit = {
		val conf: SparkConf = new SparkConf().setAppName("count").setMaster("local")
		val context = new SparkContext(conf)
		val tuples: Array[(String, Int)] = context
		  .textFile("E:\\60.test\\littlefile")
		  .flatMap(x => x.split(" "))
		  .map(x => (x, 1))
		  .reduceByKey((x, y) => x + y)
		  .collect()
		print(tuples.toBuffer)
	}
}
