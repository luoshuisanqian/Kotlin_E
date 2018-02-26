/**
 	Kotlin字符串模版
 **/

package StringModel_8

fun StringModel(placeName:String) : String {
	var temple = """今天去${placeName}玩，它有${placeName.length}个字"""
	return temple
}

fun main(args: Array<String>) {
	var placeName1 = StringModel("金山中园")
	println(placeName1)
}

