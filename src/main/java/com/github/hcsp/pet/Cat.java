package com.github.hcsp.pet;

import com.github.hcsp.Home;

public class Cat {
    public String name;

    public void sayName() {
        // Print itself's name to standard output (System.out) here
        // 在这里将自己的名字打印到标准输出（System.out）
        if (name != null) {
            System.out.println(name);
        } else {
            System.out.println("没有名字");
        }

    }
}
