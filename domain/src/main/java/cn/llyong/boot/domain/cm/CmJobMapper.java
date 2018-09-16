package cn.llyong.boot.domain.cm;

import cn.llyong.boot.domain.cm.CmJob;
import cn.llyong.boot.domain.cm.CmJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CmJobMapper {
    long countByExample(CmJobExample example);

    int deleteByExample(CmJobExample example);

    int deleteByPrimaryKey(Long jobId);

    int insert(CmJob record);

    int insertSelective(CmJob record);

    List<CmJob> selectByExampleWithRowbounds(CmJobExample example, RowBounds rowBounds);

    List<CmJob> selectByExample(CmJobExample example);

    CmJob selectByPrimaryKey(Long jobId);

    int updateByExampleSelective(@Param("record") CmJob record, @Param("example") CmJobExample example);

    int updateByExample(@Param("record") CmJob record, @Param("example") CmJobExample example);

    int updateByPrimaryKeySelective(CmJob record);

    int updateByPrimaryKey(CmJob record);
}