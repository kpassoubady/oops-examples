package com.kavinschool.pattern.builder;



public class AddressExternalBuilderDemo {
    public static void main(String[] args) {
        Address homeAddress = AddressBuilder.anAddress()
                .withAddressLine1("100 Fist St")
                .withCity("San Francisco")
                .withState("CA")
                .withZipCode("89089")
                .withCountry("USA").build();
        System.out.println("Home Address:" + homeAddress);
    }
}
