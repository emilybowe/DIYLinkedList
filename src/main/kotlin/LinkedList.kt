class Address {

}

class LinkedList {

	class Node<T> (t: T) {
		var address = Address()
		var data = t

		fun next(address: Address) : Address? {
			//do something to address = nextAddress
			//how to know if the next one is null?
			var nextAddress : Address? = Address()
			return nextAddress
		}
	}
}