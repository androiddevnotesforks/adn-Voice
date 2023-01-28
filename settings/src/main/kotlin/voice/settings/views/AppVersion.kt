package voice.settings.views

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Tag
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import voice.settings.R

@Composable
internal fun AppVersion(appVersion: String) {
  ListItem(
    modifier = Modifier.fillMaxWidth(),
    leadingContent = {
      Icon(
        imageVector = Icons.Outlined.Tag,
        contentDescription = stringResource(R.string.pref_app_version),
      )
    },
    headlineText = {
      Text(
        text = stringResource(R.string.pref_app_version),
        color = LocalContentColor.current.copy(alpha = 0.5F),
      )
    },
    supportingText = {
      Text(
        text = appVersion,
        color = LocalContentColor.current.copy(alpha = 0.5F),
      )
    },
  )
}
