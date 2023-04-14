package com.mvc.config;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

// @Component
public class CustomControllerFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        String className = metadataReader.getClassMetadata().getClassName();
        boolean isRestController = metadataReader.getAnnotationMetadata()
                .hasAnnotation(RestController.class.getName());
        boolean isController = metadataReader.getAnnotationMetadata()
                .hasAnnotation(Controller.class.getName());
        return isController && !isRestController;
    }
}
