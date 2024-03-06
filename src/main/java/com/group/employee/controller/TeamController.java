package com.group.employee.controller;

import com.group.employee.dto.request.TeamCreateRequest;
import com.group.employee.dto.response.TeamResponse;
import com.group.employee.service.TeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }
    @PostMapping("/team")
    public void saveTeam(@RequestBody TeamCreateRequest request){
        teamService.saveTeam(request);
    }
    @GetMapping("/team")
    public List<TeamResponse> getEmployees(){
        return teamService.getTeams();

    }
}
