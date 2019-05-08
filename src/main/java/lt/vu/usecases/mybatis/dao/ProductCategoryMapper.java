package lt.vu.usecases.mybatis.dao;

import java.util.List;

public interface ProductCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PRODUCTCATEGORY
     *
     * @mbg.generated Wed May 08 08:44:06 EEST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PRODUCTCATEGORY
     *
     * @mbg.generated Wed May 08 08:44:06 EEST 2019
     */
    int insert(ProductCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PRODUCTCATEGORY
     *
     * @mbg.generated Wed May 08 08:44:06 EEST 2019
     */
    ProductCategory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PRODUCTCATEGORY
     *
     * @mbg.generated Wed May 08 08:44:06 EEST 2019
     */
    List<ProductCategory> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.PRODUCTCATEGORY
     *
     * @mbg.generated Wed May 08 08:44:06 EEST 2019
     */
    int updateByPrimaryKey(ProductCategory record);
}