package com.group.employee.dto.response;

import com.group.employee.domain.team.Team;

public class TeamResponse {

    private String name;
    private String manager;
    private Integer memberCount;

    protected TeamResponse() {
    }

    public TeamResponse(String name, String manager, Integer memberCount) {
        this.name = name;
        this.manager = manager;
        this.memberCount = memberCount;
    }

    public TeamResponse(Team team) {
        this.name = team.getName();
        this.manager = team.getManager();
        this.memberCount = team.getMemberCount();
    }


    public String getName() {
        return name;
    }

    public String getManager() {
        return manager;
    }

    public Integer getMemberCount() {
        return memberCount;
    }
}
