package com.example.codigotest1.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.codigotest1.R
import com.example.codigotest1.viewmodel.WelcomeViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WelcomeScreen(
    navController: NavController,
    viewModel: WelcomeViewModel = hiltViewModel()
) {
    Scaffold(
        content = { innerPadding ->

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .padding(innerPadding)
                ) {
                    Box(modifier =
                    Modifier.fillMaxSize()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.welcome),
                            contentDescription = "Welcome Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                        Image(
                            painter = painterResource(id = R.drawable.clouds),
                            contentDescription = "Cloud Image",
                            contentScale = ContentScale.Crop,

                            modifier = Modifier
                                .align(Alignment.BottomCenter)

                                .fillMaxWidth()
                        )

                        Column(
                            modifier = Modifier.align(Alignment.BottomCenter)
                        ) {
                            Text(text = "Welcome to\n Ready To Travel")
                            Text(text = "Sign up with Facebook for the most fulfilling trip planning experience with us!")

                            LoginWithFacebookButton()
                            LoginWithEmailButton()
                            CreateNewAccountButton(navController = navController)
                        }
                    }


            }
        }
    )
}


@Composable
fun LoginWithFacebookButton() {
    Button(
        onClick = { /* TODO: Handle Facebook login */ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text("Login with Facebook")
    }
}

@Composable
fun LoginWithEmailButton() {
    Button(
        onClick = { /* TODO: Handle Email login */ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text("Login with Email Address")
    }
}

@Composable
fun CreateNewAccountButton(navController: NavController) {
    Button(
        onClick = {
                  navController.navigate("create_account_screen")
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text("Create a New Account")
    }
}