package com.blueyonder.day5.annotation;

public class AnnotationDemo {
    @AuthorName(name = "Nilanjana", description = "A demo of custom annotation.")
    public void test()
    {
        for (int i = 0; i < 5; i++)
            System.out.println(i);
    }
}
