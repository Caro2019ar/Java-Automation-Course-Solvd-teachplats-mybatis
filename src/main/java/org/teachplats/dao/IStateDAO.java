package org.teachplats.dao;

import org.apache.ibatis.annotations.*;
import org.teachplats.model.Country;
import org.teachplats.model.State;

import java.util.List;

public interface IStateDAO<State> extends IBaseDAO<State>{
    State getByName (String name);
    @Insert(" INSERT INTO States (name, country_id) VALUES (#{name}, #{countryId})")
    void create(State state);

    @Select("select * from States where idState = #{id}")
    @Results(value = {
            @Result(property = "id", column = "idState"),
            @Result(property = "name", column = "name"),
            @Result(property = "countryId", column = "country_id"),
    })
    State getById(Long id);
    @Delete("delete from States where idState = #{id}")
    void removeById(Long id);

    void update(State state);

    @Select("Select idState, name from States")
    List<State> getAll();

}
