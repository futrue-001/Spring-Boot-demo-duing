package service

import mapper.HelloMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class HelloService {

    @Autowired
    HelloMapper mapper;

    void sout() {
       def list =  mapper.studentList();
        println(list)
        println("acacacac")
    }
}
