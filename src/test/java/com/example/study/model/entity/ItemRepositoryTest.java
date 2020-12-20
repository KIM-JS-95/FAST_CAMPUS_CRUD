package com.example.study.model.entity;

import com.example.study.repository.ItemRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemRepositoryTest {

    @Autowired
    ItemRepository itemRepository;

    @Test
    public void create(){

        String name ="노트북";
        Integer price = 100000;
        String content = "삼성 노트북";

        Item newItem=itemRepository.save(Item.builder()
                .name(name)
                .price(price)
                .content(content)
                .build()
        );
        Assert.assertNotNull(newItem);
    }

    @Test
    public void read(){

        //List system
        List<Item> item = itemRepository.findAll();
        Item itemList = item.get(0);
        System.out.println(itemList);
    }

}
