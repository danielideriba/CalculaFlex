package br.com.app.calculaflex.calculaflex.extensions

fun Double.format(digits: Int) =
        java.lang.String.format("%.${digits}f", this)
