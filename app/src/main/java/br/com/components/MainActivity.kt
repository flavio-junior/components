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
import br.com.components.theme.SetStatusBarColor
import br.com.components.theme.Theme
import br.com.components.theme.Themes
import br.com.components.ui.Description
import br.com.components.ui.SimpleText
import br.com.components.ui.SubTitle
import br.com.components.ui.Title

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SetStatusBarColor(color = Themes.colors.secondary)
            Surface(
                modifier = Modifier.fillMaxSize()
            ) {
                Theme {
                    Column(modifier = Modifier.padding(all = SpaceSize.spaceSize16)) {
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
