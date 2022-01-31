package com.example.a11ycomposemanuallistsemanticstest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.a11ycomposemanuallistsemanticstest.ui.theme.A11yComposeManualListSemanticsTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            A11yComposeManualListSemanticsTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    GreetingStepList("Android")
                }
            }
        }
    }
}

@Composable
fun GreetingStepList(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = "How to greet people",
            modifier = modifier.semantics {
                heading()
            },
            fontSize = 18.sp,
            fontWeight = FontWeight.SemiBold
        )
        Column(
            modifier = modifier.semantics {
                collectionInfo = CollectionInfo(rowCount = 4, columnCount = 1)
            }
        ) {
            Text(
                text = "1. Say \"Hello, $name!\"",
                modifier.semantics {
                    collectionItemInfo = CollectionItemInfo(
                        rowIndex = 0,
                        rowSpan = 1,
                        columnIndex = 0,
                        columnSpan = 1
                    )
                }
            )
            Text(
                text = "2. Extend right hand, open palm to left, thumb slightly raised",
                modifier.semantics {
                    collectionItemInfo = CollectionItemInfo(
                        rowIndex = 1,
                        rowSpan = 1,
                        columnIndex = 0,
                        columnSpan = 1
                    )
                }
            )
            Text(
                text = "3. Clasp hands firmly, but gently.",
                modifier.semantics {
                    collectionItemInfo = CollectionItemInfo(
                        rowIndex = 2,
                        rowSpan = 1,
                        columnIndex = 0,
                        columnSpan = 1
                    )
                }
            )
            Text(
                text = "4. Shake hands briefly, then unclasp hands and return your right hand to your side.",
                modifier.semantics {
                    collectionItemInfo = CollectionItemInfo(
                        rowIndex = 3,
                        rowSpan = 1,
                        columnIndex = 0,
                        columnSpan = 1
                    )
                }
            )
        }
        Text(
            text = "End of instructions"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    A11yComposeManualListSemanticsTestTheme {
        GreetingStepList("Android")
    }
}