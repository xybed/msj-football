package com.msj.football.controller;

import com.msj.common.constant.Result;
import com.msj.common.constant.ResultEnum;
import com.msj.common.constant.ResultGenerator;
import com.msj.football.service.FootballService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/football")
public class FootballController {

    @Resource
    private FootballService footballService;

    @GetMapping("/ranking")
    public Result getRanking(@RequestParam Integer type){
        if(StringUtils.isEmpty(type)){
            return ResultGenerator.genFailResult(ResultEnum.PARAM_ERROR);
        }
        return ResultGenerator.genSuccessResult(footballService.getRanking(type));
    }

    @GetMapping("/team")
    public Result getTeam(@RequestParam(name = "team_id") Integer teamId){
        if(StringUtils.isEmpty(teamId)){
            return ResultGenerator.genFailResult(ResultEnum.PARAM_ERROR);
        }
        return ResultGenerator.genSuccessResult(footballService.getTeam(teamId));
    }
}
