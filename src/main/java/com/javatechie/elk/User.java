package com.javatechie.elk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * This lmbok feature
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class User {

    private int id;
    private String name;
}
