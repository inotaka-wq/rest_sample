package com.example.rest_sample;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@PostMapping("/greeting_post")
	public Greeting greetingPost(@RequestParam(value = "name", defaultValue = "Post!!") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@PutMapping("/greeting_put")
	public Greeting greetingPut(@RequestParam(value = "name", defaultValue = "Put!!") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@DeleteMapping("/greeting_delete")
	public Greeting greetingDelete(@RequestParam(value = "name", defaultValue = "Delete!!") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}