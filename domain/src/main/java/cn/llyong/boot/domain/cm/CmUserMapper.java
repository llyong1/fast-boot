package cn.llyong.boot.domain.cm;

import cn.llyong.boot.domain.cm.CmUser;
import cn.llyong.boot.domain.cm.CmUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CmUserMapper {
    long countByExample(CmUserExample example);

    int deleteByExample(CmUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmUser record);

    int insertSelective(CmUser record);

    List<CmUser> selectByExampleWithRowbounds(CmUserExample example, RowBounds rowBounds);

    List<CmUser> selectByExample(CmUserExample example);

    CmUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmUser record, @Param("example") CmUserExample example);

    int updateByExample(@Param("record") CmUser record, @Param("example") CmUserExample example);

    int updateByPrimaryKeySelective(CmUser record);

    int updateByPrimaryKey(CmUser record);
}