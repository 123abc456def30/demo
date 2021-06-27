package com.example.demo;

import java.util.ArrayList;

public class depLocator {

    public static ArrayList<Dependency> findPath(ArrayList<Dependency> deps, Dependency end) {
        ArrayList<Dependency> resPath = new ArrayList<Dependency>();
        if (end.getParent() != null) {
            resPath.add(end);
            findPath(deps, end.getParent());
        } else {
            for(Dependency dep: resPath) {
                System.out.println(dep.getName());
            }
        }
        return resPath;
    }

    public static void path2Root(ArrayList<Dependency> deps, String name) {
        ArrayList<Dependency> matches = new ArrayList<Dependency>();
        for (Dependency dep: deps) {
            if(dep.getName() == name) {
                matches.add(dep);
                System.out.println("got one!");
            }
        }
        for (Dependency dep: deps) {
            findPath(deps, dep);
        }
        System.out.println("All Found!");
    }
}