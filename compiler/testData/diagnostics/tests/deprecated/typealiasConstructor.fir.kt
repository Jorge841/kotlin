@Deprecated("Deprecated class")
open class DeprecatedClass

open class WithDeprecatedCtor(val x: Int) {
    @Deprecated("Deprecated constructor")
    constructor() : this(0)
}

typealias DeprecatedClassAlias = DeprecatedClass
typealias WithDeprecatedCtorAlias = WithDeprecatedCtor
typealias ArrayListOfDeprecatedClass = ArrayList<DeprecatedClass>

class Test1 : DeprecatedClassAlias()

class Test2 : WithDeprecatedCtorAlias()

val test3 = ArrayListOfDeprecatedClass()