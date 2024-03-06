package com.group.employee.service;

import com.group.employee.domain.employee.EmployeeRepository;
import com.group.employee.domain.team.Team;
import com.group.employee.domain.team.TeamRepository;
import com.group.employee.dto.request.TeamCreateRequest;
import com.group.employee.dto.response.EmployeeResponse;
import com.group.employee.dto.response.TeamResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Transactional
    public void saveTeam(TeamCreateRequest request){
        teamRepository.save(new Team(request.getName(),request.getManager(),request.getMemberCount()));
    }
    @Transactional(readOnly = true)
    public List<TeamResponse> getTeams(){
        return teamRepository.findAll()
                .stream().map(TeamResponse::new)
                .collect(Collectors.toList());
    }
}
