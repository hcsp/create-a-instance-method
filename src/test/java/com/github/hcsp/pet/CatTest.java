package com.github.hcsp.pet;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    @CaptureSystemOutput
    public void catCanSayItsName(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsStringIgnoringCase("abcdef"));
        Cat cat = new Cat();
        cat.name = "ABCDEF";
        cat.sayName();
    }
}
