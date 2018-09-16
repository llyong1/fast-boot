package cn.llyong.boot.domain.cm;

import cn.llyong.boot.domain.cm.CmMenu;
import cn.llyong.boot.domain.cm.CmMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CmMenuMapper {
    long countByExample(CmMenuExample example);

    int deleteByExample(CmMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmMenu record);

    int insertSelective(CmMenu record);

    List<CmMenu> selectByExampleWithRowbounds(CmMenuExample example, RowBounds rowBounds);

    List<CmMenu> selectByExample(CmMenuExample example);

    CmMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmMenu record, @Param("example") CmMenuExample example);

    int updateByExample(@Param("record") CmMenu record, @Param("example") CmMenuExample example);

    int updateByPrimaryKeySelective(CmMenu record);

    int updateByPrimaryKey(CmMenu record);
}