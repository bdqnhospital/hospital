package cn.hospital.pojo;

import java.util.Date;

public class Section {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_section.id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_section.section_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private Integer sectionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_section.section_name
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private String sectionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_section.create_date
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_section.modify_date
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private Date modifyDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_section.section_desc
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    private String sectionDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_section.id
     *
     * @return the value of hospital_section.id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_section.id
     *
     * @param id the value for hospital_section.id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_section.section_id
     *
     * @return the value of hospital_section.section_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public Integer getSectionId() {
        return sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_section.section_id
     *
     * @param sectionId the value for hospital_section.section_id
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_section.section_name
     *
     * @return the value of hospital_section.section_name
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_section.section_name
     *
     * @param sectionName the value for hospital_section.section_name
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setSectionName(String sectionName) {
        this.sectionName = sectionName == null ? null : sectionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_section.create_date
     *
     * @return the value of hospital_section.create_date
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_section.create_date
     *
     * @param createDate the value for hospital_section.create_date
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_section.modify_date
     *
     * @return the value of hospital_section.modify_date
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_section.modify_date
     *
     * @param modifyDate the value for hospital_section.modify_date
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_section.section_desc
     *
     * @return the value of hospital_section.section_desc
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public String getSectionDesc() {
        return sectionDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_section.section_desc
     *
     * @param sectionDesc the value for hospital_section.section_desc
     *
     * @mbggenerated Tue Jun 25 19:21:00 CST 2019
     */
    public void setSectionDesc(String sectionDesc) {
        this.sectionDesc = sectionDesc == null ? null : sectionDesc.trim();
    }
}