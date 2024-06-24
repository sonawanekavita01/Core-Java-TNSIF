package com.tnsif.dayEighteen;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterface {

	public static void main(String[] args) {
		
		//1. Predicate
		Predicate<Integer> predicateObj= (n) -> n>0;
		
		Stream<Integer> numStream=Stream.of(1,2,3,4,-4,-3,6);

		numStream= numStream.filter(predicateObj);
		numStream.forEach(System.out::println);//for (int n: numstream){System.out.print(n);}
		
		//2. Consumer
		Consumer<String> consumerObj=(s) -> System.out.println(s.toUpperCase());
		Stream<String> cityStream=Stream.of("Mumbai","Indore","Pune","Nashik","Delhi","Ahmadnagar");
		cityStream.forEach(consumerObj);
		
		//3.Supplier
		Supplier<Integer> supplierObj=()->{return 10;};
		System.out.println(supplierObj.get());
		
		Supplier<String> suppObj=()->"Hello Kavita";
		System.out.println(suppObj.get());
		
		//4.Function
		Function<String, Integer> getLength=(s)->s.length();
		cityStream=Stream.of("Mumbai","Indore","Pune","Nashik","Delhi","Ahmadnagar");
		
		//map() intermediate function receives Function as parameter
		numStream= cityStream.map(getLength);
		numStream.forEach(System.out::println);
		
		System.out.println("______________________________________________________________");
		
		numStream=Stream.of(1,2,3,4,5);
		
		numStream= numStream.map((n)->n*n*n);
		numStream.forEach(System.out::println);
		
		numStream=Stream.of(1,2,3,4,5);
		System.out.println("______________________________________________________________");
		
		Function<Integer, Double> sqrtFunction=(n)->Math.sqrt(n);
		Stream<Double> sqrtStream=numStream.map(sqrtFunction);
		List<Double> sqrtList=sqrtStream.collect(Collectors.toList());
		
		System.out.println(sqrtList);
		System.out.println("______________________________________________________________");
		
		//5.BiFunction<T, U, R>
		
		//reduce()
		numStream=Stream.of(1,2,3,4,5);
		Optional<Integer> sum=numStream.reduce((a,b)->a+b);
		
		if(sum.isPresent())
			System.out.println("Sum is "+sum);
		
		numStream=Stream.of(10,12,30,14,15);
		Optional<Integer> max=numStream.reduce((a,b)->{
			if(a>b)
				return a;
			else {
				return b;
			}
		});
		
		if(max.isPresent()) {
			System.out.println("Max is "+max);
		}
	
		numStream=Stream.of(10,12,30,14,15);
		Optional<Integer> min=numStream.reduce((a,b)->a<b?a:b);
		
		if(min.isPresent()) {
			System.out.println("Min is "+min);
		}
		
		BinaryOperator<Integer> sumFunction=(a,b)->a+b;
		numStream=Stream.of(10,12,30,14,15);
		sum=numStream.reduce(sumFunction);
		
		if(sum.isPresent()) {
			System.out.println("Sum is "+sum);
		}
	}

}