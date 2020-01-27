package dev.hotel.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.hotel.entite.Chambre;
import dev.hotel.service.ChambreService;

@RestController
@RequestMapping("chambres")
public class ChambreController {

	private ChambreService chambreService;

	@GetMapping
	public List<Chambre> listerChambres() {
		return this.chambreService.listerChambres();

	}

}
