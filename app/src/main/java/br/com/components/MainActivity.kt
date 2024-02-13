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
import br.com.components.ui.theme.ComponentsTheme
import br.com.resources.R
import br.com.resources.pieces.SpaceSize
import br.com.resources.theme.DefaultThemes
import br.com.resources.ui.Description
import br.com.resources.ui.SimpleText
import br.com.resources.ui.SubTitle
import br.com.resources.ui.Title

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
                        Title(title = stringResource(id = R.string.template))
                        SubTitle(subTitle = stringResource(id = R.string.template))
                        Description(description = stringResource(id = R.string.template))
                        SimpleText(text = stringResource(id = R.string.template))
                    }
                }
            }
        }
    }
}
