package com.bytelegend;

public abstract sealed class ByteLegend
    permits ByteLegendJDK11, ByteLegendJDK17 {
}

final class ByteLegendJDK11 extends ByteLegend {
}

final class ByteLegendJDK17 extends ByteLegend {
}

