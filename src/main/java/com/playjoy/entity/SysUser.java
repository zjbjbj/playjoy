package com.playjoy.entity;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.userid
     *
     * @mbg.generated
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.companyid
     *
     * @mbg.generated
     */
    private String companyid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_code
     *
     * @mbg.generated
     */
    private String userCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_passwd
     *
     * @mbg.generated
     */
    private String userPasswd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.nick_name
     *
     * @mbg.generated
     */
    private String nickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_phone
     *
     * @mbg.generated
     */
    private String userPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.mobile_identity
     *
     * @mbg.generated
     */
    private String mobileIdentity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.mobile_os
     *
     * @mbg.generated
     */
    private String mobileOs;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.client_version
     *
     * @mbg.generated
     */
    private String clientVersion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_email
     *
     * @mbg.generated
     */
    private String userEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_status
     *
     * @mbg.generated
     */
    private String userStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_type
     *
     * @mbg.generated
     */
    private String userType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.photo_filename
     *
     * @mbg.generated
     */
    private String photoFilename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.companyadmin
     *
     * @mbg.generated
     */
    private Boolean companyadmin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.deleteflag
     *
     * @mbg.generated
     */
    private Boolean deleteflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.creator
     *
     * @mbg.generated
     */
    private String creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.updatetime
     *
     * @mbg.generated
     */
    private Date updatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_photo
     *
     * @mbg.generated
     */
    private byte[] userPhoto;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.userid
     *
     * @return the value of sys_user.userid
     *
     * @mbg.generated
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.userid
     *
     * @param userid the value for sys_user.userid
     *
     * @mbg.generated
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.companyid
     *
     * @return the value of sys_user.companyid
     *
     * @mbg.generated
     */
    public String getCompanyid() {
        return companyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.companyid
     *
     * @param companyid the value for sys_user.companyid
     *
     * @mbg.generated
     */
    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_code
     *
     * @return the value of sys_user.user_code
     *
     * @mbg.generated
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_code
     *
     * @param userCode the value for sys_user.user_code
     *
     * @mbg.generated
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_passwd
     *
     * @return the value of sys_user.user_passwd
     *
     * @mbg.generated
     */
    public String getUserPasswd() {
        return userPasswd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_passwd
     *
     * @param userPasswd the value for sys_user.user_passwd
     *
     * @mbg.generated
     */
    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.nick_name
     *
     * @return the value of sys_user.nick_name
     *
     * @mbg.generated
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.nick_name
     *
     * @param nickName the value for sys_user.nick_name
     *
     * @mbg.generated
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_phone
     *
     * @return the value of sys_user.user_phone
     *
     * @mbg.generated
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_phone
     *
     * @param userPhone the value for sys_user.user_phone
     *
     * @mbg.generated
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.mobile_identity
     *
     * @return the value of sys_user.mobile_identity
     *
     * @mbg.generated
     */
    public String getMobileIdentity() {
        return mobileIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.mobile_identity
     *
     * @param mobileIdentity the value for sys_user.mobile_identity
     *
     * @mbg.generated
     */
    public void setMobileIdentity(String mobileIdentity) {
        this.mobileIdentity = mobileIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.mobile_os
     *
     * @return the value of sys_user.mobile_os
     *
     * @mbg.generated
     */
    public String getMobileOs() {
        return mobileOs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.mobile_os
     *
     * @param mobileOs the value for sys_user.mobile_os
     *
     * @mbg.generated
     */
    public void setMobileOs(String mobileOs) {
        this.mobileOs = mobileOs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.client_version
     *
     * @return the value of sys_user.client_version
     *
     * @mbg.generated
     */
    public String getClientVersion() {
        return clientVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.client_version
     *
     * @param clientVersion the value for sys_user.client_version
     *
     * @mbg.generated
     */
    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_email
     *
     * @return the value of sys_user.user_email
     *
     * @mbg.generated
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_email
     *
     * @param userEmail the value for sys_user.user_email
     *
     * @mbg.generated
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_status
     *
     * @return the value of sys_user.user_status
     *
     * @mbg.generated
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_status
     *
     * @param userStatus the value for sys_user.user_status
     *
     * @mbg.generated
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_type
     *
     * @return the value of sys_user.user_type
     *
     * @mbg.generated
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_type
     *
     * @param userType the value for sys_user.user_type
     *
     * @mbg.generated
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.photo_filename
     *
     * @return the value of sys_user.photo_filename
     *
     * @mbg.generated
     */
    public String getPhotoFilename() {
        return photoFilename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.photo_filename
     *
     * @param photoFilename the value for sys_user.photo_filename
     *
     * @mbg.generated
     */
    public void setPhotoFilename(String photoFilename) {
        this.photoFilename = photoFilename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.companyadmin
     *
     * @return the value of sys_user.companyadmin
     *
     * @mbg.generated
     */
    public Boolean getCompanyadmin() {
        return companyadmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.companyadmin
     *
     * @param companyadmin the value for sys_user.companyadmin
     *
     * @mbg.generated
     */
    public void setCompanyadmin(Boolean companyadmin) {
        this.companyadmin = companyadmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.deleteflag
     *
     * @return the value of sys_user.deleteflag
     *
     * @mbg.generated
     */
    public Boolean getDeleteflag() {
        return deleteflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.deleteflag
     *
     * @param deleteflag the value for sys_user.deleteflag
     *
     * @mbg.generated
     */
    public void setDeleteflag(Boolean deleteflag) {
        this.deleteflag = deleteflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.create_date
     *
     * @return the value of sys_user.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.create_date
     *
     * @param createDate the value for sys_user.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.creator
     *
     * @return the value of sys_user.creator
     *
     * @mbg.generated
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.creator
     *
     * @param creator the value for sys_user.creator
     *
     * @mbg.generated
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.updatetime
     *
     * @return the value of sys_user.updatetime
     *
     * @mbg.generated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.updatetime
     *
     * @param updatetime the value for sys_user.updatetime
     *
     * @mbg.generated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_photo
     *
     * @return the value of sys_user.user_photo
     *
     * @mbg.generated
     */
    public byte[] getUserPhoto() {
        return userPhoto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_photo
     *
     * @param userPhoto the value for sys_user.user_photo
     *
     * @mbg.generated
     */
    public void setUserPhoto(byte[] userPhoto) {
        this.userPhoto = userPhoto;
    }
}