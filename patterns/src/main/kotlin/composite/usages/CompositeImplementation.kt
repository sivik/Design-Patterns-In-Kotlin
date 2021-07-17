package composite.usages

import composite.usages.components.Canvas
import composite.usages.leafs.Circle
import composite.usages.leafs.Rectangle
import composite.usages.leafs.Triangle
import java.io.Console


fun main(){
    // Create a tree structure
    val root = Canvas()
    root.add(Rectangle())
    root.add(Triangle())

    val childCanvas = Canvas()
    childCanvas.add(Circle())
    childCanvas.add(Rectangle())
    root.add(childCanvas)

    // Recursively rotate leafs
    root.rotate(90)

    // Wait for user
    readLine()
}