package com.example.study.model.entity;

import com.example.study.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void create(){
        String account="TestUser03";
        String email ="TestUser03@gmail.com";
        String phoneNumber ="010-1111-3333";
        LocalDateTime createdAt=LocalDateTime.now();
        String createdBy="admin";


        userRepository.save(User.builder()
        .account(account)
                        .email(email)
                .phoneNumber(phoneNumber)
                .createdAt(createdAt)
                .createdBy(createdBy)
                .build()
        );
    }

    @Test
    @Transactional
    public void read(){

        //Lambda system
        Optional<User> user = userRepository.findByAccount("TestUser03");

        user.ifPresent(selectUser -> {
            selectUser.getOrderDetailList().stream().forEach(detail ->{
                Item item = detail.getItem();
                System.out.println(item);
            } );

        });

    }

    @Test
    public void update(){
        Optional<User> user = userRepository.findById(2L);

        user.ifPresent(selectUser -> {
            selectUser.setAccount("PPPP");
            selectUser.setCreatedAt(LocalDateTime.now());
            selectUser.setUpdatedBy("김재성");

            userRepository.save(selectUser);
        });
    }

}
