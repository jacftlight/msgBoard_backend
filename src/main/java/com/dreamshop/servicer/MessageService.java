package com.dreamshop.servicer;

import com.dreamshop.bean.Message;
import com.dreamshop.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageMapper messageMapper;

    public List<Message> getAllMsg() {
        List<Message> allMsg = messageMapper.getAllMsg();
        return allMsg;
    }

    public Message getMsgById(Integer id) {
        Message msg = messageMapper.getMsgById(id);
        return msg;
    }

    public void addMsg(Message message) {
        messageMapper.insertMsg(message);
    }

    public void deleteMsg(Integer id) {
        messageMapper.deleteMsgById(id);
    }

}
