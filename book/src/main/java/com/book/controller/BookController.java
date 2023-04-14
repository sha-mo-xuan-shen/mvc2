package com.book.controller;

import com.book.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save==>"+book);
        return "saved";
    }

    @GetMapping
    public List<Book> getAll(){
        List<Book> list = new ArrayList<>();

        Book book1 = new Book();
        book1.setName("龟兔赛跑");
        book1.setType("故事");
        book1.setDescription("兔子大骂王八卷你妈呢");

        Book book2 = new Book();
        book2.setName("阿鲁巴巴与四十大盗");
        book2.setType("故事");
        book2.setDescription("四十大盗找错人全都被阿鲁巴巴阿鲁巴了");
        list.add(book1);
        list.add(book2);
        return list;
    }
}
