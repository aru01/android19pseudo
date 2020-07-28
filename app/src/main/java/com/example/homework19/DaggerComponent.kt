package com.example.homework19

import dagger.Component

@Component
interface DaggerComponent {
    fun getUniversity(): University
    fun getDiscepline(): Discepline
    fun getStudent(): Student
}