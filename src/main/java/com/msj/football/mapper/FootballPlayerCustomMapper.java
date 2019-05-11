package com.msj.football.mapper;


import com.msj.common.pojo.FootballPlayerCustom;

import java.util.List;

public interface FootballPlayerCustomMapper {
    List<FootballPlayerCustom> selectByTeamId(Integer teamId);
}
