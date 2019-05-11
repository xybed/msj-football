package com.msj.football.service;


import com.msj.common.pojo.FootballPlayerCustom;
import com.msj.common.pojo.FootballRankingCustom;

import java.util.List;

public interface FootballService {
    List<FootballRankingCustom> getRanking(Integer leagueId);

    List<FootballPlayerCustom> getTeam(Integer teamId);
}
