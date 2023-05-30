package com.cataractaction.ui.screen.register

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cataractaction.ui.components.auth.ButtonAuth
import com.cataractaction.ui.components.auth.ButtonAuthGoogle
import com.cataractaction.ui.components.auth.DividerAuth
import com.cataractaction.ui.components.auth.LogoTitle
import com.cataractaction.ui.components.auth.TextAuth
import com.cataractaction.ui.components.auth.TextFieldEmail
import com.cataractaction.ui.components.auth.TextFieldName
import com.cataractaction.ui.components.auth.TextFieldPassword
import com.cataractaction.ui.components.auth.TextTitle

@Composable
fun RegisterScreen(navigate: () -> Unit, navigateToHome: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        LogoTitle()
        Column(modifier = Modifier.padding(horizontal = 40.dp)) {
            TextTitle(true)
            TextFieldName()
            Spacer(Modifier.size(14.dp))
            TextFieldEmail()
            Spacer(Modifier.size(14.dp))
            TextFieldPassword()
            Spacer(Modifier.size(30.dp))
            ButtonAuth(true, navigateToHome)
            DividerAuth()
            ButtonAuthGoogle(true)
            Spacer(Modifier.size(5.dp))
            TextAuth(navigate, true)
            Spacer(Modifier.size(25.dp))
        }
    }
}