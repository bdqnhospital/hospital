package cn.hospital.pojo;

import java.util.Date;

public class Patient {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_patient.id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_patient.patient_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private Integer patientId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_patient.section_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private Integer sectionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_patient.doctor_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private Integer doctorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_patient.patient_name
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private String patientName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_patient.patient_sex
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private String patientSex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_patient.patient_identity
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private String patientIdentity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_patient.patient_mobile
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private String patientMobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_patient.patient_address
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private String patientAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_patient.create_date
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_patient.modify_date
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private Date modifyDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_patient.id
     *
     * @return the value of hospital_patient.id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_patient.id
     *
     * @param id the value for hospital_patient.id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_patient.patient_id
     *
     * @return the value of hospital_patient.patient_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public Integer getPatientId() {
        return patientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_patient.patient_id
     *
     * @param patientId the value for hospital_patient.patient_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_patient.section_id
     *
     * @return the value of hospital_patient.section_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public Integer getSectionId() {
        return sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_patient.section_id
     *
     * @param sectionId the value for hospital_patient.section_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_patient.doctor_id
     *
     * @return the value of hospital_patient.doctor_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public Integer getDoctorId() {
        return doctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_patient.doctor_id
     *
     * @param doctorId the value for hospital_patient.doctor_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_patient.patient_name
     *
     * @return the value of hospital_patient.patient_name
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_patient.patient_name
     *
     * @param patientName the value for hospital_patient.patient_name
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_patient.patient_sex
     *
     * @return the value of hospital_patient.patient_sex
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public String getPatientSex() {
        return patientSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_patient.patient_sex
     *
     * @param patientSex the value for hospital_patient.patient_sex
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex == null ? null : patientSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_patient.patient_identity
     *
     * @return the value of hospital_patient.patient_identity
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public String getPatientIdentity() {
        return patientIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_patient.patient_identity
     *
     * @param patientIdentity the value for hospital_patient.patient_identity
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setPatientIdentity(String patientIdentity) {
        this.patientIdentity = patientIdentity == null ? null : patientIdentity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_patient.patient_mobile
     *
     * @return the value of hospital_patient.patient_mobile
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public String getPatientMobile() {
        return patientMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_patient.patient_mobile
     *
     * @param patientMobile the value for hospital_patient.patient_mobile
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setPatientMobile(String patientMobile) {
        this.patientMobile = patientMobile == null ? null : patientMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_patient.patient_address
     *
     * @return the value of hospital_patient.patient_address
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public String getPatientAddress() {
        return patientAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_patient.patient_address
     *
     * @param patientAddress the value for hospital_patient.patient_address
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress == null ? null : patientAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_patient.create_date
     *
     * @return the value of hospital_patient.create_date
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_patient.create_date
     *
     * @param createDate the value for hospital_patient.create_date
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_patient.modify_date
     *
     * @return the value of hospital_patient.modify_date
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_patient.modify_date
     *
     * @param modifyDate the value for hospital_patient.modify_date
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}