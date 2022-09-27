package org.teachplats.dao;

import org.apache.ibatis.annotations.*;
import org.teachplats.model.Country;
import org.teachplats.model.State;

import java.util.List;

public interface IStateDAO extends IBaseDAO<State>{

    @Insert(" INSERT INTO States (name, country_id) VALUES (#{name}, #{countryId})")
    void create(State state);

    @Select("select idState, name,country_id from States where idState = #{id}")
    @Results(value = {
            @Result(property = "id", column = "idState"),
            @Result(property = "name", column = "name"),
            @Result(property = "countryId", column = "country_id"),
    })
    State getById(Long id);
    @Delete("delete from States where idState = #{id}")
    void removeById(Long id);

    @Update("update States SET name = #{name}, country_id = #{countryId} where idState = #{id}")
    void update(State state);

    @Select("Select idState, name from States")
    List<State> getAll();

}
