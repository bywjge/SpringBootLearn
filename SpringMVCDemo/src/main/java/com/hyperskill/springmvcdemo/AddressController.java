package com.hyperskill.springmvcdemo;

import org.springframework.web.bind.annotation.*;

import javax.xml.transform.sax.SAXResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;
import java.util.function.DoublePredicate;
import java.util.function.IntConsumer;
import java.util.function.IntToLongFunction;

@RestController
public class AddressController {
    private ConcurrentMap<String, String> addressBook = new ConcurrentHashMap<>();
//    private Map<String, String> addressBook1 = new HashMap<>();
//    private Map<String, String> addressBook2 = Collections.synchronizedMap(addressBook1);

    @PostMapping("/addresses")
    public void postAddress(@RequestParam String name, @RequestParam String address) {
        addressBook.put(name, address);
    }

    @GetMapping("/addresses/{name}")
    public String getAddress(@PathVariable String name) {
        return addressBook.get(name);
    }


    @DeleteMapping("/addresses")
    public String removeAddress(@RequestParam String name) {
        addressBook.remove(name);
        return name + " removed from address book!";
    }



}
