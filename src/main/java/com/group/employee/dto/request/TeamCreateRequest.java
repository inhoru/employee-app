package com.group.employee.dto.request;

public class TeamCreateRequest {
    private String name;
    private String manager;
    private Integer memberCount;

    protected TeamCreateRequest() {
    }

    public TeamCreateRequest(String name, String manager, Integer memberCount) {
        this.name = name;
        this.manager = manager;
        this.memberCount = memberCount;
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

