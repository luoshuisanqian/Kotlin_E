/**
 ×Ö·û´®±È½Ï
 **/

package StringCompare_9

fun main(args: Array<String>) {
	var str1 = "Andy"
	var str2 = "andy"
	
	println(str1.equals(str2))//false
	println(str1==str2)//fase
	println(str1.equals(str2, true))  //true:ºöÂÔ×ÖÄ¸´óĞ¡Ğ´
	println(str1.equals(str2, false))  //true:²»ºöÂÔ×ÖÄ¸´óĞ¡Ğ´
	
	
}

