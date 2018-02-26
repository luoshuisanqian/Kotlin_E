/**
 kotlin的List和Map
 **/

package list_map_13

import java.util.TreeMap

fun main(args: Array<String>) {
	var lists = listOf("买鸡蛋", "买大米", "买杜蕾斯", "买冰淇淋")
	for ((i,e) in lists.withIndex()) {
		println("${i}  ${e}")
	}
	
	var map = TreeMap<String, String>()
	map["好"] = "good"
	map["学习"] = "study"
	map["天"] = "day"
	map["向上"] = "up"
	
	println(map["好"])
	
	
}

