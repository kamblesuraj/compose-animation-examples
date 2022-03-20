package dev.baseio.composeplayground.ui.animations.netflixanim

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.AnimationVector1D
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import dev.baseio.composeplayground.ui.animations.baseColor


@Composable
fun EffectBrush(
  brushMoving: Animatable<Float, AnimationVector1D>,
  helperOneWidth: Dp,
  helperOneHeight: Dp
) {
  val widthPx = with(LocalDensity.current) {
    helperOneWidth.toPx()
  }

  Box(
    modifier = Modifier
      .graphicsLayer(translationY = brushMoving.value)
      .fillMaxWidth(1f)
      .fillMaxHeight(3f)
  ) {

    repeat(brushFurList.size) {
      val brushFur = brushFurList[it]
      Box(
        modifier = Modifier
          .width((brushFur.width.div(100)).times(helperOneWidth))
          .height(0.3f.times(helperOneHeight))
          .graphicsLayer(translationY = brushMoving.value)
          .background(brushFur.background)
          .offset {
            IntOffset(
              ((brushFur.left.div(100))
                .times(widthPx)
                .toInt()),
              0
            )
          }
      )
    }

  }
}


val brushFurList = mutableListOf<BrushFurModel>().apply {

  add(
    BrushFurModel(
      left = 0f, width = 3.8f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(15f, baseColor),
        Pair(81f, Color(0, 0, 0, 0)),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )

  add(
    BrushFurModel(
      left = 3.8f, width = 2.8f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(10f, baseColor),
        Pair(62f, Color(0, 0, 0, 0)),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )

  add(
    BrushFurModel(
      left = 6.6f, width = 4.8f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(37f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )

  add(
    BrushFurModel(
      left = 11.4f, width = 4f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(23f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )

  add(
    BrushFurModel(
      left = 15.4f, width = 4f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(15f, baseColor),
        Pair(86f, Color(0, 0, 0, 0)),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )

  add(
    BrushFurModel(
      left = 19.4f, width = 2.5f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(27f, baseColor),
        Pair(89f, Color(0, 0, 0, 0)),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )

  add(
    BrushFurModel(
      left = 21.9f, width = 4f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(20f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )

  add(
    BrushFurModel(
      left = 25.9f, width = 2f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(30f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )

  add(
    BrushFurModel(
      left = 27.9f, width = 4f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(35f, baseColor),
        Pair(95f, Color(0, 0, 0, 0)),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )

  add(
    BrushFurModel(
      left = 31.9f, width = 3.5f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(39f, baseColor),
        Pair(95f, Color(0, 0, 0, 0)),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )

  add(
    BrushFurModel(
      left = 35.4f, width = 2f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(34f, baseColor),
        Pair(95f, Color(0, 0, 0, 0)),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )

  add(
    BrushFurModel(
      left = 37.4f, width = 2.6f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(22f, baseColor),
        Pair(95f, Color(0, 0, 0, 0)),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )

  add(
    BrushFurModel(
      left = 40f, width = 6f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(47f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )

  add(
    BrushFurModel(
      left = 46f, width = 2f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(36f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )

  add(
    BrushFurModel(
      left = 48f, width = 5.5f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(29f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )

  add(
    BrushFurModel(
      left = 53.5f, width = 3f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(39f, baseColor),
        Pair(95f, Color(0, 0, 0, 0)),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )
  add(
    BrushFurModel(
      left = 56.5f, width = 4.1f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(45f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )
  add(
    BrushFurModel(
      left = 60.6f, width = 2.4f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(34f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )
  add(
    BrushFurModel(
      left = 63f, width = 4f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(47f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )

  add(
    BrushFurModel(
      left = 67f, width = 1.5f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(27f, baseColor),
        Pair(95f, Color(0, 0, 0, 0)),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )
  add(
    BrushFurModel(
      left = 68.5f, width = 2.8f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(37f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )
  add(
    BrushFurModel(
      left = 71.3f, width = 2.3f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(9f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )
  add(
    BrushFurModel(
      left = 73.6f, width = 2.2f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(28f, baseColor),
        Pair(92f, Color(0, 0, 0, 0)),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )
  add(
    BrushFurModel(
      left = 75.8f, width = 1f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(37f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )
  add(
    BrushFurModel(
      left = 76.8f, width = 2.1f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(28f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )
  add(
    BrushFurModel(
      left = 78.9f, width = 4.1f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(21f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )
  add(
    BrushFurModel(
      left = 83f, width = 2.5f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(21f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )
  add(
    BrushFurModel(
      left = 85.5f, width = 4.5f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(39f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )
  add(
    BrushFurModel(
      left = 90f, width = 2.8f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(30f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )
  add(
    BrushFurModel(
      left = 92.8f, width = 3.5f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(19f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )
  add(
    BrushFurModel(
      left = 96.3f, width = 3.7f,
      background = Brush.verticalGradient(
        Pair(0f, baseColor),
        Pair(37f, baseColor),
        Pair(100f, Color(0, 0, 0, 0))
      )
    )
  )
  reverse()
}