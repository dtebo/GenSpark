package com.example.PartsRegistry.entity;

import javax.persistence.*;

@Entity
@Table(name = "parts")
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "part_name")
    private String partName;

    @Column(name = "part_type")
    private String partType;

    @Column(name = "part_desc")
    private String partDesc;

    @Column(name = "company")
    private String company;

    public Part() {
    }

    public Part(String partName, String partType, String partDesc, String company) {
        this.partName = partName;
        this.partType = partType;
        this.partDesc = partDesc;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    public String getPartDesc() {
        return partDesc;
    }

    public void setPartDesc(String partDesc) {
        this.partDesc = partDesc;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString(){
        return "Part{" +
                "id=" + id +
                ", partName=" + partName + '\'' +
                ", partType=" + partType + '\'' +
                ", partDesc=" + partDesc + '\'' +
                ", company=" + company + '\'' +
                "}";
    }
}
