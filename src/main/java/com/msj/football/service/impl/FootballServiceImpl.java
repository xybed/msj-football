package com.msj.football.service.impl;

import com.msj.common.constant.Constants;
import com.msj.common.pojo.FootballPlayerCustom;
import com.msj.common.pojo.FootballRankingCustom;
import com.msj.football.mapper.FootballPlayerCustomMapper;
import com.msj.football.mapper.FootballRankingCustomMapper;
import com.msj.football.service.FootballService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FootballServiceImpl implements FootballService {

    @Resource
    private FootballRankingCustomMapper footballRankingCustomMapper;
    @Resource
    private FootballPlayerCustomMapper footballPlayerCustomMapper;

    @Override
//    @Cacheable(cacheNames = "football.service.getRanking")
    public List<FootballRankingCustom> getRanking(Integer leagueId) {
        List<FootballRankingCustom> rankingList = footballRankingCustomMapper.queryRankingByLeagueId(leagueId);
        for(FootballRankingCustom ranking : rankingList){
            ranking.setLogo(Constants.URL_PREFIX + ranking.getLogo());
        }
        return rankingList;
    }

    @Override
    public List<FootballPlayerCustom> getTeam(Integer teamId) {
        List<FootballPlayerCustom> playerList = footballPlayerCustomMapper.selectByTeamId(teamId);
        for(FootballPlayerCustom player : playerList){
            player.setAvatar(Constants.URL_PREFIX + player.getAvatar());
        }
        return playerList;
    }
}
