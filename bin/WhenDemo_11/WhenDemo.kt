/**
 when表达式
 **/

package WhenDemo_11

fun gradeStudent(score : Int) {
	when(score) {
		100->println("考了满分，棒棒哒")
		60->println("刚好及格")
		else->println("需要加油哦")
	}
}

fun main(args:Array<String>) {
	gradeStudent(100)
}

