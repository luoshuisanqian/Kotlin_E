package ren_ji_jiao_hu_17

fun main(args: Array<String>) {
	println("请输入第一个数字：")
	var num1Str = readLine()
	println("请输入第二个数字：")
	var num2Str = readLine()
	
	var num1 = num1Str!!.toInt()   //两个!确保输进来的数一定不为空
	var num2 = num2Str!!.toInt()
	
	println("${num1} + ${num2} = ${num1+num2}")
}

