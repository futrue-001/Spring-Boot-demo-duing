package mapper


import Bean.Student
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface HelloMapper {
    @Select("select * from student")
    List<Student> studentList();
}
