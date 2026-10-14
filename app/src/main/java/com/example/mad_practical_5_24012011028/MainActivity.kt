package com.example.mad_practical_5_24012011028

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mad_practical_5_24012011028.ui.theme.MAD_PRACTICAL_5_24012011028Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MAD_PRACTICAL_5_24012011028Theme {
                AppNavigation(this)
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    androidx.compose.material3.Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MAD_PRACTICAL_5_24012011028Theme {
        Greeting("Android")
    }
}
@Composable
@Preview
fun ButtonDemo(){
    var counter by remember { mutableStateOf(1) }
    Button(
        onClick = {
            counter+=1
        }
    ){
        Text(
            text = counter.toString(),
        )

    }
}