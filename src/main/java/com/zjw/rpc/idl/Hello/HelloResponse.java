package com.zjw.rpc.idl.Hello;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;


@Data
@AllArgsConstructor
public class HelloResponse implements Serializable {
    private String msg;
}