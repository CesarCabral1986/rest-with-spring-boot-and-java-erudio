package main;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import calculations.MathCalculations;

@RestController
public class MathController {

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo

	) throws Exception {

		return MathCalculations.sum(numberOne, numberTwo);

	}

	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sub(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo

	) throws Exception {

		return MathCalculations.sub(numberOne, numberTwo);

	}

	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mult(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo

	) throws Exception {

		return MathCalculations.mult(numberOne, numberTwo);

	}

	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo

	) throws Exception {

		return MathCalculations.div(numberOne, numberTwo);

	}

	@RequestMapping(value = "/med/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double med(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo

	) throws Exception {

		return MathCalculations.med(numberOne, numberTwo);

	}

	@RequestMapping(value = "/square/{number}", method = RequestMethod.GET)
	public Double square(@PathVariable(value = "number") String number

	) throws Exception {

		return MathCalculations.square(number);

	}
}
