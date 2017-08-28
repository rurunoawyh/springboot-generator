package com.alibaba.ibmanager.core.web;
import com.alibaba.ibmanager.core.model.Author;
import com.alibaba.ibmanager.core.service.AuthorService;
import com.alibaba.ibmanager.core.Result;
import com.alibaba.ibmanager.core.ResultGenerator;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/08/28.
*/
@RestController
@RequestMapping("/author")
public class AuthorController {
    @Resource
    private AuthorService authorService;

    @PostMapping("/add")
    public Result add(Author author) {
        authorService.save(author);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        authorService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Author author) {
        authorService.update(author);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Author author = authorService.findById(id);
        return ResultGenerator.genSuccessResult(author);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Author> list = authorService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
