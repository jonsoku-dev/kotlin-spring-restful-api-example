package com.tamastudy.kotlinrestapi.transformer

interface Transformer<A, B> {
    fun transform(source: A): B
}