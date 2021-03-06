//package com.stackroute.quizify.recommendationservice.controller;
//
//import com.stackroute.quizify.recommendationservice.domain.Played;
//import com.stackroute.quizify.recommendationservice.domain.SinglePlayer;
//import com.stackroute.quizify.recommendationservice.service.PlayedRelationshipService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/rest/neo4j/played")
//public class PlayedController {
//
//    PlayedRelationshipService playedRelationshipService;
//
//    @Autowired
//    public PlayedController(PlayedRelationshipService playedRelationshipService) {
//        this.playedRelationshipService = playedRelationshipService;
//    }
//
//    @GetMapping("/")
//    public List<Played> getAll(){
//        return playedRelationshipService.getAllRelationships();
//    }
//
//    @PostMapping("/")
//    public Played Create(@RequestBody SinglePlayer singlePlayer){ // @RequestParam("userId") long userId,@RequestParam("gameId") long gameId
//        System.out.println(singlePlayer.getUser().getUserId());
//        return playedRelationshipService.createRelationship(singlePlayer);
//    }
//}
