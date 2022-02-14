package com.geeksforgeeks.changebuttonsize

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.geeksforgeeks.changebuttonsize.ui.theme.ChangeButtonSizeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }
}

@Composable
fun MainContent(){
    Scaffold(
        topBar = {TopAppBar(
            title = {Text(
                "GFG | Change Button Size",
                color = Color.White)},
            backgroundColor = Color(0xff0f9d58)
        ) },
        content = { MyContent()}
    )
}

@Composable
fun MyContent(){
    Column(Modifier.fillMaxWidth().absolutePadding(10.dp, 100.dp, 10.dp, 0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0XFF0F9D58)),
            ) {
            Text("Regular Button", color = Color.White)
        }
    }

    Column(Modifier.fillMaxWidth().absolutePadding(10.dp, 200.dp, 10.dp, 0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0XFF0F9D58)),
            modifier = Modifier.height(100.dp).width(200.dp)
        ) {
            Text("Big Button", color = Color.White, fontSize = 30.sp)
        }
    }

    Column(Modifier.fillMaxWidth().absolutePadding(10.dp, 350.dp, 10.dp, 0.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0XFF0F9D58)),
            modifier = Modifier.height(30.dp).width(100.dp)
        ) {
            Text("Small Button", color = Color.White, fontSize = 7.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainContent()
}