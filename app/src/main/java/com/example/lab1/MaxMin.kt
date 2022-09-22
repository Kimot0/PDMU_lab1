package com.example.lab1

class MaxMin {
    companion object {
        fun max(first: Int, second: Int): Int {
            return if (first > second) first
            else second
        }

        fun min(first: Int, second: Int): Int {
            return if (first < second) first
            else second
        }
    }
}