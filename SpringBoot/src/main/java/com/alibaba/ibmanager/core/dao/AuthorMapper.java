package com.alibaba.ibmanager.core.dao;

import com.alibaba.ibmanager.core.model.Author;

public interface AuthorMapper extends tk.mybatis.mapper.common.BaseMapper<Author>,
    tk.mybatis.mapper.common.ConditionMapper<Author>, tk.mybatis.mapper.common.IdsMapper<Author>,
    tk.mybatis.mapper.common.special.InsertListMapper<Author> {
}