package com.company;

public class EmployeesEducation {
    private int year;
    private int vosCount;
    private int vsCount;
    private int zakCount;
    private int soCount;
    private int usoCount;

    public String getRatio(String input) {
        double percent = 0;
        double var1;
        double var2;
        if (input == "ZAK") {
            var1 = getZakCount();
            var2 = getSumOfCounts();
            percent = var1 / var2;
        }
        if (input == "SO") {
            var1 = getSoCount();
            var2 = getSumOfCounts();
            percent = var1 / var2;
        }
        if (input == "USO") {
            var1 = getUsoCount();
            var2 = getSumOfCounts();
            percent = var1 / var2;
        }
        if (input == "VS") {
            var1 = getVsCount();
            var2 = getSumOfCounts();
            percent = var1 / var2;
        }
        if (input == "VOV") {
            var1 = getVosCount();
            var2 = getSumOfCounts();
            percent = var1 / var2;
        }
        return Double.toString(percent);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setVosCount(int vosCount) {
        this.vosCount = vosCount;
    }

    public void setVsCount(int vsCount) {
        this.vsCount = vsCount;
    }

    public void setZakCount(int zakCount) {
        this.zakCount = zakCount;
    }

    public void setSoCount(int soCount) {
        this.soCount = soCount;
    }

    public void setUsoCount(int usoCount) {
        this.usoCount = usoCount;
    }

    public int getYear() {
        return year;
    }

    public int getVosCount() {
        return vosCount;
    }

    public int getVsCount() {
        return vsCount;
    }

    public int getZakCount() {
        return zakCount;
    }

    public int getSoCount() {
        return soCount;
    }

    public int getUsoCount() {
        return usoCount;
    }

    public int getSumOfCounts() {
        return getSoCount() + getZakCount() + getUsoCount() + getVosCount() + getVsCount();
    }
}
