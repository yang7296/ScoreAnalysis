package com.scoreanalysis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.scoreanalysis"})
@SpringBootApplication
@MapperScan(basePackages = {"com.scoreanalysis.dao","com.scoreanalysis.daoExtend"})
public class ScoreanalysisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScoreanalysisApplication.class, args);
    }
}
//20kuaiqian!  等一下啊  我再看一下之前的mapper