package com.appdeveloper.app.ws.test;

import java.util.stream.Stream;
import java.util.stream.Collectors;

    public class Test  {


        public static void main(String[] args) {

            System.out.println(reverse("Anirudh"));;
        }
        public static String reverse(String string) {
            return Stream.of(string)
                .map(word->new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
        }
    }