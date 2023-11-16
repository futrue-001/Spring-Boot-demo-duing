package com.xj.controller;

import com.xj.bean.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@RequestMapping("/student")
@RestController
@Api("学生增删改")
public class StudentController {
    //查询学生
    @GetMapping("")
    @ApiOperation("查询学生接口")
    public String selectStudent() {
        return "select student";
    }

    //去新增学生页面
    @GetMapping("/toSaveView")
    public String toSaveView() {
        return "to save student";
    }

    //新增学生
    @PostMapping("")
    @ApiOperation("学生新增接口")
    public String saveStudent(Student student) {
        return "save student";
    }

    //删除学生
    @DeleteMapping("/{name}")
    @ApiOperation("学生删除接口")
    public String removeStudent(@PathVariable("name") String name) {
        return "remove student";
    }

    //去修改页面
    @GetMapping("/toEditView")
    @ApiIgnore
    public String toEditView() {
        return "to edit student";
    }

    //修改学生信息
    @PutMapping("")
    @ApiOperation("删除学生接口")
    public String editStudent(Student student) {
        return "edit student";
    }


}
