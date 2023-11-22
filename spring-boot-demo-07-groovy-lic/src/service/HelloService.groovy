package service

import mapper.HelloMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class HelloService {

    @Autowired
    private HelloMapper mapper;

    void sout() {
        def list =  mapper.studentList();
        println(list)
        println("acacacac")
    }
}
