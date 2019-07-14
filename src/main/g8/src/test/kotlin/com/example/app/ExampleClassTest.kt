package com.example.app

import io.kotlintest.shouldBe
import io.kotlintest.specs.FunSpec

class ExampleClassTest : FunSpec({
    context("ExampleClass") {
        test("should return hello world") {
            val example = ExampleClass()
            example.someMethod("world") shouldBe "Hello world!"
        }
    }
})