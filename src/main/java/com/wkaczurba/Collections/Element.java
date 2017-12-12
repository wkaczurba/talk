package com.wkaczurba.Collections;

public class Element implements Comparable<Element> {
    private String name;
    private Double value;
    public Element(String name, double value) {
        if (name == null) {
            throw new IllegalArgumentException("Name must not be null");
        }
        this.name= name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Element)) return false;

        Element element = (Element) o;

        if (!name.equals(element.name)) return false;
        return value.equals(element.value);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + value.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return name + " " + value;
    }

    /**
     * Compares by name first, then by value;
     * @param o
     * @return
     */
    @Override
    public int compareTo(Element o) {
        int compareByName = name.compareTo(o.getName());

        if (compareByName != 0)
            return compareByName;
        return value.compareTo(o.getValue());
    }
}