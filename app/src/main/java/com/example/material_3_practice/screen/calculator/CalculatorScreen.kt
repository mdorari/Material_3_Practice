package com.example.material_3_practice.screen.calculator


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
    buttonSpacing:Dp = 8.dp
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {

        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(
                imageVector = Icons.Filled.KeyboardArrowDown,
                contentDescription = "show history"
            )
        }

        ///Calculator

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
                        modifier =Modifier
                            .background(LightGray)
                            .aspectRatio(2f)
                            .weight(2f),
                        onClick = {}
                    )
                    CalculatorButton(
                        symbol ="DEL",
                        modifier =Modifier
                            .background(LightGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {}
                    )
                    CalculatorButton(
                        symbol ="/",
                        modifier =Modifier
                            .background(Orange)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {}
                    )
                }

                Row (
                    modifier = Modifier.fillMaxWidth()
                    , horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ){
                    CalculatorButton(
                        symbol ="7",
                        modifier =Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {}
                    )
                    CalculatorButton(
                        symbol ="8",
                        modifier =Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {}
                    )
                    CalculatorButton(
                        symbol ="9",
                        modifier =Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {}
                    )
                    CalculatorButton(
                        symbol ="x",
                        modifier =Modifier
                            .background(Orange)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {}
                    )
                }
                Row (
                    modifier = Modifier.fillMaxWidth()
                    , horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ){
                    CalculatorButton(
                        symbol ="4",
                        modifier =Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {}
                    )
                    CalculatorButton(
                        symbol ="5",
                        modifier =Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {}
                    )
                    CalculatorButton(
                        symbol ="6",
                        modifier =Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {}
                    )
                    CalculatorButton(
                        symbol ="-",
                        modifier =Modifier
                            .background(Orange)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {}
                    )
                }
                Row (
                    modifier = Modifier.fillMaxWidth()
                    , horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ){
                    CalculatorButton(
                        symbol ="1",
                        modifier =Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {}
                    )
                    CalculatorButton(
                        symbol ="2",
                        modifier =Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {}
                    )
                    CalculatorButton(
                        symbol ="3",
                        modifier =Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {}
                    )
                    CalculatorButton(
                        symbol ="+",
                        modifier =Modifier
                            .background(Orange)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {}
                    )
                }
                Row (
                    modifier = Modifier.fillMaxWidth()
                    , horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ){
                    CalculatorButton(
                        symbol ="0",
                        modifier =Modifier
                            .background(MediumGray)
                            .aspectRatio(2f)
                            .weight(2f),
                        onClick = {}
                    )
                    CalculatorButton(
                        symbol =".",
                        modifier =Modifier
                            .background(MediumGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {}
                    )
                    CalculatorButton(
                        symbol ="=",
                        modifier =Modifier
                            .background(Orange)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {}
                    )
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