package com.example.navigationtest.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navigationtest.ui.composable.PageOne
import com.example.navigationtest.ui.composable.PageTwo

/**
 * @Description
 * @Author WuJianFeng
 * @Date 2022/10/25 16:09
 */
@Composable
fun NavHostDemo(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = RouteConfig.ROUTE_PAGEONE){
        //todo wjf 建立对应体系
        composable(RouteConfig.ROUTE_PAGEONE){
            PageOne(navController)
        }

        composable(
            "${RouteConfig.ROUTE_PAGETWO}/{${ParamsConfig.PARAMS_NAME}}" +
                    "?${ParamsConfig.PARAMS_AGE}=${ParamsConfig.PARAMS_AGE}}",
            arguments = listOf(
                navArgument("${ParamsConfig.PARAMS_AGE}"){
                    defaultValue = 26
                    type = NavType.IntType
                } //默认会以字符串形式传递，可以指定类型
            )
        ){
            val argument = requireNotNull(it.arguments)
            val name = argument.getString(ParamsConfig.PARAMS_NAME)
            val age = argument.getInt(ParamsConfig.PARAMS_AGE)
            PageTwo(name,age,navController)
        }
    }
}