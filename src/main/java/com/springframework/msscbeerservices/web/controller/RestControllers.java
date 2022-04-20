package com.springframework.msscbeerservices.web.controller;

import com.springframework.msscbeerservices.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class RestControllers {

    @GetMapping("/{beerId")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){

        //todo imp
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){
        //todo imp
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID bberId, BeerDto beerDto){
        //todo Impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
