package com.example.study.controller;

import com.example.study.ifs.CrudInterface;
import com.example.study.model.network.Header;
import com.example.study.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;


@Component
public abstract class CrudContoller<Req, Res, Entity> implements CrudInterface<Req, Res> {


    //CRUD Controller 추상화 모든 controller 클래스에서 CRUD 별도 구현을 할 필요가 없음
    @Autowired(required = false)
    protected BaseService<Req, Res, Entity> baseService;

    @Override
    @PostMapping("")
    public Header<Res> create(@RequestBody Header<Req> request) {
        return baseService.create(request);
    }

    @Override
    @GetMapping("{id}")
    public Header<Res> read(@PathVariable Long id) {
        return baseService.read(id);
    }

    @Override
    @PutMapping("")
    public Header<Res> update(@RequestBody Header<Req> request) {
        return baseService.update(request);
    }

    @Override
    @DeleteMapping("{id}")
    public Header delete(@PathVariable Long id) {
        return baseService.delete(id);
    }
}
