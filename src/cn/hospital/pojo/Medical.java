package cn.hospital.pojo;

import java.util.Date;

public class Medical {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_medical.id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_medical.medical_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private Integer medicalId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_medical.patient_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private Integer patientId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_medical.doctor_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private Integer doctorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_medical.drugs_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private Integer drugsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_medical.is_hospitalization
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private int isHospitalization;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_medical.create_date
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_medical.modify_date
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private Date modifyDate;

    /**
     * 病人基本情况
     */
    private String basicInfo;

    /**
     * 药品数量
     */
    private int drugsNum;

    /**
     * 科室名称
     */
    private String sectionName;

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public int getDrugsNum() {
        return drugsNum;
    }

    public void setDrugsNum(int drugsNum) {
        this.drugsNum = drugsNum;
    }

    /**
     * 诊断情况
     */
    private String medicalRecord;

    public int getHospitalization() {
        return isHospitalization;
    }

    public void setHospitalization(int hospitalization) {
        isHospitalization = hospitalization;
    }

    public String getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(String basicInfo) {
        this.basicInfo = basicInfo;
    }

    public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_medical.id
     *
     * @return the value of hospital_medical.id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_medical.id
     *
     * @param id the value for hospital_medical.id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_medical.medical_id
     *
     * @return the value of hospital_medical.medical_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public Integer getMedicalId() {
        return medicalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_medical.medical_id
     *
     * @param medicalId the value for hospital_medical.medical_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setMedicalId(Integer medicalId) {
        this.medicalId = medicalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_medical.patient_id
     *
     * @return the value of hospital_medical.patient_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public Integer getPatientId() {
        return patientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_medical.patient_id
     *
     * @param patientId the value for hospital_medical.patient_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_medical.doctor_id
     *
     * @return the value of hospital_medical.doctor_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public Integer getDoctorId() {
        return doctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_medical.doctor_id
     *
     * @param doctorId the value for hospital_medical.doctor_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_medical.drugs_id
     *
     * @return the value of hospital_medical.drugs_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public Integer getDrugsId() {
        return drugsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_medical.drugs_id
     *
     * @param drugsId the value for hospital_medical.drugs_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setDrugsId(Integer drugsId) {
        this.drugsId = drugsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_medical.is_hospitalization
     *
     * @return the value of hospital_medical.is_hospitalization
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public int getIsHospitalization() {
        return isHospitalization;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_medical.is_hospitalization
     *
     * @param isHospitalization the value for hospital_medical.is_hospitalization
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setIsHospitalization(int isHospitalization) {
        this.isHospitalization = isHospitalization;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_medical.create_date
     *
     * @return the value of hospital_medical.create_date
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_medical.create_date
     *
     * @param createDate the value for hospital_medical.create_date
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_medical.modify_date
     *
     * @return the value of hospital_medical.modify_date
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_medical.modify_date
     *
     * @param modifyDate the value for hospital_medical.modify_date
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}