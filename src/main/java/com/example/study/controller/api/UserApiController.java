package com.example.study.controller.api;

import com.example.study.ifs.CrudInterface;
import com.example.study.model.network.Header;
import com.example.study.model.network.request.UserApiRequest;
import com.example.study.model.network.response.UserApiResponse;
import com.example.study.service.UserApiLogicService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserApiController implements CrudInterface<UserApiRequest, UserApiResponse> {

    private final UserApiLogicService userApiLogicService;

    @Override
    @PostMapping("")
    public Header<UserApiResponse> create(@RequestBody Header<UserApiRequest> request) {
        log.info("{}", request);
        return userApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}")
    public Header<UserApiResponse> read(Long id) {
        return null;
    }

    @Override
    @PutMapping("")
    public Header<UserApiResponse> update(Header<UserApiRequest> userApiRequest) {
        return null;
    }

    @Override
    @DeleteMapping("{id}")
    public Header delete(Long id) {
        return null;
    }
}
