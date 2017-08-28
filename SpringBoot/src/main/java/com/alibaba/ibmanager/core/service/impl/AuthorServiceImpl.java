package com.alibaba.ibmanager.core.service.impl;

import com.alibaba.ibmanager.core.dao.AuthorMapper;
import com.alibaba.ibmanager.core.model.Author;
import com.alibaba.ibmanager.core.service.AuthorService;
import com.alibaba.ibmanager.core.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/08/28.
 */
@Service
@Transactional
public class AuthorServiceImpl extends AbstractService<Author> implements AuthorService {
    @Autowired
    private AuthorMapper authorMapper;

}
