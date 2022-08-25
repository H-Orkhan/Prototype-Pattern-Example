package com.example.pattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Project implements Copyable {
    private int id;
    private String projectName;
    private String sourceCode;

    @Override
    public Object copy() {
        return new Project(id, projectName, sourceCode);
    }


}
