import com.sun.org.slf4j.internal.LoggerFactory

class MyList<T> () {
}
class MyLinkedList<T> (type: T)  {

	val myList = MyList<T>()
	private val logger = LoggerFactory.getLogger(javaClass)
	var size = 0

	fun <T> addHead(data: T) {
		val node = MyNode(data)
		node.index = 0

		size++
	}

	fun removeHead() {
		try {

			size--
		} catch (e: NoSuchElementException) {
			logger.error("Empty list", e)
		}
	}

	fun addTail() {
		val node = MyNode(data)
		node.index = 0
	}

	fun removeTail() {
		try {

		} catch (e: NoSuchElementException) {
			logger.error("Empty list", e)
		}
	}

	fun get(index: Int) {
		try {
			return data
		} catch (e: NoSuchElementException) {
			logger.error("No item at that index", e)
		}
	}

	fun middleInsert(start: Int, end: Int) {
		(start until end).random()
	}

	fun middleRemove() {
		try {

		} catch (e: NoSuchElementException) {
			logger.error("Empty list", e)
		}
	}

	class MyNode<T> (value: T) {
		var index: Int? = null
		var address : Address? = null
		var data = value

		init {

		}

		fun next(address: Address) : Address? {
			//SWAP the address!
			//how to know if the next one is null?
			var nextAddress : Address? = Address()
			return nextAddress
		}
	}
}


class Address {
	var code: Int = 0
}