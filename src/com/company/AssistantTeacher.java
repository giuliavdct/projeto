package com.company;

public class AssistantTeacher extends Teacher {
    private int monitoringHours;

    public AssistantTeacher(String name, String lastName, int teacherCode, int employmentPeriod, int monitoringHours) {
        super(name, lastName, teacherCode, employmentPeriod);
        this.monitoringHours = monitoringHours;
    }

    public int getMonitoringHours() {
        return monitoringHours;
    }

    public void setMonitoringHours(int monitoringHours) {
        this.monitoringHours = monitoringHours;
    }
}
