package com.nttdata.progmacionfuncional.progfuncional3Taller3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class Progfuncional3Taller3Application {

	public static void main(String[] args) {
		SpringApplication.run(Progfuncional3Taller3Application.class, args);
		Observable<String> messageSender = Observable.just("Mensaje 1", "Mensaje 2", "Mensaje 3");
	    
		messageSender.subscribe(new Observer<String>() {
		        @Override
		        public void onSubscribe(Disposable d) {
		            System.out.println("Observer. Subscribed.");
		        }

		        @Override
		        public void onNext(String s) {
		            System.out.println("Observer. Received: " + s);
		        }

		        @Override
		        public void onError(Throwable e) {
		            System.out.println("Observer. Error: " + e.getMessage());
		        }

		        @Override
		        public void onComplete() {
		            System.out.println("Observer. Completed");
		        }
		    });
		
		
		Flux<String> mensajero = Flux.just("Mensaje 1","Mensaje 2","Mensaje 3");
		
		mensajero.subscribe(m -> System.out.println(("Consumidor.Recibido: ") + m),
				e -> System.out.println("Consumidor.Error:" + e.getMessage()),
				() -> System.out.println("Consumidor.Completed"));
		
		
		
		
	}

}
