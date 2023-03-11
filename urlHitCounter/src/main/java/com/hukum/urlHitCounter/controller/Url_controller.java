package com.hukum.urlHitCounter.controller;

import com.hukum.urlHitCounter.model.Url;
import com.hukum.urlHitCounter.sevice.Url_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Url-Hit-Count")
public class Url_controller {
    @Autowired
    private Url_service url_service;
    @GetMapping("/username/{username}/count")
    public Url getCount(@PathVariable String username) {
        Url url=url_service.getUrls(username);
        return url;
    }
}