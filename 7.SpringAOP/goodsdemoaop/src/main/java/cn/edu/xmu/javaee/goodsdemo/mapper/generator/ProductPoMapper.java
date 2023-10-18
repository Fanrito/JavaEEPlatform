package cn.edu.xmu.javaee.productdemo.mapper.generator;

import cn.edu.xmu.javaee.productdemo.mapper.generator.po.ProductPo;
import cn.edu.xmu.javaee.productdemo.mapper.generator.po.ProductPoExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface ProductPoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oomall_product
     *
     * @mbg.generated
     */
    @Delete({
        "delete from oomall_product",
        "where `id` = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oomall_product
     *
     * @mbg.generated
     */
    @Insert({
        "insert into oomall_product (`goods_id`, `sku_sn`, ",
        "`name`, `original_price`, ",
        "`weight`, `image_url`, ",
        "`barcode`, `unit`, `origin_place`, ",
        "`creator_id`, `creator_name`, ",
        "`modifier_id`, `modifier_name`, ",
        "`gmt_create`, `gmt_modified`, ",
        "`status`)",
        "values (#{goodsId,jdbcType=BIGINT}, #{skuSn,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{originalPrice,jdbcType=BIGINT}, ",
        "#{weight,jdbcType=BIGINT}, #{imageUrl,jdbcType=VARCHAR}, ",
        "#{barcode,jdbcType=VARCHAR}, #{unit,jdbcType=VARCHAR}, #{originPlace,jdbcType=VARCHAR}, ",
        "#{creatorId,jdbcType=BIGINT}, #{creatorName,jdbcType=VARCHAR}, ",
        "#{modifierId,jdbcType=BIGINT}, #{modifierName,jdbcType=VARCHAR}, ",
        "#{gmtCreate,jdbcType=TIMESTAMP}, #{gmtModified,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(ProductPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oomall_product
     *
     * @mbg.generated
     */
    @InsertProvider(type=ProductPoSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(ProductPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oomall_product
     *
     * @mbg.generated
     */
    @SelectProvider(type=ProductPoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.BIGINT),
        @Result(column="sku_sn", property="skuSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="original_price", property="originalPrice", jdbcType=JdbcType.BIGINT),
        @Result(column="weight", property="weight", jdbcType=JdbcType.BIGINT),
        @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="barcode", property="barcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="unit", property="unit", jdbcType=JdbcType.VARCHAR),
        @Result(column="origin_place", property="originPlace", jdbcType=JdbcType.VARCHAR),
        @Result(column="creator_id", property="creatorId", jdbcType=JdbcType.BIGINT),
        @Result(column="creator_name", property="creatorName", jdbcType=JdbcType.VARCHAR),
        @Result(column="modifier_id", property="modifierId", jdbcType=JdbcType.BIGINT),
        @Result(column="modifier_name", property="modifierName", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT)
    })
    List<ProductPo> selectByExample(ProductPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oomall_product
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "`id`, `goods_id`, `sku_sn`, `name`, `original_price`, `weight`, `image_url`, ",
        "`barcode`, `unit`, `origin_place`, `creator_id`, `creator_name`, `modifier_id`, ",
        "`modifier_name`, `gmt_create`, `gmt_modified`, `status`",
        "from oomall_product",
        "where `id` = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="goods_id", property="goodsId", jdbcType=JdbcType.BIGINT),
        @Result(column="sku_sn", property="skuSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="original_price", property="originalPrice", jdbcType=JdbcType.BIGINT),
        @Result(column="weight", property="weight", jdbcType=JdbcType.BIGINT),
        @Result(column="image_url", property="imageUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="barcode", property="barcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="unit", property="unit", jdbcType=JdbcType.VARCHAR),
        @Result(column="origin_place", property="originPlace", jdbcType=JdbcType.VARCHAR),
        @Result(column="creator_id", property="creatorId", jdbcType=JdbcType.BIGINT),
        @Result(column="creator_name", property="creatorName", jdbcType=JdbcType.VARCHAR),
        @Result(column="modifier_id", property="modifierId", jdbcType=JdbcType.BIGINT),
        @Result(column="modifier_name", property="modifierName", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.TINYINT)
    })
    ProductPo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oomall_product
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ProductPoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") ProductPo row, @Param("example") ProductPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oomall_product
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ProductPoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") ProductPo row, @Param("example") ProductPoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oomall_product
     *
     * @mbg.generated
     */
    @UpdateProvider(type=ProductPoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ProductPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oomall_product
     *
     * @mbg.generated
     */
    @Update({
        "update oomall_product",
        "set `goods_id` = #{goodsId,jdbcType=BIGINT},",
          "`sku_sn` = #{skuSn,jdbcType=VARCHAR},",
          "`name` = #{name,jdbcType=VARCHAR},",
          "`original_price` = #{originalPrice,jdbcType=BIGINT},",
          "`weight` = #{weight,jdbcType=BIGINT},",
          "`image_url` = #{imageUrl,jdbcType=VARCHAR},",
          "`barcode` = #{barcode,jdbcType=VARCHAR},",
          "`unit` = #{unit,jdbcType=VARCHAR},",
          "`origin_place` = #{originPlace,jdbcType=VARCHAR},",
          "`creator_id` = #{creatorId,jdbcType=BIGINT},",
          "`creator_name` = #{creatorName,jdbcType=VARCHAR},",
          "`modifier_id` = #{modifierId,jdbcType=BIGINT},",
          "`modifier_name` = #{modifierName,jdbcType=VARCHAR},",
          "`gmt_create` = #{gmtCreate,jdbcType=TIMESTAMP},",
          "`gmt_modified` = #{gmtModified,jdbcType=TIMESTAMP},",
          "`status` = #{status,jdbcType=TINYINT}",
        "where `id` = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ProductPo row);
}