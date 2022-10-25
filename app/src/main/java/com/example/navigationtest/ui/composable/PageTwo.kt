package com.example.navigationtest.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

/**
 * @Description
 * @Author WuJianFeng
 * @Date 2022/10/25 16:06
 */
@Composable
fun PageTwo(name: String?= "", age: Int? = 0, navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.White)) {
        Text(text = "页面2")
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "我是$name,今年$age 岁了")
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "返回页面1",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center)
        }

    }
}