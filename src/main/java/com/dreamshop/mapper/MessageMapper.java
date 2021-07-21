package com.dreamshop.mapper;

import com.dreamshop.bean.Message;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MessageMapper {

    @Select("SELECT * FROM message")
    public List<Message> getAllMsg();

    @Select("SELECT * FROM message WHERE id=#{id}")
    public Message getMsgById(Integer id);

    // @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert("INSERT INTO message(name, email, message, datetime) values(#{name},#{email},#{message}, NOW())")
    public void insertMsg(Message msg);

    // @Insert("INSERT INTO message(id, name, email, message, datetime) values(#{id},#{name},#{email},#{message}, NOW())")
    // public void insertMsg(Message msg);

    @Delete("DELETE FROM message WHERE id=#{id}")
    public void deleteMsgById(Integer id);

}
