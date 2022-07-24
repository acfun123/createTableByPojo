package com.example.demo.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="test")
public class Test {

    @Column(name="id",type= MySqlTypeConstant.VARCHAR)
    private String id;

    @Column(name="value",type = MySqlTypeConstant.VARCHAR)
    private String value;

    @Column(name="comment",type = MySqlTypeConstant.VARCHAR)
    private String comment;

}

