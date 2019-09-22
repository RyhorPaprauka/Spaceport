package by.itacademy.spaceport.controller;

import by.itacademy.spaceport.order.BuildOrder;
import by.itacademy.spaceport.ship.SpaceShip;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ship")
public class ShipController {

    @PostMapping
    public ResponseEntity<SpaceShip> buildShip(@RequestBody BuildOrder order) {
        return ResponseEntity.ok(
                order.getType().build(
                        order.getParameters()));
    }
}
