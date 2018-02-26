//kotlin空值处理
package NullDeal_10


//接收一个参数，参数是非空的String类型，加上问号代表的是参数可以为空
fun heat(str : String?) : String {
	return "热"+str
}

fun main(args: Array<String>) {
	var result1 = heat("水")
	
	println(result1)
	
	var result2 = heat(null)
	println(result2)
	
}

