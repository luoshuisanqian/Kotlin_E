/**
 £¬µÝ¹æ£¬½×³Ë
 **/

package di_gui_18

import java.math.BigInteger

fun main(args: Array<String>) {
	var num = BigInteger("100")
	//¼ÆËã5µÄ½×³Ë
	println("´òÓ¡numµÄ½×³Ë=====${fact(num)}")
}

fun fact(num:BigInteger) : BigInteger{
	if (num == BigInteger.ONE) {
		return BigInteger.ONE
	} else {
		return num*fact(num-BigInteger.ONE)
	}
}

