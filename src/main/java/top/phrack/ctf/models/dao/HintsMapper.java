package top.phrack.ctf.models.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.phrack.ctf.pojo.Hints;
import top.phrack.ctf.pojo.HintsExample;

public interface HintsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.hints
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int countByExample(HintsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.hints
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int deleteByExample(HintsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.hints
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.hints
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int insert(Hints record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.hints
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int insertSelective(Hints record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.hints
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    List<Hints> selectByExample(HintsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.hints
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    Hints selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.hints
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int updateByExampleSelective(@Param("record") Hints record, @Param("example") HintsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.hints
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int updateByExample(@Param("record") Hints record, @Param("example") HintsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.hints
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int updateByPrimaryKeySelective(Hints record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.hints
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int updateByPrimaryKey(Hints record);
    
    List<Hints> selectHintsByTaskId(Long id);
    
    List<Hints> selectAll();
    
}