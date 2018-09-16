package cn.llyong.boot.domain.cm;

import cn.llyong.boot.domain.cm.CmUserRole;
import cn.llyong.boot.domain.cm.CmUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CmUserRoleMapper {
    long countByExample(CmUserRoleExample example);

    int deleteByExample(CmUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmUserRole record);

    int insertSelective(CmUserRole record);

    List<CmUserRole> selectByExampleWithRowbounds(CmUserRoleExample example, RowBounds rowBounds);

    List<CmUserRole> selectByExample(CmUserRoleExample example);

    CmUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmUserRole record, @Param("example") CmUserRoleExample example);

    int updateByExample(@Param("record") CmUserRole record, @Param("example") CmUserRoleExample example);

    int updateByPrimaryKeySelective(CmUserRole record);

    int updateByPrimaryKey(CmUserRole record);
}