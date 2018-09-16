package cn.llyong.boot.domain.cm;

import cn.llyong.boot.domain.cm.CmJobLog;
import cn.llyong.boot.domain.cm.CmJobLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CmJobLogMapper {
    long countByExample(CmJobLogExample example);

    int deleteByExample(CmJobLogExample example);

    int deleteByPrimaryKey(Long logId);

    int insert(CmJobLog record);

    int insertSelective(CmJobLog record);

    List<CmJobLog> selectByExampleWithBLOBsWithRowbounds(CmJobLogExample example, RowBounds rowBounds);

    List<CmJobLog> selectByExampleWithBLOBs(CmJobLogExample example);

    List<CmJobLog> selectByExampleWithRowbounds(CmJobLogExample example, RowBounds rowBounds);

    List<CmJobLog> selectByExample(CmJobLogExample example);

    CmJobLog selectByPrimaryKey(Long logId);

    int updateByExampleSelective(@Param("record") CmJobLog record, @Param("example") CmJobLogExample example);

    int updateByExampleWithBLOBs(@Param("record") CmJobLog record, @Param("example") CmJobLogExample example);

    int updateByExample(@Param("record") CmJobLog record, @Param("example") CmJobLogExample example);

    int updateByPrimaryKeySelective(CmJobLog record);

    int updateByPrimaryKeyWithBLOBs(CmJobLog record);

    int updateByPrimaryKey(CmJobLog record);
}