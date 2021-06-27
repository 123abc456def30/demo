package com.example.demo;


import java.util.ArrayList;

public class Dependency {
    private String name;
    private int id;
    private Dependency parent;
    ArrayList<Dependency> children = new ArrayList<Dependency>();

    public Dependency(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setParent(Dependency parent) {
        this.parent = parent;
    }

    public Dependency getParent() {
        try {
            return parent;
        } catch (Exception e) {
            return  null;
        }

    }

    public void addChild(Dependency child) {
        this.children.add(child);
    }

    public ArrayList<Dependency> getChildren() {
        return children;
    }

    public void addNode(Dependency parent, Dependency child) {
        child.setParent(parent);
        parent.addChild(child);
        //System.out.println("new node: Parent: " + child.getParent().getName() + " child: " + child.getName());
    }


}
