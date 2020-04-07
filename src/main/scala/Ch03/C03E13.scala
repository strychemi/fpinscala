package Ch03

/**
  * Can you write foldLeft in terms of foldRight?
  * How about the other way around?
  *
  * Implementing foldRight via foldLeft is useful because
  * it lets us implement foldRight tail-recursively,
  * which means it works even for large lists without overflow- ing the stack.
  */
object C03E13 {
  // amazing explanation by ShreevatsaR
  // https://stackoverflow.com/questions/17136794/foldleft-using-foldright-in-scala
  // the following is excerpt of the explanation found above (with my edits)
  def foldLeft[A, B](l: List[A], z: B)(operation: (B, A) => B): B = {
    // Assume we have a List(1, 2, 3) and the operation * and initial value z,

    // foldLeft behaves by consuming values left to right:
    //                              1    2    3
    // Initially:               z
    // After consuming 1:       z * 1
    // After consuming 2:      (z * 1) * 2
    // After consuming 3:     ((z * 1) * 2) * 3

    // foldRight normally behaves by consuming values right to left:
    //                          1    2    3
    // Initially:                             z
    // After consuming 3:                 3 * z
    // After consuming 2:            2 * (3 * z)
    // After consuming 1:       1 * (2 * (3 * z))

    // the desired behavior is for foldRight "mimic" foldLeft:
    //                              1    2    3
    // Initially:                             z
    // After consuming 3:                 z * 3
    // After consuming 2:           (z * 2) * 3
    // After consuming 1:     ((z * 1) * 2) * 3

    // the difference here is that we want to evaluate z last
    // in other words, we have to partially apply params from right to left
    // while carrying over z every time we partially apply a new param
    // this will allow foldRight to mimic foldLeft behavior

    // specifically we have to to go from
    // 1. z
    // 2. z * 3
    // 3. (z * 2) * 3
    // 4. ((z * 1) * 2) * 3
    // for an operation * (however * can represent any arbitrary operation)

    // Let:
    // f1(z) = z * 3
    // f2(z) = (z * 2) * 3

    // f2 can be defined in terms of f1:
    // f2(z) = f1(z * 2)

    // based on this mathematical definition,
    // we have a fn that takes 2 and f1 and gives f2
    // we define this as function g
    // g(2, f1) = f2(z) = f1(z * 2)

    // doing this for next known param, 1...
    // g(1, f2) = f3(z) = f2(z * 1)

    // this gives us the resultant function we can then apply z to

    // we define an identity fn f0,
    // because g can only take a number and a function argument
    //  f0 = identity. f0(z) = z
    //  f1 = g(3, f0). So f1(z) = f0(z * 3) = z * 3
    //  f2 = g(2, f1). So f2(z) = f1(z * 2) = (z * 2) * 3
    //  f3 = g(1, f2). So f3(z) = f2(z * 1) = ((z * 1) * 2) * 3

    // here is our identity function, our base case
    // it simply returns whatever is passed
    // again this is needed because our g function takes 2 args
    // 1. `a` of type `A`, which is the arg that is being partially applied
    // 2. a function to "wrap" and partially apply A to
    def f０ = (b: B) => b

    def g(a: A, fn: B => B): B => B = b => fn(operation(b, a))

    // When calling foldRight by passing f0,
    // type `B` is instantiated to `B => B`
    // this was actually the critical part that got me stuck on this problem
    // the critical flaw in my thinking was the assumption that a type alias
    // can only be represented by a tangible value types (e.g. Int, List, etc.)
    // all along i've been using types such as `(A, B) => A` and haven't been
    // congnizant of the fact that these are actual types as well
    // the fact that type `B` can be instantiated to `B => B`
    // just did not seem very obvious to me
    // the result of exp should be:
    // exp = g(1, g(2, g(3, f0)))
    val exp: B => B = Ch03.List.foldRight(l, f０)(g)
    exp(z)
  }

  // def foldRight[A, B](l: List[A], z: B)(f: (A, B) => B): B =
}
