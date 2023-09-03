/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.domain.entities.client;

import bank.domain.enums.ClientType;

/**
 *
 * @author junior
 */
abstract public class Client {
    protected final String name;
    protected String phoneNumber;
    protected String email;
    protected final ClientType type;

    public Client(String name, String phoneNumber, String email, ClientType type) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.type = type;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public ClientType getType() {
        return this.type;
    }
}
