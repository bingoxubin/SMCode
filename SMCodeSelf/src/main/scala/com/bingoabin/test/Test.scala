package com.bingoabin.test

import org.apache.spark.{SparkConf, SparkContext}

//坑
object Test {
	def main(args: Array[String]): Unit = {
		val conf = new SparkConf().setAppName("local").setMaster("local")
		val sc = new SparkContext(conf)
		val rdd = sc.parallelize(Array(1, 2, 3, 4, 5))

		var counter = 0

		rdd.foreach {
			n => counter += n
		}
		println(counter)
		println(rdd.sum())
	}
}
