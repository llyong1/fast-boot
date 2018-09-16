package cn.llyong.boot.domain.cm;

import cn.llyong.boot.domain.cm.CmSeq;
import cn.llyong.boot.domain.cm.CmSeqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CmSeqMapper {
    long countByExample(CmSeqExample example);

    int deleteByExample(CmSeqExample example);

    int deleteByPrimaryKey(String seqType);

    int insert(CmSeq record);

    int insertSelective(CmSeq record);

    List<CmSeq> selectByExampleWithRowbounds(CmSeqExample example, RowBounds rowBounds);

    List<CmSeq> selectByExample(CmSeqExample example);

    CmSeq selectByPrimaryKey(String seqType);

    int updateByExampleSelective(@Param("record") CmSeq record, @Param("example") CmSeqExample example);

    int updateByExample(@Param("record") CmSeq record, @Param("example") CmSeqExample example);

    int updateByPrimaryKeySelective(CmSeq record);

    int updateByPrimaryKey(CmSeq record);
}