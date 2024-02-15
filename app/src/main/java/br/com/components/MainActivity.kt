package br.com.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import br.com.components.pieces.SpaceSize
import br.com.components.theme.DefaultThemes
import br.com.components.ui.Description
import br.com.components.ui.SimpleText
import br.com.components.ui.SubTitle
import br.com.components.ui.Title
import br.com.components.ui.theme.ComponentsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = DefaultThemes.color.background
                ) {
                    Column(modifier = Modifier.padding(SpaceSize.spaceSize16)) {
                        Title(title = stringResource(id = R.string.app_name))
                        SubTitle(subTitle = stringResource(id = R.string.app_name))
                        Description(description = stringResource(id = R.string.app_name))
                        SimpleText(text = stringResource(id = R.string.app_name))
                    }
                }
            }
        }
    }
}
