/**
 Ĭ�ϲ����;�������
 **/
package juming_moren_canshu_15

val Pi = 3.14159f;
//��ȡ�����ε����
fun getRectArea(x:Int, y:Int) : Int {
	return x*y
}

fun getRectArea2(x:Int, y:Int) : Int = x*y

fun main(args: Array<String>) {
	var i = {x:Int, y:Int -> x*y}
	var j:(Int, Int) -> Int = {x, y -> x*y}
	
	/**
	 ��������
	 ***/
	var area = getYuanRang(r=2.0f)
	println("Բ���ܳ�========" + area)
}



/**
 ��ȡԲ���ܳ�
 **/
fun getYuanRang(PI:Float=Pi, r:Float) : Float {
	return 2*PI*r
}


/**
 ��ȡԲ�������
 **/
fun getYuanTiji(PI:Float, r:Float, h:Float) : Float {
	return PI*r*r*h
}
