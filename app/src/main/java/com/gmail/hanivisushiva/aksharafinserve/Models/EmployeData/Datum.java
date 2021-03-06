package com.gmail.hanivisushiva.aksharafinserve.Models.EmployeData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("rid")
    @Expose
    private String rid;
    @SerializedName("serivces")
    @Expose
    private String serivces;
    @SerializedName("others")
    @Expose
    private String others;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("client_code")
    @Expose
    private String clientCode;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("contact_person")
    @Expose
    private String contactPerson;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("service_agreement")
    @Expose
    private String serviceAgreement;
    @SerializedName("motp")
    @Expose
    private String motp;
    @SerializedName("motpver")
    @Expose
    private String motpver;
    @SerializedName("eotp")
    @Expose
    private String eotp;
    @SerializedName("eotpver")
    @Expose
    private String eotpver;

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getSerivces() {
        return serivces;
    }

    public void setSerivces(String serivces) {
        this.serivces = serivces;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getServiceAgreement() {
        return serviceAgreement;
    }

    public void setServiceAgreement(String serviceAgreement) {
        this.serviceAgreement = serviceAgreement;
    }

    public String getMotp() {
        return motp;
    }

    public void setMotp(String motp) {
        this.motp = motp;
    }

    public String getMotpver() {
        return motpver;
    }

    public void setMotpver(String motpver) {
        this.motpver = motpver;
    }

    public String getEotp() {
        return eotp;
    }

    public void setEotp(String eotp) {
        this.eotp = eotp;
    }

    public String getEotpver() {
        return eotpver;
    }

    public void setEotpver(String eotpver) {
        this.eotpver = eotpver;
    }

}