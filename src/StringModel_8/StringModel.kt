/**
 	Kotlin�ַ���ģ��
 **/

package StringModel_8

fun StringModel(placeName:String) : String {
	var temple = """����ȥ${placeName}�棬����${placeName.length}����"""
	return temple
}

fun main(args: Array<String>) {
	var placeName1 = StringModel("��ɽ��԰")
	println(placeName1)
}

