package Ch03

/**
  * See what happens when you pass Nil and Cons themselves to foldRight,
  * like this:
  *
  * foldRight(List(1, 2, 3), Nil:List[Int])(Cons(_,_)).
  *
  * What do you think this says about the relationship
  * between foldRight and the data constructors of List?
  */
object C03E08 {
  // you'll just get back the List(1, 2, 3) because:
  // Cons(_, _) is f, and acts as the constructor function
  // Nil is z, and is returned when we reach the end of the list in foldRight
  // so the list is essentially reconstructued
}
