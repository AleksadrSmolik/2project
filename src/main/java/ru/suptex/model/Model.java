package ru.suptex.model;

import java.util.Objects;

public class Model {
    private int id;
    private String mark;
    private String bodyType;
    private String typeGasolone;


    public Model(String body_type, String type_gosolone) {

    }

    public Model(int id, String mark, String bodyType, String typeGasolone) {
        this.id = id;
        this.mark = mark;
        this.bodyType = bodyType;
        this.typeGasolone = typeGasolone;
    }

    public Model(String mark, String bodyType, String typeGasolone) {
        this.mark = mark;
        this.bodyType = bodyType;
        this.typeGasolone = typeGasolone;
    }

    public int getId() {
        return id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getTypeGasolone() {
        return typeGasolone;
    }

    public void setTypeGasolone(String typeGasolone) {
        this.typeGasolone = typeGasolone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return id == model.id && Objects.equals(mark, model.mark) && Objects.equals(bodyType, model.bodyType) && Objects.equals(typeGasolone, model.typeGasolone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, bodyType, typeGasolone);
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", typeGasolone='" + typeGasolone + '\'' +
                '}';
    }
}


