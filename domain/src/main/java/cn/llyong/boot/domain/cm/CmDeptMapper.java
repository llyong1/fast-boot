package cn.llyong.boot.domain.cm;

import cn.llyong.boot.domain.cm.CmDept;
import cn.llyong.boot.domain.cm.CmDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CmDeptMapper {
    long countByExample(CmDeptExample example);

    int deleteByExample(CmDeptExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmDept record);

    int insertSelective(CmDept record);

    List<CmDept> selectByExampleWithRowbounds(CmDeptExample example, RowBounds rowBounds);

    List<CmDept> selectByExample(CmDeptExample example);

    CmDept selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmDept record, @Param("example") CmDeptExample example);

    int updateByExample(@Param("record") CmDept record, @Param("example") CmDeptExample example);

    int updateByPrimaryKeySelective(CmDept record);

    int updateByPrimaryKey(CmDept record);
}