package com.xie.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 类描述
 *
 * @author : xiexf
 * @version : 1.0
 * @date : 2020/5/28 11:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    Long id;
    String serial;
}
