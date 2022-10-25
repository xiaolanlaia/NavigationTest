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
import com.example.navigationtest.nav.RouteConfig

/**
 * @Description
 * @Author WuJianFeng
 * @Date 2022/10/25 16:05
 */

@Composable
fun PageOne(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.White)
    ) {
        Text(text = "页面1")
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            navController.navigate("${RouteConfig.ROUTE_PAGETWO}/吴剑锋")
        }) {
            Text(
                text = "跳转页面2",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
    }
}