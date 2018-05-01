package com.example.idea;

public class App {

        public static void main(String[] args) {
            
            String str = "C";
            int value = 0;
            
            switch (str.toLowerCase()) {
                case "a":
                    value = 1;
                    break;
                case "b":
                    value = 2;
                    break;

                    default:
                        value = 3;

            }

            System.out.println(value);



        }

    }

