package com.example.pattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProjectFactory {
    Project project;

    Project copyObject() {
        return (Project) project.copy();
    }
}
