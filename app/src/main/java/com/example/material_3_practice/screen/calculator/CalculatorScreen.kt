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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.material_3_practice.ui.theme.LightGray
import com.example.material_3_practice.ui.theme.MediumGray
import com.example.material_3_practice.ui.theme.Orange
import com.example.material_3_practice.widget.CalculatorButton

@Composable
fun CalculatorScreen(
    modifier: Modifier = Modifier,
    buttonSpacing:Dp = 8.dp,
) {
    var calculationSteps by remember {
        mutableStateOf("")
    }
    var firstInput by remember {
        mutableStateOf(0)
    }
    var secondInput by remember {
        mutableStateOf(0)
    }
    var operator by remember {
        mutableStateOf("")
    }
    var calculationResult by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        /// calculator screens
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Column {
                Text(text = calculationSteps)
                Text(text = calculationResult.toString())
            }
        }


        // show history button
//        Button(
//            onClick = { /*TODO*/ },
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            Icon(
//                imageVector = Icons.Filled.KeyboardArrowDown,
//                contentDescription = "show history"
//            )
//        }

        ///Calculator buttons
        Box(modifier = modifier) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter),
                verticalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                Row (
                    modifier = Modifier.fillMaxWidth()
                    , horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ){
                    CalculatorButton(
                        symbol ="AC",
                        modifier = Modifier
                            .background(LightGray)
                            .aspectRatio(2f)
                            .weight(2f),
                        onClick = {
                            calculationSteps = ""
                        }
                    )
                    CalculatorButton(
                        symbol ="DEL",
                        modifier = Modifier
                            .background(LightGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            if(calculationSteps != ""){
                                calculationSteps = calculationSteps.dropLast(1)
                            }
                        }
                    )
                    CalculatorButton(
                        symbol ="/",
                        modifier = Modifier
                            .background(Orange)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            calculationSteps = updateCalculationSteps(calculationSteps,"/")
                        }
                    )
                }

                Row (
                    modifier = Modifier.fillMaxWidth()
                    , horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ){

                    CalculatorButton(
                        symbol ="7",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            calculationSteps = updateCalculationSteps(calculationSteps,"7")
                            calculationResult = updateCalculationResult(firstInput,7)
                            firstInput = calculationResult
                        }
                    )
                    CalculatorButton(
                        symbol ="8",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            calculationSteps = updateCalculationSteps(calculationSteps,"8")
                        }
                    )
                    CalculatorButton(
                        symbol ="9",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            calculationSteps = updateCalculationSteps(calculationSteps,"9")
                        }
                    )
                    CalculatorButton(
                        symbol ="x",
                        modifier = Modifier
                            .background(Orange)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            calculationSteps = updateCalculationSteps(calculationSteps,"x")
                        }
                    )
                }
                Row (
                    modifier = Modifier.fillMaxWidth()
                    , horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ){
                    CalculatorButton(
                        symbol ="4",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            calculationSteps = updateCalculationSteps(calculationSteps,"4")
                        }
                    )
                    CalculatorButton(
                        symbol ="5",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            calculationSteps = updateCalculationSteps(calculationSteps,"5")
                        }
                    )
                    CalculatorButton(
                        symbol ="6",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            calculationSteps = updateCalculationSteps(calculationSteps,"6")
                        }
                    )
                    CalculatorButton(
                        symbol ="-",
                        modifier = Modifier
                            .background(Orange)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            calculationSteps = updateCalculationSteps(calculationSteps,"-")
                        }
                    )
                }
                Row (
                    modifier = Modifier.fillMaxWidth()
                    , horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ){
                    CalculatorButton(
                        symbol ="1",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            calculationSteps = updateCalculationSteps(calculationSteps,"1")
                        }
                    )
                    CalculatorButton(
                        symbol ="2",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            calculationSteps = updateCalculationSteps(calculationSteps,"2")
                        }
                    )
                    CalculatorButton(
                        symbol ="3",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            calculationSteps = updateCalculationSteps(calculationSteps,"3")
                        }
                    )
                    CalculatorButton(
                        symbol ="+",
                        modifier = Modifier
                            .background(Orange)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            calculationSteps = updateCalculationSteps(calculationSteps,"+")
                        }
                    )
                }
                Row (
                    modifier = Modifier.fillMaxWidth()
                    , horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ){
                    CalculatorButton(
                        symbol ="0",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(2f)
                            .weight(2f),
                        onClick = {
                            calculationSteps = updateCalculationSteps(calculationSteps,"0")
                        }
                    )
                    CalculatorButton(
                        symbol =".",
                        modifier = Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            /* TODO */
//                            calculationSteps = updateCalculationSteps(calculationSteps,".")
                        }
                    )
                    CalculatorButton(
                        symbol ="=",
                        modifier = Modifier
                            .background(Orange)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                           /* TODO */
                        }
                    )
                }
            }
        }
    }
}

fun updateCalculationResult(firstInput: Int, secondInput: Int): Int {
    var newResult = firstInput

    newResult = firstInput + secondInput
//    if (firstInput != 0){
//    }

return newResult
}


fun updateCalculationSteps(text1:String,text2:String):String {
    var newText = text1

    if (newText != "0"){
        newText += text2
    }else{
        newText = text2
    }
    return newText
}

@Preview
@Composable
fun CalculatorPreview() {
    CalculatorScreen()
}