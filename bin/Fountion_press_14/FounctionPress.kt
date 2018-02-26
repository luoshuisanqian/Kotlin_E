/**
 函数表达式
 **/
package Fountion_press_14

fun main(args: Array<String>) {
	var result = add(3,5)
	println(result)
	var result2 = add2(3, 5)
	println(result2)
	
	
	//函数表达式
	//第一种声明方式，   简洁，抽出来
	/**
	 函数赋给变量i
	 **/
	var i = {x:Int, y:Int -> x+y}
	var result3 = i(3,5)
	println("函数表达式1======="+result3)
	//第二种声明方式，   分享出来
	var j:(Int, Int) -> Int = {x,y -> x+y}//传入int类型参数，返回值int类型参数
	var result4 = j(3,5)
	println("函数表达式2======="+result4)
	
	
	
}

fun add(x:Int, y:Int) : Int{
	return x+y
}

fun add2(x:Int, y:Int) : Int=x+y