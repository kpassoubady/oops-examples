package com.kavinschool.pattern.builder;

public final class AddressBuilder {
    private String addressLine2;
    private String country;
    private String addressLine1;
    private String city;
    private String state;
    private String zipCode;

    private AddressBuilder() {
    }

    public static AddressBuilder anAddress() {
        return new AddressBuilder();
    }

    public AddressBuilder withAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    public AddressBuilder withCountry(String country) {
        this.country = country;
        return this;
    }

    public AddressBuilder withAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    public AddressBuilder withCity(String city) {
        this.city = city;
        return this;
    }

    public AddressBuilder withState(String state) {
        this.state = state;
        return this;
    }

    public AddressBuilder withZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public Address build() {
        Address address = new Address(addressLine1, city, state, zipCode);
        address.setAddressLine2(addressLine2);
        address.setCountry(country);
        return address;
    }
}
