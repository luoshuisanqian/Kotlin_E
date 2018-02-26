/**
 默认参数和具名参数
 **/
package juming_moren_canshu_15

val Pi = 3.14159f;
//获取长方形的面积
fun getRectArea(x:Int, y:Int) : Int {
	return x*y
}

fun getRectArea2(x:Int, y:Int) : Int = x*y

fun main(args: Array<String>) {
	var i = {x:Int, y:Int -> x*y}
	var j:(Int, Int) -> Int = {x, y -> x*y}
	
	/**
	 具名参数
	 ***/
	var area = getYuanRang(r=2.0f)
	println("圆的周长========" + area)
}



/**
 获取圆的周长
 **/
fun getYuanRang(PI:Float=Pi, r:Float) : Float {
	return 2*PI*r
}


/**
 获取圆柱体体积
 **/
fun getYuanTiji(PI:Float, r:Float, h:Float) : Float {
	return PI*r*r*h
}
