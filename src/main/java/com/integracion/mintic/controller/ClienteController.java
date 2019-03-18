package com.integracion.mintic.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.integracion.mintic.entities.Cliente;
import com.integracion.mintic.entities.RsCliente;

@RestController
public class ClienteController {

	@RequestMapping(value = "/crearCliente", method = RequestMethod.POST)
	public RsCliente crearCliente(@RequestBody Cliente cliente) {
		return new RsCliente("12345".equals(cliente.getNumDocumento()));
	}
}