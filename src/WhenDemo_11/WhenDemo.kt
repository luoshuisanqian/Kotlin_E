/**
 when���ʽ
 **/

package WhenDemo_11

fun gradeStudent(score : Int) {
	when(score) {
		100->println("�������֣�������")
		60->println("�պü���")
		else->println("��Ҫ����Ŷ")
	}
}

fun main(args:Array<String>) {
	gradeStudent(100)
}

