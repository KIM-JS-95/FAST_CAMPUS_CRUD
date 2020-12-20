package com.example.study.model.entity;

import com.example.study.repository.OrderDetailRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Test
    public void create(){

        LocalDateTime orderAt=LocalDateTime.now();
        Long userId=1L;
        Long itemId=1L;

//        OrderDetail newOrderDetail =orderDetailRepository.save(OrderDetail.builder()
//                .orderAt(orderAt)
//                .user(userId)
//                .itemId(itemId)
//                .build()
//        );

        //Assert.assertNotNull(newOrderDetail);

    }
}
