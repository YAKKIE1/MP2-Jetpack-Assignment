package za.ac.cput.mp2.assignment02

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import za.ac.cput.mp2.assignment02.ui.theme.blueVariant
import za.ac.cput.mp2.assignment02.ui.theme.coolBlue
import za.ac.cput.mp2.assignment02.ui.theme.lightBlue
import za.ac.cput.mp2.assignment02.ui.theme.white

@Composable
fun AboutMeScreen(navController: NavController) {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        TextDetails()
        Spacer(modifier = Modifier.height(40.dp))
        ButtonViewModules()
    }
}

@Composable
fun TextDetails() {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(20.dp, 0.dp, 20.dp, 0.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Full Name: ",
            color = blueVariant,
            fontSize = 17.sp,
            lineHeight = 30.sp
        )
        Text(text = "Ali Mohamed",
            color = blueVariant,
            fontSize = 17.sp,
            lineHeight = 30.sp)
    }
    Spacer(modifier = Modifier.height(30.dp))
    Row(
        Modifier
            .fillMaxWidth()
            .padding(20.dp, 0.dp, 20.dp, 0.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Course of Study: ",
            color = blueVariant,
            fontSize = 17.sp,
            lineHeight = 30.sp)
        Text(text = "DIP: ICT",
            color = blueVariant,
            fontSize = 17.sp,
            lineHeight = 30.sp)
    }
    Spacer(modifier = Modifier.height(30.dp))
    Row(
        Modifier
            .fillMaxWidth()
            .padding(20.dp, 0.dp, 20.dp, 0.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Department : ",
            color = blueVariant,
            fontSize = 17.sp,
            lineHeight = 30.sp
        )
        Text(text = "Application Development",
            color = blueVariant,
            fontSize = 17.sp,
            lineHeight = 30.sp)
    }
    Spacer(modifier = Modifier.height(30.dp))
    Row(
        Modifier
            .fillMaxWidth()
            .padding(20.dp, 0.dp, 20.dp, 0.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Student Number : ",
            color = blueVariant,
            fontSize = 17.sp,
            lineHeight = 30.sp)
        Text(text = "219113505",
            color = blueVariant,
            fontSize = 17.sp,
            lineHeight = 30.sp)

    }
}

@Composable
fun ButtonViewModules() {
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(50),
        modifier = Modifier
            .fillMaxWidth(0.68f),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent
        ),
        contentPadding = PaddingValues() //removes padding between button and box
    ) {
        Box(
            modifier = Modifier
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(
                            coolBlue,
                            lightBlue
                        )
                    )
                )
                .padding(16.dp, 8.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .fillMaxWidth(1f),
            contentAlignment = Alignment.Center,
        ){
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    imageVector = Icons.Filled.List,
                    contentDescription = "View Modules",
                    colorFilter = ColorFilter.tint(white)
                )
                Text(
                    text = "View Current Modules",
                    modifier = Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp),
                    color = white,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W500
                )
            }
        }
    }
}

@Preview
@Composable
fun AboutMeScreenPreview() {
    AboutMeScreen(rememberNavController())
}