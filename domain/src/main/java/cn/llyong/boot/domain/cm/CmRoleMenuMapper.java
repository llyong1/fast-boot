package cn.llyong.boot.domain.cm;

import cn.llyong.boot.domain.cm.CmRoleMenu;
import cn.llyong.boot.domain.cm.CmRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CmRoleMenuMapper {
    long countByExample(CmRoleMenuExample example);

    int deleteByExample(CmRoleMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmRoleMenu record);

    int insertSelective(CmRoleMenu record);

    List<CmRoleMenu> selectByExampleWithRowbounds(CmRoleMenuExample example, RowBounds rowBounds);

    List<CmRoleMenu> selectByExample(CmRoleMenuExample example);

    CmRoleMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmRoleMenu record, @Param("example") CmRoleMenuExample example);

    int updateByExample(@Param("record") CmRoleMenu record, @Param("example") CmRoleMenuExample example);

    int updateByPrimaryKeySelective(CmRoleMenu record);

    int updateByPrimaryKey(CmRoleMenu record);
}