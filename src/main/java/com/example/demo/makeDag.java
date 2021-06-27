package com.example.demo;

import java.util.ArrayList;

public class makeDag {
    public void printAttr(String attr, ArrayList<Dependency> deps) {
        ArrayList<String> res = new ArrayList<>();
        switch (attr) {
            case "id":
                for (Dependency dep: deps) {
                    res.add(Integer.toString(dep.getId()));
                }
            case "name":
                for (Dependency dep: deps) {
                    res.add(dep.getName());
                }

        }
    }
    public static void main(String[] args) {
        ArrayList<Dependency> allDeps = new ArrayList<Dependency>();

        allDeps.add(new Dependency(0, "a"));
        allDeps.add(new Dependency(1, "b"));
        allDeps.add(new Dependency(2, "c"));
        allDeps.add(new Dependency(3, "d"));
        allDeps.add(new Dependency(4, "e"));
        allDeps.add(new Dependency(5, "f"));
        allDeps.add(new Dependency(6, "g"));
        allDeps.add(new Dependency(7, "h"));
        allDeps.add(new Dependency(8, "h"));
        allDeps.add(new Dependency(9, "i"));
        allDeps.add(new Dependency(10, "j"));

        Dependency temp = new Dependency(12, "temp");

        temp.addNode(allDeps.get(0), allDeps.get(1));
        temp.addNode(allDeps.get(0), allDeps.get(2));
        temp.addNode(allDeps.get(0), allDeps.get(3));

        temp.addNode(allDeps.get(1), allDeps.get(4));
        temp.addNode(allDeps.get(1), allDeps.get(5));

        temp.addNode(allDeps.get(2), allDeps.get(6));

        temp.addNode(allDeps.get(5), allDeps.get(7));

        temp.addNode(allDeps.get(6), allDeps.get(8));
        temp.addNode(allDeps.get(6), allDeps.get(9));

        temp.addNode(allDeps.get(7), allDeps.get(10));

        depLocator.path2Root(allDeps, "h");


    }
}
