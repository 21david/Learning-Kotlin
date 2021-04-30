// Video 41

package udemy.kotlincourse.section05

// an inline function is substituted into wherever that function is being called
// so instead of creating an actual function, it just replaces the function's expression
// body wherever the function was called. This is done for a small performance boost,
// but it really should only be used for functions with lambda parameters
// (reason is that lambda parameters require overhead of creating an object that can be
// avoided with inline functions, so its beneficial this way.)

inline fun labelMultiply5(operand1: Int, operand2: Int, label: String) =
        "$label ${operand1 * operand2}"