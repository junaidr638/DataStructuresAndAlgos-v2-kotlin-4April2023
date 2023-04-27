package LaunchPad

import LinkedList.Node

fun main(){
"creating and linking nodes" example {
    val node1 = Node(1)
    val node2 = Node(2)
    val node3 = Node(3)

    node1.next = node2
    node2.next = node3

    println("$node1")
}


}