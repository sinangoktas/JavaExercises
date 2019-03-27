package com.practices.tij4.Initialisation;

public class PaperCurrencyType {

    enum PaperCurrrency {
        FIVE, TEN, TWENTY, FIFTY, HUNDRED, FIVE_HUNDRED
    }

    public static void main(String[] args) {
        for (PaperCurrrency paperCurrrency : PaperCurrrency.values()) {
            System.out.println(paperCurrrency + " ordinal= " + paperCurrrency.ordinal());

        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        for (PaperCurrrency paperCurrrency : PaperCurrrency.values()) {
            switch (paperCurrrency) {
                case FIVE:
                    System.out.println(String.format("Note: %s", paperCurrrency.toString()));
                    break;
                case TEN:
                    System.out.println(String.format("Note: %s", paperCurrrency.toString()));
                    break;
                case TWENTY:
                    System.out.println(String.format("Note: %s", paperCurrrency.toString()));
                    break;
                case FIFTY:
                    System.out.println(String.format("Note: %s", paperCurrrency.toString()));
                    break;
                case HUNDRED:
                    System.out.println(String.format("Note: %s", paperCurrrency.toString()));
                    break;
                case FIVE_HUNDRED:
                    System.out.println(String.format("Note: %s", paperCurrrency.toString()));
                    break;
                default:
                    System.out.println("Currency is not recognised");
            }

        }

    }
}
