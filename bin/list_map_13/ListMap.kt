/**
 kotlin��List��Map
 **/

package list_map_13

import java.util.TreeMap

fun main(args: Array<String>) {
	var lists = listOf("�򼦵�", "�����", "�����˹", "������")
	for ((i,e) in lists.withIndex()) {
		println("${i}  ${e}")
	}
	
	var map = TreeMap<String, String>()
	map["��"] = "good"
	map["ѧϰ"] = "study"
	map["��"] = "day"
	map["����"] = "up"
	
	println(map["��"])
	
	
}

