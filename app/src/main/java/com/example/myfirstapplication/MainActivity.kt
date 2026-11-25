package com.example.myfirstapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstapplication.ui.theme.MyFirstApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                    Spacer(modifier = Modifier.height(16.dp))
//                    Hello(name = "rat")
//                    Spacer(modifier = Modifier.height(16.dp))
//                    Hello(name = null)
                    Box(modifier = Modifier.padding(innerPadding).fillMaxSize()) {
                        Task4()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun Task(num:Int, color: Color){
    Surface(color = color, shape = RoundedCornerShape(7.dp), modifier = Modifier.padding(vertical = 5.dp)){
        Text(
            text = "Task number $num",
            modifier = Modifier.padding(2.dp)
        )
    }
}
@Composable
fun Hello(name:String?){
    Text(
        text = if (name == null){"Name not specified"}
        else{"Hello, $name!"},
        modifier = Modifier.absoluteOffset(10.dp)
    )
}



@Composable
fun TextVariantOne(){
    Text(
        text = stringResource(id = R.string.jetpack_compose_description),
        color = Color(0xFF2A982C),
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center

    )
}
@Composable
fun TextVariantTwo(){
    Text(
        text = stringResource(id = R.string.jetpack_compose_description),
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
    )
}
@Composable
fun TextVariantThree(){
    Text(
        text = stringResource(id = R.string.jetpack_compose_description),
        color = Color.Black,
        fontSize = 24.sp,
        textDecoration = TextDecoration.Underline,
        modifier = Modifier.padding(start = 48.dp).background(color = Color(0xFF5BB75D))
    )
}

//----------------------------------------------------------------------------



@Preview(showBackground = true)
@Composable
fun HelloPreview() {
    MyFirstApplicationTheme {
        Column(modifier = Modifier.padding(16.dp) ){
            Task(1, Color(0xffffcbe1))
            Hello(name = "rat")
            Spacer(modifier = Modifier.height(5.dp))
            Hello(name = null)
        }
    }
}

@Preview(showBackground = true, name = "Portrait", showSystemUi = true, device = "spec:orientation=portrait,width=200dp,height=300dp")
@Composable
fun HelloPreviewPortrait(){
    Column(modifier = Modifier.padding(vertical = 30.dp) ) {
        MyFirstApplicationTheme {
            Task(2, Color(0xffffdab4))
            Hello("rat")
        }
    }
}
@Preview(showBackground = true, name = "Landscape", showSystemUi = true, device = "spec:orientation=landscape,width=300dp,height=200dp")
@Composable
fun HelloPreviewLandscape(){
    Column(modifier = Modifier.padding(vertical = 30.dp) ) {
        MyFirstApplicationTheme {
            Task(2, Color(0xffffdab4))
            Hello("rat")
        }
    }
}
@Preview(showBackground = true, name = "Round", showSystemUi = true, device = "spec:width=300dp,height=300dp,isRound=true")
@Composable
fun HelloPreviewRound(){
    Box(
        modifier = Modifier
            .background(Color(0xfffae1a7))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column(modifier = Modifier.padding()) {
            MyFirstApplicationTheme {
                Task(2, Color.White)
                Hello("rat")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TextVariantPrev(){
    Column(modifier = Modifier.padding()){
        Task(3, Color(0xffdcccea))
        TextVariantOne()
        Spacer(Modifier.padding(vertical = 10.dp))
        TextVariantTwo()
        Spacer(Modifier.padding(vertical = 10.dp))
        TextVariantThree()
    }
}


@Preview(showBackground = true)
@Composable
fun Task4(){
    Column{
        Task(4, Color(0xFFC5B8FF))
        Text(
            text = "FirstComposeProject",
            modifier = Modifier.background(Color(0xFF512A7A)).fillMaxWidth().padding(10.dp),
            color = Color.White,
            fontSize = 18.sp
        )
        Button(
            onClick = {}, modifier = Modifier.fillMaxWidth().padding(5.dp).shadow(4.dp),
            border = BorderStroke(2.dp, Color(0xFF424242)),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonColors(
                containerColor = Color(0xFFB4B0B0),
                contentColor = Color.Black,
                disabledContainerColor = Color(0xFF807C7C),
                disabledContentColor = Color.Black
            ),

            )
        {Text("Click on me")}

        Task(5, Color(0xFFFFA2A2))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(100.dp)
                .background(Color.Gray),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Box(modifier = Modifier
                .padding(vertical = 16.dp)
                .fillMaxHeight()
                .aspectRatio(1f)
                .background(Color(0xFFFFFFFF), shape = CircleShape),
                contentAlignment = Alignment.Center,
            )
            {Text("R A T", modifier = Modifier.padding(vertical = 16.dp))}
        }
    }
}
