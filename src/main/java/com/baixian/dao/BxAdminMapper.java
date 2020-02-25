package com.baixian.dao;

import com.baixian.vo.BxAdmin;
import com.baixian.vo.BxAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BxAdminMapper {
    int countByExample(BxAdminExample example);

    int deleteByExample(BxAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BxAdmin record);

    int insertSelective(BxAdmin record);

    List<BxAdmin> selectByExample(BxAdminExample example);

    BxAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BxAdmin record, @Param("example") BxAdminExample example);

    int updateByExample(@Param("record") BxAdmin record, @Param("example") BxAdminExample example);

    int updateByPrimaryKeySelective(BxAdmin record);

    int updateByPrimaryKey(BxAdmin record);
}