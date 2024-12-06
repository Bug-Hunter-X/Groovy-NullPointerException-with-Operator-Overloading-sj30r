def myMethod(a, b) {
  a = a ?: 0 // Use Elvis operator for null-safe default value
  b = b ?: 0 // Use Elvis operator for null-safe default value
  return a + b
}

println myMethod(null, 5)
println myMethod(10, null)
println myMethod(null, null)