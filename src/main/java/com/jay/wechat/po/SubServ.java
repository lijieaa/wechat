package com.jay.wechat.po;

import java.io.Serializable;

public class SubServ implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_serv.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_serv.app_id
     *
     * @mbggenerated
     */
    private String appId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_serv.expires_in
     *
     * @mbggenerated
     */
    private Integer expiresIn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_serv.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_serv.secret
     *
     * @mbggenerated
     */
    private String secret;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sub_serv.access_token
     *
     * @mbggenerated
     */
    private String accessToken;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sub_serv
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_serv.id
     *
     * @return the value of sub_serv.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_serv.id
     *
     * @param id the value for sub_serv.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_serv.app_id
     *
     * @return the value of sub_serv.app_id
     *
     * @mbggenerated
     */
    public String getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_serv.app_id
     *
     * @param appId the value for sub_serv.app_id
     *
     * @mbggenerated
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_serv.expires_in
     *
     * @return the value of sub_serv.expires_in
     *
     * @mbggenerated
     */
    public Integer getExpiresIn() {
        return expiresIn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_serv.expires_in
     *
     * @param expiresIn the value for sub_serv.expires_in
     *
     * @mbggenerated
     */
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_serv.name
     *
     * @return the value of sub_serv.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_serv.name
     *
     * @param name the value for sub_serv.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_serv.secret
     *
     * @return the value of sub_serv.secret
     *
     * @mbggenerated
     */
    public String getSecret() {
        return secret;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_serv.secret
     *
     * @param secret the value for sub_serv.secret
     *
     * @mbggenerated
     */
    public void setSecret(String secret) {
        this.secret = secret == null ? null : secret.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sub_serv.access_token
     *
     * @return the value of sub_serv.access_token
     *
     * @mbggenerated
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sub_serv.access_token
     *
     * @param accessToken the value for sub_serv.access_token
     *
     * @mbggenerated
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sub_serv
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appId=").append(appId);
        sb.append(", expiresIn=").append(expiresIn);
        sb.append(", name=").append(name);
        sb.append(", secret=").append(secret);
        sb.append(", accessToken=").append(accessToken);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}