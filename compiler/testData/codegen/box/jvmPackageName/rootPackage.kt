// TARGET_BACKEND: JVM
// WITH_RUNTIME
// LANGUAGE_VERSION: 1.2

// FILE: foo.kt

@file:Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@file:JvmPackageName("jjj")

fun f(): String = "O"

val g: String? get() = "K"

// FILE: bar.kt

fun box(): String = f() + g
