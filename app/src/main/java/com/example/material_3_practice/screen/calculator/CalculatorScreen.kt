package com.example.material_3_practice.screen.calculator


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.material_3_practice.ui.theme.LightGray
import com.example.material_3_practice.ui.theme.MediumGray
import com.example.material_3_practice.ui.theme.Orange
import com.example.material_3_practice.widget.CalculatorButton
import java.math.BigDecimal

@Composable
fun CalculatorScreen(
    modifier: Modifier = Modifier,
    buttonSpacing: Dp = 8.dp,
) {
    var calculationHistory by remember {
        mutableStateOf("")
    }
    var firstInput by remember {
        mutableStateOf("")
    }
    var secondInput by remember {
        mutableStateOf("")
    }
    var operator by remember {
        mutableStateOf("")
    }
    var calculationResult by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally
    ) {

        /// calculator screens
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Bottom
            ) {
                Text(text = calculationHistory, fontSize = 20.sp, color = Color.DarkGray)
                Text(text = firstInput, fontSize = 40.sp, color = Color.White)
                Text(text = operator, fontSize = 36.sp, color = LightGray)
                Text(text = secondInput, fontSize = 40.sp, color = Color.White)
                Text(text = calculationResult, fontSize = 40.sp, color = Orange)
            }
        }


        ///Calculator buttons
        Box(modifier = modifier) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter),
                verticalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(symbol = "AC",
                        modifier = Modifier
                            .background(LightGray)
                            .aspectRatio(2f)
                            .weight(2f),
                        onClick = {
                            firstInput = ""
                            secondInput = ""
                            operator = ""
                            calculationHistory = ""
                            calculationResult = ""
                        })
                    CalculatorButton(symbol = "DEL",
                        modifier = Modifier
                            .background(LightGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            if (secondInput != "") {
                                secondInput = secondInput.dropLast(1)
//                                calculationSteps = calculationSteps.dropLast(1)
                            } else if (operator != "") {
                                operator = ""
                            } else if (firstInput != "") {
                                firstInput = firstInput.dropLast(1)
                            }
                        })
                    CalculatorButton(symbol = "/",
                        modifier = Modifier
                            .background(Orange)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            if (firstInput == "" && calculationResult != "" && calculationResult != "Can't divide by 0") {
                                firstInput = calculationResult
                                operator = "/"
                                calculationResult = ""
                            } else if (firstInput != "") {
                                operator = "/"
                            }
                        })
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {

                    CalculatorButton(symbol = "7",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            if(calculationResult !=""){
                                calculationResult = ""
                            }
                            if (firstInput == "") {
                                firstInput = "7"
                            } else if (operator == "") {
                                firstInput += "7"
                            } else if (secondInput == "") {
                                secondInput = "7"
                            } else {
                                secondInput += "7"
                            }
                        })
                    CalculatorButton(symbol = "8",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            if(calculationResult !=""){
                                calculationResult = ""
                            }
                            if (firstInput == "") {
                                firstInput = "8"
                            } else if (operator == "") {
                                firstInput += "8"
                            } else if (secondInput == "") {
                                secondInput = "8"
                            } else {
                                secondInput += "8"
                            }
                        })
                    CalculatorButton(symbol = "9",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            if(calculationResult !=""){
                                calculationResult = ""
                            }
                            if (firstInput == "") {
                                firstInput = "9"
                            } else if (operator == "") {
                                firstInput += "9"
                            } else if (secondInput == "") {
                                secondInput = "9"
                            } else {
                                secondInput += "9"
                            }
                        })
                    CalculatorButton(symbol = "x",
                        modifier = Modifier
                            .background(Orange)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            if (firstInput == "" && calculationResult != "" && calculationResult != "Can't divide by 0") {
                                firstInput = calculationResult
                                operator = "x"
                                calculationResult = ""
                            } else if (firstInput != "") {
                                operator = "x"
                            }
                        })
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(symbol = "4",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            if(calculationResult !=""){
                                calculationResult = ""
                            }
                            if (firstInput == "") {
                                firstInput = "4"
                            } else if (operator == "") {
                                firstInput += "4"
                            } else if (secondInput == "") {
                                secondInput = "4"
                            } else {
                                secondInput += "4"
                            }
                        })
                    CalculatorButton(symbol = "5",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            if(calculationResult !=""){
                                calculationResult = ""
                            }
                            if (firstInput == "") {
                                firstInput = "5"
                            } else if (operator == "") {
                                firstInput += "5"
                            } else if (secondInput == "") {
                                secondInput = "5"
                            } else {
                                secondInput += "5"
                            }
                        })
                    CalculatorButton(symbol = "6",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            if(calculationResult !=""){
                                calculationResult = ""
                            }
                            if (firstInput == "") {
                                firstInput = "6"
                            } else if (operator == "") {
                                firstInput += "6"
                            } else if (secondInput == "") {
                                secondInput = "6"
                            } else {
                                secondInput += "6"
                            }
                        })
                    CalculatorButton(symbol = "-",
                        modifier = Modifier
                            .background(Orange)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            if (firstInput == "" && calculationResult != "" && calculationResult != "Can't divide by 0") {
                                firstInput = calculationResult
                                operator = "-"
                                calculationResult = ""
                            } else if (firstInput != "") {
                                operator = "-"
                            }
                        })
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(symbol = "1",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            if(calculationResult !=""){
                                calculationResult = ""
                            }
                            if (firstInput == "") {
                                firstInput = "1"
                            } else if (operator == "") {
                                firstInput += "1"
                            } else if (secondInput == "") {
                                secondInput = "1"
                            } else {
                                secondInput += "1"
                            }
                        })
                    CalculatorButton(symbol = "2",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            if(calculationResult !=""){
                                calculationResult = ""
                            }
                            if (firstInput == "") {
                                firstInput = "2"
                            } else if (operator == "") {
                                firstInput += "2"
                            } else if (secondInput == "") {
                                secondInput = "2"
                            } else {
                                secondInput += "2"
                            }
                        })
                    CalculatorButton(symbol = "3",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            if(calculationResult !=""){
                                calculationResult = ""
                            }
                            if (firstInput == "") {
                                firstInput = "3"
                            } else if (operator == "") {
                                firstInput += "3"
                            } else if (secondInput == "") {
                                secondInput = "3"
                            } else {
                                secondInput += "3"
                            }
                        })
                    CalculatorButton(symbol = "+",
                        modifier = Modifier
                            .background(Orange)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            if (firstInput == "" && calculationResult != "" && calculationResult != "Can't divide by 0") {
                                firstInput = calculationResult
                                operator = "+"
                                calculationResult = ""
                            } else if (firstInput != "") {
                                operator = "+"
                            }
                        })
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(symbol = "0",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(2f)
                            .weight(2f),
                        onClick = {
                            if(calculationResult !=""){
                                calculationResult = ""
                            }
                            if (firstInput == "") {
                                firstInput = ""
                            } else if (operator == "" && firstInput != "0") {
                                firstInput += "0"
                            } else if (secondInput == "") {
                                secondInput = "0"
                            } else {
                                secondInput += "0"
                            }
                        })
                    CalculatorButton(symbol = ".",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            if(calculationResult !=""){
                                calculationResult = ""
                            }
                            if (firstInput == "") {
                                firstInput = "0."
                            } else if (operator == "" && firstInput.last().toString() != ".") {
                                firstInput += "."
                            } else if (operator != "" && secondInput == "") {
                                secondInput = "0."
                            } else if (secondInput != "" && secondInput.last().toString() != ".") {
                                secondInput += "."
                            } else {
                                calculationResult = ""
                                firstInput = "0."
                            }
                        })
                    CalculatorButton(symbol = "=",
                        modifier = Modifier
                            .background(Orange)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            if (firstInput != "" && secondInput != "" && operator != "") {
                                calculationResult = when (operator) {
                                    "+" -> (BigDecimal(firstInput) + BigDecimal(secondInput)).toString()
                                    "-" -> (BigDecimal(firstInput) - BigDecimal(secondInput)).toString()
                                    "x" -> (BigDecimal(firstInput) * BigDecimal(secondInput)).toString()
                                    else -> {
                                        if (secondInput != "0") {
                                            (BigDecimal(firstInput) / BigDecimal(secondInput)).toString()
                                        } else {
                                            "Can't divide by 0"
                                        }
                                    }
                                }
                                calculationHistory =
                                    "$firstInput $operator $secondInput = $calculationResult"
                                firstInput = ""
                                secondInput = ""
                                operator = ""
                            }
                        })
                }
            }
        }
    }
}


@Preview
@Composable
fun CalculatorPreview() {
    CalculatorScreen()
}