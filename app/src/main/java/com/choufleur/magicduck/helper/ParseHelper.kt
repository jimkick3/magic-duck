package com.choufleur.magicduck.helper

import com.beust.klaxon.Klaxon

fun ParseTasks(path:String): Task? {
    return Klaxon().parse<Task>(path)
}
fun ParseDuration(path:String) : Int?{
    return Klaxon().parse<Int>(path)
}
