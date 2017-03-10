/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaine;

import java.util.Date;

/**
 *
 * @author SSII-Dev
 */
public class CompteOperation {
    private Personne personne1;
    private String num_operation;
    private Date operation_date;
    private String operation_libelle;
    private String operation_credit;
    private String operation_debit;

    public CompteOperation(Personne personne1, String num_operation, Date operation_date, String operation_libelle, String operation_credit, String operation_debit) {
        this.personne1 = personne1;
        this.num_operation = num_operation;
        this.operation_date = operation_date;
        this.operation_libelle = operation_libelle;
        this.operation_credit = operation_credit;
        this.operation_debit = operation_debit;
    }

    public Personne getPersonne1() {
        return personne1;
    }

    public void setPersonne1(Personne personne1) {
        this.personne1 = personne1;
    }

    public String getNum_operation() {
        return num_operation;
    }

    public void setNum_operation(String num_operation) {
        this.num_operation = num_operation;
    }

    public Date getOperation_date() {
        return operation_date;
    }

    public void setOperation_date(Date operation_date) {
        this.operation_date = operation_date;
    }

    public String getOperation_libelle() {
        return operation_libelle;
    }

    public void setOperation_libelle(String operation_libelle) {
        this.operation_libelle = operation_libelle;
    }

    public String getOperation_credit() {
        return operation_credit;
    }

    public void setOperation_credit(String operation_credit) {
        this.operation_credit = operation_credit;
    }

    public String getOperation_debit() {
        return operation_debit;
    }

    public void setOperation_debit(String operation_debit) {
        this.operation_debit = operation_debit;
    }

}