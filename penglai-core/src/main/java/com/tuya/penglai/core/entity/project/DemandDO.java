package com.tuya.penglai.core.entity.project;

/**
 * Created by hyh on 2017/3/31.
 * Description：
 */
public class DemandDO {
    private Integer id;
    private String name;
    private String branchName;
    private String projectId;
    private Integer managerUserId;
    private String groupUserIds;
    private String des;
    private String publishTimePre;
    private Integer status;
    private Integer gmtCreate;
    private Integer gmtModified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Integer getManagerUserId() {
        return managerUserId;
    }

    public void setManagerUserId(Integer managerUserId) {
        this.managerUserId = managerUserId;
    }

    public String getGroupUserIds() {
        return groupUserIds;
    }

    public void setGroupUserIds(String groupUserIds) {
        this.groupUserIds = groupUserIds;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getPublishTimePre() {
        return publishTimePre;
    }

    public void setPublishTimePre(String publishTimePre) {
        this.publishTimePre = publishTimePre;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Integer gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Integer getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Integer gmtModified) {
        this.gmtModified = gmtModified;
    }
}
