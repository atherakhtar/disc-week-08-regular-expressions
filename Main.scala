import scala.util.matching.Regex
import scala.io.Source


object Main{
	def main(args: Array[String]) {

		// Load content of alice.txt into lines
		val source = Source.fromFile("alice.txt")
		val lines = source.mkString
		source.close()

		//YOUR CODE HERE

	}
}