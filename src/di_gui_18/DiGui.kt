/**
 ���ݹ棬�׳�
 **/

package di_gui_18

import java.math.BigInteger

fun main(args: Array<String>) {
	var num = BigInteger("100")
	//����5�Ľ׳�
	println("��ӡnum�Ľ׳�=====${fact(num)}")
}

fun fact(num:BigInteger) : BigInteger{
	if (num == BigInteger.ONE) {
		return BigInteger.ONE
	} else {
		return num*fact(num-BigInteger.ONE)
	}
}

