package com.tochanenko.adjetpackcomposetutorial.composables

import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.tochanenko.adjetpackcomposetutorial.dto.Message
import com.tochanenko.adjetpackcomposetutorial.ui.theme.ADJetpackComposeTutorialTheme

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) { message -> MessageCard(msg = message)}
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun ConversationPreview() {
    ADJetpackComposeTutorialTheme {
        Conversation(messages = SampleData.conversationSample)
    }
}