package br.com.herbies;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	private static final String template = "Herbies Endpoint, %s!";	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue="Aprendendo a criar request") String name, String animal) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name), animal="Leão");	
	}
}