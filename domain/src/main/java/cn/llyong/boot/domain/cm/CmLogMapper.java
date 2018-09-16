package cn.llyong.boot.domain.cm;

import cn.llyong.boot.domain.cm.CmLog;
import cn.llyong.boot.domain.cm.CmLogExample;
import cn.llyong.boot.domain.cm.CmLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CmLogMapper {
    long countByExample(CmLogExample example);

    int deleteByExample(CmLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CmLogWithBLOBs record);

    int insertSelective(CmLogWithBLOBs record);

    List<CmLogWithBLOBs> selectByExampleWithBLOBsWithRowbounds(CmLogExample example, RowBounds rowBounds);

    List<CmLogWithBLOBs> selectByExampleWithBLOBs(CmLogExample example);

    List<CmLog> selectByExampleWithRowbounds(CmLogExample example, RowBounds rowBounds);

    List<CmLog> selectByExample(CmLogExample example);

    CmLogWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CmLogWithBLOBs record, @Param("example") CmLogExample example);

    int updateByExampleWithBLOBs(@Param("record") CmLogWithBLOBs record, @Param("example") CmLogExample example);

    int updateByExample(@Param("record") CmLog record, @Param("example") CmLogExample example);

    int updateByPrimaryKeySelective(CmLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CmLogWithBLOBs record);

    int updateByPrimaryKey(CmLog record);
}