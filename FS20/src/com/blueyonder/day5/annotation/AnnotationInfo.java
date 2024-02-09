package com.blueyonder.day5.annotation;

import java.lang.reflect.Method;

public class AnnotationInfo {

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationDemo annotationDemo=new AnnotationDemo();
        Method method;
        try {
            method = annotationDemo.getClass().getMethod("test");
        } catch (NoSuchMethodException | SecurityException e) {
            throw new RuntimeException(e);
        }

        AuthorName authorName= method.getAnnotation(AuthorName.class);

        System.out.println(authorName.name());
        System.out.println(authorName.description());
    }
}
