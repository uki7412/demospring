package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor //引数のないデフォルトコンストラクターも作ってくれる
public class Exebean {
    private Integer exeNo;
    private String exeName;
    private Integer exeMets;
    private String exeDescription;    
}
