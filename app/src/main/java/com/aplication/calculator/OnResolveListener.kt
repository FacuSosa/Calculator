package com.aplication.calculator

interface OnResolveListener {
    fun onShowResult(result: Double, isFromResolve: Boolean)
    fun onShowMessage(errorRes: Int)
}