package cn.llyong.boot.domain.cm;

import cn.llyong.boot.domain.cm.CmRole;
import cn.llyong.boot.domain.cm.CmRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CmRoleMapper {
    long countByExample(CmRoleExample example);

    int deleteByExample(CmRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmRole record);

    int insertSelective(CmRole record);

    List<CmRole> selectByExampleWithRowbounds(CmRoleExample example, RowBounds rowBounds);

    List<CmRole> selectByExample(CmRoleExample example);

    CmRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmRole record, @Param("example") CmRoleExample example);

    int updateByExample(@Param("record") CmRole record, @Param("example") CmRoleExample example);

    int updateByPrimaryKeySelective(CmRole record);

    int updateByPrimaryKey(CmRole record);
}