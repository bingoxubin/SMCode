package com.bingo;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author bingoabin
 * @date 2023/4/7 16:42
 * @Description:
 */
public class Test {
	public static void main(String[] args){
		Stream.of("key1", "key2")
		      .map(key -> Optional.ofNullable("someService.find(key)")
		                          .orElseThrow(() -> new RuntimeException("No entity found with key: " + key)));
	}
}
