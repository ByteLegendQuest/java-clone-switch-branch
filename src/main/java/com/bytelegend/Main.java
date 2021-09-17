package com.bytelegend;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(Base64.getEncoder().encodeToString("Hello, ByteLegend!".getBytes(StandardCharsets.UTF_8)));
    }
}
