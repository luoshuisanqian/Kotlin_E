/**
 kotlin��������﷨  Rang��Loop
 **/


package rang_loop_12

fun main(args: Array<String>) {
	
	/**
	 �����䷶Χ
	 **/
	var nums = 1..100  //��ʾ��1 �� 100 [1,100]
	var result = 0;
	for (num in nums) {
		print("${num},")
		result = result + num
		
	}
	print("\n")
	println("��1�ӵ�100�ĺ�Ϊ===========" + result)
	println("��1�ӵ�100�ĺ�Ϊ��${result}")
	
	
	
	/**
	 �����䷶Χ
	 **/
	var nums_you_kaiqujian = 1 until 100     //��ʾ��1��99  ��1,100)    ����ҿ�
	for(num in nums_you_kaiqujian) {
		print("${num}, ")
	}
	
	
	
	/**
	 ����   step 2
	 **/
	print("\n")
	var nums_step = 1..16
	for (a in nums_step) {
		print("${a},")
	}
	
	var nums_reversed = nums_step.reversed();   //����
	print("\n")
	for (a in nums_reversed) {
		print("${a}, ")
	}
	
	print("\n")
	println("����Ϊ==========" + nums_reversed.count())
	
	
	
	
	
}

