package com.msj.football.mapper;


import com.msj.common.pojo.FootballRankingCustom;

import java.util.List;

public interface FootballRankingCustomMapper {
    List<FootballRankingCustom> queryRankingByLeagueId(Integer leagueId);
}
