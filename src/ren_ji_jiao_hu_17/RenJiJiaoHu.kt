package ren_ji_jiao_hu_17

fun main(args: Array<String>) {
	println("�������һ�����֣�")
	var num1Str = readLine()
	println("������ڶ������֣�")
	var num2Str = readLine()
	
	var num1 = num1Str!!.toInt()   //����!ȷ�����������һ����Ϊ��
	var num2 = num2Str!!.toInt()
	
	println("${num1} + ${num2} = ${num1+num2}")
}

