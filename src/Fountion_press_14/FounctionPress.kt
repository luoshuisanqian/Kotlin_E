/**
 �������ʽ
 **/
package Fountion_press_14

fun main(args: Array<String>) {
	var result = add(3,5)
	println(result)
	var result2 = add2(3, 5)
	println(result2)
	
	
	//�������ʽ
	//��һ��������ʽ��   ��࣬�����
	/**
	 ������������i
	 **/
	var i = {x:Int, y:Int -> x+y}
	var result3 = i(3,5)
	println("�������ʽ1======="+result3)
	//�ڶ���������ʽ��   �������
	var j:(Int, Int) -> Int = {x,y -> x+y}//����int���Ͳ���������ֵint���Ͳ���
	var result4 = j(3,5)
	println("�������ʽ2======="+result4)
	
	
	
}

fun add(x:Int, y:Int) : Int{
	return x+y
}

fun add2(x:Int, y:Int) : Int=x+y