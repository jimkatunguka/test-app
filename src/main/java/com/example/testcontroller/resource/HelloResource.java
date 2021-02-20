package com.example.testcontroller.resource;

import com.example.testcontroller.model.Widget;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/widgets")
public class HelloResource {
    Map<Integer, Widget> map = new HashMap<>();
    {
        map.put(1, new Widget(1, "first", "my first", 21));
        map.put(2, new Widget(2, "second", "my second", 22));
        map.put(3, new Widget(3, "third", "my third", 23));
        map.put(4, new Widget(4, "fourth", "my fourth", 24));
    }
    @GetMapping
    public String message(){
        return "hello world";
    }

    @GetMapping("/{id}")
    public Widget getJson(@PathVariable int id){
        return map.get(id);
    }
}
