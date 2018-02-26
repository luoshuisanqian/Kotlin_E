package type_inference_3

fun main(args: Array<String>) {
	var i:Int = 18;
	//计算机给我一块存储空间，名字叫i，内容是整数18
	i = 19
	
	

			//			i = 999999999999    报错
	/**
	 计算机给我一个存储空间，名字叫j,存放的数据类型为  长整形
	 **/
	var j : Long= 999999999999
	
	
	//s 就是一个存放字符串的空间
	var s:String = "haha"
	
	
	/**
	 三、 常量
	 
	 **/
	val number = "No.123456"      //只读数据类型
	
}

