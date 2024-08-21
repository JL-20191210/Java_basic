package com.learning.java_basic.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

public class ImmutableCollectionsExample {
    public static void main(String[] args) {
        // 1. List 示例
        // 使用 Collections.unmodifiableList()
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Java");
        mutableList.add("Python");
        mutableList.add("C++");
        List<String> immutableList = Collections.unmodifiableList(mutableList);
        try {
            immutableList.add("JavaScript");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify immutable list");
        }
        System.out.println("Immutable list after modifying original list: " + immutableList);

        // 使用 Java 9+ 的 List.of()
        List<String> immutableListJava9 = List.of("Java", "Python", "C++");
        try {
            immutableListJava9.add("JavaScript");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify immutable list (Java 9+)");
        }
        System.out.println("Immutable list (Java 9+): " + immutableListJava9);

        // 使用 Guava 的 ImmutableList
        ImmutableList<String> guavaImmutableList = ImmutableList.of("Java", "Python", "C++");
        try {
            guavaImmutableList.add("JavaScript");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify Guava immutable list");
        }
        System.out.println("Guava immutable list: " + guavaImmutableList);

        // 2. Set 示例
        // 使用 Collections.unmodifiableSet()
        Set<String> mutableSet = new HashSet<>();
        mutableSet.add("Java");
        mutableSet.add("Python");
        mutableSet.add("C++");
        Set<String> immutableSet = Collections.unmodifiableSet(mutableSet);
        try {
            immutableSet.add("JavaScript");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify immutable set");
        }
        System.out.println("Immutable set after modifying original set: " + immutableSet);

        // 使用 Java 9+ 的 Set.of()
        Set<String> immutableSetJava9 = Set.of("Java", "Python", "C++");
        try {
            immutableSetJava9.add("JavaScript");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify immutable set (Java 9+)");
        }
        System.out.println("Immutable set (Java 9+): " + immutableSetJava9);

        // 使用 Guava 的 ImmutableSet
        ImmutableSet<String> guavaImmutableSet = ImmutableSet.of("Java", "Python", "C++");
        try {
            guavaImmutableSet.add("JavaScript");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify Guava immutable set");
        }
        System.out.println("Guava immutable set: " + guavaImmutableSet);

        // 3. Map 示例
        // 使用 Collections.unmodifiableMap()
        Map<String, String> mutableMap = new HashMap<>();
        mutableMap.put("Java", "Oracle");
        mutableMap.put("Python", "PSF");
        mutableMap.put("C++", "ISO");
        Map<String, String> immutableMap = Collections.unmodifiableMap(mutableMap);
        try {
            immutableMap.put("JavaScript", "TC39");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify immutable map");
        }
        System.out.println("Immutable map after modifying original map: " + immutableMap);

        // 使用 Java 9+ 的 Map.of()
        Map<String, String> immutableMapJava9 = Map.of(
                "Java", "Oracle",
                "Python", "PSF",
                "C++", "ISO"
        );
        try {
            immutableMapJava9.put("JavaScript", "TC39");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify immutable map (Java 9+)");
        }
        System.out.println("Immutable map (Java 9+): " + immutableMapJava9);

        // 使用 Java 9+ 的 Map.ofEntries()
        Map<String, String> immutableMapJava9Entries = Map.ofEntries(
                Map.entry("Java", "Oracle"),
                Map.entry("Python", "PSF"),
                Map.entry("C++", "ISO"),
                Map.entry("JavaScript", "TC39")
        );
        try {
            immutableMapJava9Entries.put("Rust", "Mozilla");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify immutable map created with Map.ofEntries()");
        }
        System.out.println("Immutable map created with Map.ofEntries(): " + immutableMapJava9Entries);

        // 使用 Guava 的 ImmutableMap
        ImmutableMap<String, String> guavaImmutableMap = ImmutableMap.of(
                "Java", "Oracle",
                "Python", "PSF",
                "C++", "ISO"
        );
        try {
            guavaImmutableMap.put("JavaScript", "TC39");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify Guava immutable map");
        }
        System.out.println("Guava immutable map: " + guavaImmutableMap);
    }
}
