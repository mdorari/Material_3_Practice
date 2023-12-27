package com.example.material_3_practice.utils

fun updateInputs(
    firstInput: String,
    operator: String,
    secondInput: String,
    buttonText: String
) {
    var firstInput1 = firstInput
    var secondInput1 = secondInput
    if (firstInput1 == "") {
        firstInput1 = buttonText
    } else if (operator == "") {
        firstInput1 += buttonText
    } else if (secondInput1 == "") {
        secondInput1 = buttonText
    } else {
        secondInput1 += buttonText
    }
}

fun updateOperator(
    firstInput: String,
    operator: String,
    secondInput: String,
    buttonText: String
) {
    var firstInput1 = firstInput
    var secondInput1 = secondInput
    if (firstInput1 == "") {
        firstInput1 = buttonText
    } else if (operator == "") {
        firstInput1 += buttonText
    } else if (secondInput1 == "") {
        secondInput1 = buttonText
    } else {
        secondInput1 += buttonText
    }
}