package com.itangcent.springboot.demo.controller;

import com.itangcent.common.dto.IResult;
import com.itangcent.common.dto.Result;
import com.itangcent.common.dto.UserDto;
import com.itangcent.common.model.UserInfo;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * �û����(�����ļ�)
 *
 * @module user
 */
@RestController
@RequestMapping(value = "file")
public class FileCtrl {
    /**
     * �������û�(�ϴ�ͷ��)
     */
    @PostMapping("/add")
    public IResult add(@ModelAttribute UserDto userDto) {
        return Result.success("����ɹ�");
    }

    /**
     * ��һ���������û�(�ϴ�ͷ��)
     * �ļ�����һ������
     *
     * @undone
     */
    @PostMapping("/add2")
    public IResult add(UserInfo userInfo,
                       @RequestParam(name = "profileImg") MultipartFile profileImg) {
        return Result.success("����ɹ�");
    }

    /**
     * �����ϴ����ͷ��
     *
     * @undone
     */
    @PostMapping("/add3")
    public IResult add(UserInfo userInfo,
                       @RequestParam(name = "profileImg") MultipartFile[] profileImgs) {
        return Result.success("����ɹ�");
    }
}
