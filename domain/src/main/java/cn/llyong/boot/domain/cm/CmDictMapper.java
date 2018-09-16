package cn.llyong.boot.domain.cm;

import cn.llyong.boot.domain.cm.CmDict;
import cn.llyong.boot.domain.cm.CmDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CmDictMapper {
    long countByExample(CmDictExample example);

    int deleteByExample(CmDictExample example);

    int deleteByPrimaryKey(Long dictId);

    int insert(CmDict record);

    int insertSelective(CmDict record);

    List<CmDict> selectByExampleWithRowbounds(CmDictExample example, RowBounds rowBounds);

    List<CmDict> selectByExample(CmDictExample example);

    CmDict selectByPrimaryKey(Long dictId);

    int updateByExampleSelective(@Param("record") CmDict record, @Param("example") CmDictExample example);

    int updateByExample(@Param("record") CmDict record, @Param("example") CmDictExample example);

    int updateByPrimaryKeySelective(CmDict record);

    int updateByPrimaryKey(CmDict record);
}