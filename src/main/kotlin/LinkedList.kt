class Address {

}

class LinkedList {

	class Node<T> (t: T, a: Address) { //link to next Node should come from previous Node. Singly linked - only go forward
		var address = a
		var data = t

		fun next(address: Address) : Address?{
			var nextAddress : Address? = Address()
			return nextAddress
		}
	}
}