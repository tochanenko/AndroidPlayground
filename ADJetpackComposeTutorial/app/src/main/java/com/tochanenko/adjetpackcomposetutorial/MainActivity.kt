package com.tochanenko.adjetpackcomposetutorial

import SampleData
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.tochanenko.adjetpackcomposetutorial.composables.Conversation
import com.tochanenko.adjetpackcomposetutorial.ui.theme.ADJetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ADJetpackComposeTutorialTheme {
                Conversation(messages = SampleData.conversationSample)
            }
        }
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PreviewMainActivity() {
    ADJetpackComposeTutorialTheme {
        Conversation(messages = SampleData.conversationSample)
    }
}