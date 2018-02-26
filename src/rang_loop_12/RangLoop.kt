/**
 kotlin的区间和语法  Rang和Loop
 **/


package rang_loop_12

fun main(args: Array<String>) {
	
	/**
	 闭区间范围
	 **/
	var nums = 1..100  //表示从1 到 100 [1,100]
	var result = 0;
	for (num in nums) {
		print("${num},")
		result = result + num
		
	}
	print("\n")
	println("从1加到100的和为===========" + result)
	println("从1加到100的和为：${result}")
	
	
	
	/**
	 开区间范围
	 **/
	var nums_you_kaiqujian = 1 until 100     //表示从1到99  【1,100)    左闭右开
	for(num in nums_you_kaiqujian) {
		print("${num}, ")
	}
	
	
	
	/**
	 递增   step 2
	 **/
	print("\n")
	var nums_step = 1..16
	for (a in nums_step) {
		print("${a},")
	}
	
	var nums_reversed = nums_step.reversed();   //倒序
	print("\n")
	for (a in nums_reversed) {
		print("${a}, ")
	}
	
	print("\n")
	println("总数为==========" + nums_reversed.count())
	
	
	
	
	
}

