package org.teachplats.mybatis;

import org.apache.ibatis.annotations.Select;
import org.teachplats.model.Country;

public interface CountryMapper {
    @Select("INSERT INTO Countries(NAME) VALUES (#{name});")
    Country insert (String name);
}
