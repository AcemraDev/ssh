package cn.unicom.cz.entity;

/**
 * Created by jxisme on 17/10/22.
 */

import lombok.Data;

import javax.persistence.*;
import java.util.HashMap;

/**
 * Created by XRog
 * On 2/2/2017.2:03 PM
 */
@Data
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue
    private Integer role_id;

    @Column(name = "account")

    private String account;

    @Column(name = "area")
    private String area;

    @Column(name = "name")
    private String name;

    @Column(name = "stupa")
    private String stupa;

    @Column(name = "coin")
    private String coin;


    @Column(name = "fs_time")
    private String fs_time;

    @Column(name = "f_status")
    private String f_status;

    @Column(name = "fe_time")
    private String fe_time;

    @Column(name = "ss_time")
    private String ss_time;

    @Column(name = "s_status")
    private String s_status;

    @Column(name = "se_time")
    private String se_time;

    @Column(name = "ts_time")
    private String ts_time;

    @Column(name = "t_status")
    private String t_status;

    @Column(name = "te_time")
    private String te_time;


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStupa() {
        return stupa;
    }

    public void setStupa(String stupa) {
        this.stupa = stupa;
    }

    public String getFs_time() {
        return fs_time;
    }

    public void setFs_time(String fs_time) {
        this.fs_time = fs_time;
    }

    public String getF_status() {
        return f_status;
    }

    public void setF_status(String f_status) {
        this.f_status = f_status;
    }

    public String getFe_time() {
        return fe_time;
    }

    public void setFe_time(String fe_time) {
        this.fe_time = fe_time;
    }

    public String getSs_time() {
        return ss_time;
    }

    public void setSs_time(String ss_time) {
        this.ss_time = ss_time;
    }

    public String getS_status() {
        return s_status;
    }

    public void setS_status(String s_status) {
        this.s_status = s_status;
    }

    public String getSe_time() {
        return se_time;
    }

    public void setSe_time(String se_time) {
        this.se_time = se_time;
    }

    public String getTs_time() {
        return ts_time;
    }

    public void setTs_time(String ts_time) {
        this.ts_time = ts_time;
    }

    public String getT_status() {
        return t_status;
    }

    public void setT_status(String t_status) {
        this.t_status = t_status;
    }

    public String getTe_time() {
        return te_time;
    }

    public void setTe_time(String te_time) {
        this.te_time = te_time;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public  void initRole(HashMap<String,String> ht){
        this.area = ht.get("area");

        this.area = ht.get("account");

        this.name = ht.get("name");

        this.stupa = ht.get("stupa");

        this.fs_time = ht.get("fs_time");

        this.f_status = ht.get("f_status");

        this.fe_time = ht.get("fe_time");

        this.ss_time = ht.get("ss_time");

        this.s_status = ht.get("s_status");

        this.se_time = ht.get("se_time");

        this.ts_time = ht.get("ts_time");

        this.t_status = ht.get("t_status");

        this.te_time = ht.get("te_time");

        this.coin = ht.get("coin");
    }

    @Override
    public String toString() {
        return "Role{" +
                "role_id=" + role_id +
                ", account='" + account + '\'' +
                ", area='" + area + '\'' +
                ", name='" + name + '\'' +
                ", stupa='" + stupa + '\'' +
                ", coin='" + coin + '\'' +
                ", fs_time='" + fs_time + '\'' +
                ", f_status='" + f_status + '\'' +
                ", fe_time='" + fe_time + '\'' +
                ", ss_time='" + ss_time + '\'' +
                ", s_status='" + s_status + '\'' +
                ", se_time='" + se_time + '\'' +
                ", ts_time='" + ts_time + '\'' +
                ", t_status='" + t_status + '\'' +
                ", te_time='" + te_time + '\'' +
                '}';
    }
}
