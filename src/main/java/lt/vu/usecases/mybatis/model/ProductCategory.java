package lt.vu.usecases.mybatis.model;

public class ProductCategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.PRODUCTCATEGORY.ID
     *
     * @mbg.generated Wed May 08 08:44:06 EEST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.PRODUCTCATEGORY.NAME
     *
     * @mbg.generated Wed May 08 08:44:06 EEST 2019
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.PRODUCTCATEGORY.ID
     *
     * @return the value of PUBLIC.PRODUCTCATEGORY.ID
     *
     * @mbg.generated Wed May 08 08:44:06 EEST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.PRODUCTCATEGORY.ID
     *
     * @param id the value for PUBLIC.PRODUCTCATEGORY.ID
     *
     * @mbg.generated Wed May 08 08:44:06 EEST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.PRODUCTCATEGORY.NAME
     *
     * @return the value of PUBLIC.PRODUCTCATEGORY.NAME
     *
     * @mbg.generated Wed May 08 08:44:06 EEST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.PRODUCTCATEGORY.NAME
     *
     * @param name the value for PUBLIC.PRODUCTCATEGORY.NAME
     *
     * @mbg.generated Wed May 08 08:44:06 EEST 2019
     */
    public void setName(String name) {
        this.name = name;
    }
}