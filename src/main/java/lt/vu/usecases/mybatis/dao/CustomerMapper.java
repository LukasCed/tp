package lt.vu.usecases.mybatis.dao;

import lt.vu.usecases.mybatis.model.Customer;

import java.util.List;

public interface CustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.CUSTOMER
     *
     * @mbg.generated Wed May 08 08:44:06 EEST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.CUSTOMER
     *
     * @mbg.generated Wed May 08 08:44:06 EEST 2019
     */
    int insert(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.CUSTOMER
     *
     * @mbg.generated Wed May 08 08:44:06 EEST 2019
     */
    Customer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.CUSTOMER
     *
     * @mbg.generated Wed May 08 08:44:06 EEST 2019
     */
    List<Customer> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.CUSTOMER
     *
     * @mbg.generated Wed May 08 08:44:06 EEST 2019
     */
    int updateByPrimaryKey(Customer record);
}