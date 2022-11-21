/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package tr.com.bilisim.managedbeans;

import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 *
 * @author Mehmet Fatih ÇİN
 */
@ManagedBean
@RequestScoped
@Named
public class LoginManagedBean {

    private String tcNoInfo;
    private String sifreInfo;
    /**
     * Creates a new instance of LoginManagedBean
     */
    public LoginManagedBean() {
    }

    public String getTcNoInfo() {
        return tcNoInfo;
    }

    public void setTcNoInfo(String tcNoInfo) {
        this.tcNoInfo = tcNoInfo;
    }

    public String getSifreInfo() {
        return sifreInfo;
    }

    public void setSifreInfo(String sifreInfo) {
        this.sifreInfo = sifreInfo;
    }
}
