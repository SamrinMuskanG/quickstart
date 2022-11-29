package com.training.ifaces;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface NumberToTextService {

	//numberTotext(4)=>should return four
	public String numberToText(int number);
}
