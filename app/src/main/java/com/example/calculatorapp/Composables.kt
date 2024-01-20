package com.example.calculatorapp

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculatorapp.ui.theme.BlackBackground
import com.example.calculatorapp.ui.theme.DarkGray
import com.example.calculatorapp.ui.theme.FullTransparent
import com.example.calculatorapp.ui.theme.HalfTransparent
import com.example.calculatorapp.ui.theme.LightBlue
import com.example.calculatorapp.ui.theme.LightGray
import com.example.calculatorapp.ui.theme.LightWhite
import com.example.calculatorapp.ui.theme.LinearWhitToBlue
import com.example.calculatorapp.ui.theme.NumberLightBtnColor
import com.example.calculatorapp.ui.theme.NumberLightTxtColor
import com.example.calculatorapp.ui.theme.SolidBlue
import com.example.calculatorapp.ui.theme.SolidWhite


@Composable
fun ComposeButton(
    text: String,
    fontSize: TextUnit,
    height: Dp,
    width: Dp,
    roundSize: Int,
    lightBg: Color,
    darkBg: Color,
    lightTxtColor: Color,
    darkTxtColor: Color,
    onClick: Unit? = null
) {
    val context = LocalContext.current
    val isDarkMode = remember {
        mutableStateOf(false)
    }
    isDarkMode.value = isSystemInDarkTheme()
    Button(
        onClick = {
            onClick
        },
        modifier = Modifier
            .height(height)
            .width(width),
        colors = ButtonDefaults.buttonColors(
            containerColor = when (isDarkMode.value) {
                true -> {
                    darkBg
                }

                false -> {
                    lightBg
                }
            }
        ),
        contentPadding = PaddingValues(8.dp),
        shape = RoundedCornerShape(roundSize)

    ) {
        Text(
            text = text,
            style = TextStyle(
                fontSize = fontSize,
                color = when (isDarkMode.value) {
                    true -> {
                        darkTxtColor
                    }

                    false -> {
                        lightTxtColor
                    }
                },
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            ),
        )
    }
}

@Composable
fun ComposeButtonWithIcon(
    icon: Painter,
    iconSize: Dp,
    height: Dp,
    width: Dp,
    roundSize: Int,
    lightBg: Color,
    darkBg: Color,
    onClick: Unit? = null
) {
    val context = LocalContext.current
    val isDarkMode = remember {
        mutableStateOf(false)
    }
    isDarkMode.value = isSystemInDarkTheme()
    Button(
        onClick = {
            onClick
        },
        modifier = Modifier
            .height(height)
            .width(width),
        colors = ButtonDefaults.buttonColors(
            containerColor = when (isDarkMode.value) {
                true -> {
                    darkBg
                }

                false -> {
                    lightBg
                }
            }
        ),
        contentPadding = PaddingValues(8.dp),
        shape = RoundedCornerShape(roundSize)

    ) {
        Icon(
            painter = icon, contentDescription = "delete btn", Modifier.size(iconSize),
            tint = when (isDarkMode.value) {
                true -> {
                    lightBg
                }

                false -> {
                    darkBg
                }
            }
        )
    }
}

@Composable
fun FirstRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(
            20.dp,
            alignment = Alignment.CenterHorizontally
        ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        ComposeButton(
            text = "e",
            fontSize = 18.sp,
            height = 40.dp,
            width = 62.dp,
            roundSize = 40,
            lightBg = NumberLightBtnColor,
            darkBg = DarkGray,
            lightTxtColor = NumberLightTxtColor,
            darkTxtColor = SolidBlue
        )

        ComposeButton(
            text = "µ",
            fontSize = 18.sp,
            height = 40.dp,
            width = 62.dp,
            roundSize = 40,
            lightBg = NumberLightBtnColor,
            darkBg = DarkGray,
            lightTxtColor = NumberLightTxtColor,
            darkTxtColor = SolidBlue
        )
        ComposeButton(
            text = "sin",
            fontSize = 18.sp,
            height = 40.dp,
            width = 62.dp,
            roundSize = 40,
            lightBg = NumberLightBtnColor,
            darkBg = DarkGray,
            lightTxtColor = NumberLightTxtColor,
            darkTxtColor = SolidBlue
        )
        ComposeButton(
            text = "deg",
            fontSize = 18.sp,
            height = 40.dp,
            width = 62.dp,
            roundSize = 40,
            lightBg = NumberLightBtnColor,
            darkBg = DarkGray,
            lightTxtColor = NumberLightTxtColor,
            darkTxtColor = SolidBlue
        )
    }
}

@Preview(uiMode = UI_MODE_NIGHT_NO)
@Composable
fun FirstRowPreview1() {
    FirstRow()
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun FirstRowPreview2() {
    FirstRow()
}


@Composable
fun SecondRow() {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(
            20.dp,
            alignment = Alignment.CenterHorizontally
        ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        ComposeButton(
            text = "Ac",
            fontSize = 32.sp,
            height = 62.dp,
            width = 62.dp,
            roundSize = 16,
            lightBg = LightWhite,
            darkBg = LightGray,
            lightTxtColor = LightBlue,
            darkTxtColor = LightWhite
        )

        ComposeButtonWithIcon(
            icon = painterResource(id = R.drawable.delete),
            iconSize = 32.dp,
            height = 62.dp,
            width = 62.dp,
            roundSize = 16,
            lightBg = LightWhite,
            darkBg = LightGray
        )

        ComposeButton(
            text = "/",
            fontSize = 32.sp,
            height = 62.dp,
            width = 62.dp,
            roundSize = 16,
            lightBg = LightBlue,
            darkBg = SolidBlue,
            lightTxtColor = SolidBlue,
            darkTxtColor = LightBlue
        )



        ComposeButtonWithIcon(
            icon = painterResource(id = R.drawable.multi),
            iconSize = 18.dp,
            height = 62.dp,
            width = 62.dp,
            roundSize = 16,
            lightBg = LightBlue,
            darkBg = SolidBlue
        )

    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun SecondRowPreview_Dark() {
    SecondRow()
}

@Preview(uiMode = UI_MODE_NIGHT_NO)
@Composable
fun SecondRowPreview_Light() {
    SecondRow()
}

@Composable
fun NumbersPad() {
    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically
        ) {
            ComposeButton(
                text = "7",
                fontSize = 32.sp,
                height = 62.dp,
                width = 62.dp,
                roundSize = 16,
                lightBg = NumberLightBtnColor,
                darkBg = DarkGray,
                lightTxtColor = NumberLightTxtColor,
                darkTxtColor = LightBlue
            )

            ComposeButton(
                text = "8",
                fontSize = 32.sp,
                height = 62.dp,
                width = 62.dp,
                roundSize = 16,
                lightBg = NumberLightBtnColor,
                darkBg = DarkGray,
                lightTxtColor = NumberLightTxtColor,
                darkTxtColor = LightBlue
            )

            ComposeButton(
                text = "9",
                fontSize = 32.sp,
                height = 62.dp,
                width = 62.dp,
                roundSize = 16,
                lightBg = NumberLightBtnColor,
                darkBg = DarkGray,
                lightTxtColor = NumberLightTxtColor,
                darkTxtColor = LightBlue
            )
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically
        ) {
            ComposeButton(
                text = "4",
                fontSize = 32.sp,
                height = 62.dp,
                width = 62.dp,
                roundSize = 16,
                lightBg = NumberLightBtnColor,
                darkBg = DarkGray,
                lightTxtColor = NumberLightTxtColor,
                darkTxtColor = LightBlue
            )

            ComposeButton(
                text = "5",
                fontSize = 32.sp,
                height = 62.dp,
                width = 62.dp,
                roundSize = 16,
                lightBg = NumberLightBtnColor,
                darkBg = DarkGray,
                lightTxtColor = NumberLightTxtColor,
                darkTxtColor = LightBlue
            )

            ComposeButton(
                text = "6",
                fontSize = 32.sp,
                height = 62.dp,
                width = 62.dp,
                roundSize = 16,
                lightBg = NumberLightBtnColor,
                darkBg = DarkGray,
                lightTxtColor = NumberLightTxtColor,
                darkTxtColor = LightBlue
            )
        }



        Row(
            horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically
        ) {
            ComposeButton(
                text = "1",
                fontSize = 32.sp,
                height = 62.dp,
                width = 62.dp,
                roundSize = 16,
                lightBg = NumberLightBtnColor,
                darkBg = DarkGray,
                lightTxtColor = NumberLightTxtColor,
                darkTxtColor = LightBlue
            )

            ComposeButton(
                text = "2",
                fontSize = 32.sp,
                height = 62.dp,
                width = 62.dp,
                roundSize = 16,
                lightBg = NumberLightBtnColor,
                darkBg = DarkGray,
                lightTxtColor = NumberLightTxtColor,
                darkTxtColor = LightBlue
            )

            ComposeButton(
                text = "3",
                fontSize = 32.sp,
                height = 62.dp,
                width = 62.dp,
                roundSize = 16,
                lightBg = NumberLightBtnColor,
                darkBg = DarkGray,
                lightTxtColor = NumberLightTxtColor,
                darkTxtColor = LightBlue
            )
        }


        Row(
            horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically
        ) {
            ComposeButton(
                text = "0",
                fontSize = 32.sp,
                height = 62.dp,
                width = 144.dp,
                roundSize = 16,
                lightBg = NumberLightBtnColor,
                darkBg = DarkGray,
                lightTxtColor = NumberLightTxtColor,
                darkTxtColor = LightBlue
            )

            ComposeButton(
                text = ".",
                fontSize = 32.sp,
                height = 62.dp,
                width = 62.dp,
                roundSize = 16,
                lightBg = NumberLightBtnColor,
                darkBg = DarkGray,
                lightTxtColor = NumberLightTxtColor,
                darkTxtColor = LightBlue
            )


        }

    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun NumbersPreview_Dark() {
    NumbersPad()
}

@Preview(uiMode = UI_MODE_NIGHT_NO)
@Composable
fun NumbersPreview_Light() {
    NumbersPad()
}


@Composable
fun OperationsColumn() {
    Column(
        Modifier.heightIn(),
        verticalArrangement = Arrangement.spacedBy(25.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ComposeButton(
            text = "-",
            fontSize = 40.sp,
            height = 62.dp,
            width = 62.dp,
            roundSize = 16,
            lightBg = LightBlue,
            darkBg = SolidBlue,
            lightTxtColor = SolidBlue,
            darkTxtColor = LightBlue
        )

        ComposeButton(
            text = "+",
            fontSize = 40.sp,
            height = 96.dp,
            width = 62.dp,
            roundSize = 16,
            lightBg = LightBlue,
            darkBg = SolidBlue,
            lightTxtColor = SolidBlue,
            darkTxtColor = LightBlue
        )

        ComposeButton(
            text = "=",
            fontSize = 40.sp,
            height = 96.dp,
            width = 62.dp,
            roundSize = 16,
            lightBg = SolidBlue,
            darkBg = SolidBlue,
            lightTxtColor = LightBlue,
            darkTxtColor = LightBlue
        )
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun Operations_dark() {
    OperationsColumn()
}

@Preview(uiMode = UI_MODE_NIGHT_NO)
@Composable
fun Operations_Light() {
    OperationsColumn()
}


@Composable
fun ThirdRow() {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(
            20.dp,
            alignment = Alignment.CenterHorizontally
        ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        NumbersPad()
        OperationsColumn()
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun ThirdRow_Dark() {
    ThirdRow()
}

@Preview(uiMode = UI_MODE_NIGHT_NO)
@Composable
fun ThirdRow_Light() {
    ThirdRow()
}


@ExperimentalMaterial3Api
@Composable
fun CalculatorScreen() {
    val isDarkMode = remember {
        mutableStateOf(false)
    }
    isDarkMode.value = isSystemInDarkTheme()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = LinearWhitToBlue),
        verticalArrangement = Arrangement.Bottom
    ) {
        val editableTxt = remember {
            mutableStateOf("=12,456")
        }


        Column(
            Modifier
                .fillMaxSize()
                .weight(1f)
                .background(color = when (isDarkMode.value) {
                    true -> {
                        BlackBackground
                    }

                    false -> {
                        FullTransparent
                    }
                },)) {
            TextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .padding(top = 150.dp),
                readOnly = true,
                textStyle = TextStyle(
                    fontSize = 60.sp,
                    textAlign = TextAlign.Right
                ),
                value = editableTxt.value,
                onValueChange = { editableTxt.value = it },
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = FullTransparent,
                    textColor = when (isDarkMode.value) {
                        true -> {
                            SolidWhite
                        }

                        false -> {
                            BlackBackground
                        }
                    },
                    unfocusedIndicatorColor = FullTransparent
                )
            )


            Column(
                Modifier
                    .fillMaxSize().padding(top = 50.dp)
            ) {
                FirstRow()
                SecondRow()
                ThirdRow()
            }
        }


    }
}

@ExperimentalMaterial3Api
@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun Screen_Dark() {
    CalculatorScreen()
}

@ExperimentalMaterial3Api
@Preview(uiMode = UI_MODE_NIGHT_NO)
@Composable
fun Screen_Light() {
    CalculatorScreen()
}